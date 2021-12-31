package org.doubleus.tft_helper_kotlin_spring.service

import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import org.doubleus.tft_helper_kotlin_spring.dto.riot.match.MatchDto
import org.doubleus.tft_helper_kotlin_spring.dto.riot.summoner.LeagueListDto
import org.doubleus.tft_helper_kotlin_spring.dto.riot.summoner.SummonerDto
import org.springframework.stereotype.Service
import java.io.File
import java.io.FileWriter
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse
import java.time.LocalDateTime
import java.time.temporal.ChronoField

@Service
class RiotService {

    private val filePath = "./src/main/assets"
    private val challengerPuuidFileName = "puuids_challenger.txt"
    private val grandmasterPuuidFileName = "puuids_grandmaster.txt"
    //private val masterPuuidFileName = "puuids_master.txt"
    private val matchIdFileName = "match_ids.txt"

    private val tempAppKey = "RGAPI-25033577-fe6d-46c2-8031-c780d4e96e3b"

    val handler = RiotApiHandler(tempAppKey)

    fun makePuuidsFile() {
        saveFile(File("${filePath}/${challengerPuuidFileName}"), handler.getChallengerLeagueList().entries.map{ handler.getPuuidById(it.summonerId) })
        saveFile(File("${filePath}/${grandmasterPuuidFileName}"), handler.getGrandmasterLeagueList().entries.map{ handler.getPuuidById(it.summonerId) })
        // saveFile(File("${filePath}/${masterPuuidFileName}"), getMasterLeagueList().entries.map{ it.summonerId })
    }

    fun getTopTierPuuids(): List<String> {
        val puuids = mutableListOf<String>()

        fun addAllPuuidsOf(file: File) {
            val filePuuids = file.readLines().filter(String::isNotEmpty)
            puuids.addAll(filePuuids)
        }

        val challengerPuuidFile = File("${filePath}/${challengerPuuidFileName}")
        val grandmasterPuuidFile = File("${filePath}/${grandmasterPuuidFileName}")
        //val masterPuuidFile = File("${filePath}/${masterPuuidFileName}")
        if (!(challengerPuuidFile.isFile && grandmasterPuuidFile.isFile /*&& masterPuuidFile.isFile*/)) {
            makePuuidsFile()
        }

        addAllPuuidsOf(File("${filePath}/${challengerPuuidFileName}"))
        addAllPuuidsOf(File("${filePath}/${grandmasterPuuidFileName}"))
        // addAllPuuidsOf(File("${filePath}/${masterPuuidFileName}"))

        return puuids
    }

    fun makeMatchIdsFile() {
        val puuids = getTopTierPuuids()
        val matchIdSet = mutableSetOf<String>()
        puuids.forEach { puuid -> matchIdSet.addAll(handler.getMatchIdsByPuuid(puuid)) }

        saveFile(File("${filePath}/${matchIdFileName}"), matchIdSet)
    }

    private fun saveFile(file: File, lineList: Iterable<String>) {
        val writer = FileWriter(file)
        lineList.forEach{ line -> writer.write("${line}\n")}
        writer.close()
    }


    class RiotApiHandler(
        private val appKey: String
    ) {

        private val riotAsiaUrl = "https://asia.api.riotgames.com"
        private val riotKrUrl = "https://kr.api.riotgames.com"

        private val leaguePath = "/tft/league/v1"
        private val summonerPath = "/tft/summoner/v1/summoners"
        private val matchPath = "/tft/match/v1/matches"

        private val sleepTime = 1200L

        private fun getRiotJsonString(uri: String, alternative: String = ""): String {
            val client = HttpClient.newBuilder().build()
            val request =
                HttpRequest.newBuilder()
                    .uri(URI.create(uri))
                    .headers("X-Riot-Token", appKey)
                    .build()

            // 오차 감안하여 sleep time에 2 더해줌.
            val endTime = LocalDateTime.now().plusNanos((sleepTime + 2) * 1000_000)

            val response = client.send(request, HttpResponse.BodyHandlers.ofString())
            if (response.statusCode() < 200 || response.statusCode() >= 300) {
                when(response.statusCode()) {
                    400 -> throw Exception("Bed request.")
                    401 -> throw Exception("Unauthorized.")
                    403 -> throw Exception("Forbidden. Api key maybe expired.")
                    404 -> throw Exception("Data not found.")
                    429 -> return alternative // Api rate limit exceeding error. Should be ignored.
                    else -> throw Exception("Not normal status. status ${response.statusCode()}.")
                }
            }

            val now = LocalDateTime.now()

            if (now.isBefore(endTime)) {
                val endTimeMilli = endTime.getLong(ChronoField.MILLI_OF_DAY)
                val nowMilli = now.getLong(ChronoField.MILLI_OF_DAY)
                Thread.sleep((endTimeMilli - nowMilli) % (24 * 60 * 60 * 1000))
            }
            return response.body()
        }

        fun getChallengerLeagueList(): LeagueListDto = Json{ ignoreUnknownKeys=true }.decodeFromString(getRiotJsonString("${riotKrUrl}${leaguePath}/challenger"))

        fun getGrandmasterLeagueList(): LeagueListDto = Json{ ignoreUnknownKeys=true }.decodeFromString(getRiotJsonString("${riotKrUrl}${leaguePath}/grandmaster"))

        fun getMasterLeagueList(): LeagueListDto = Json{ ignoreUnknownKeys=true }.decodeFromString(getRiotJsonString("${riotKrUrl}${leaguePath}/master"))

        fun getPuuidById(id: String): String = Json{ ignoreUnknownKeys=true }.decodeFromString<SummonerDto>(getRiotJsonString("${riotKrUrl}${summonerPath}/${id}")).puuid

        fun getMatchIdsByPuuid(puuid: String): List<String> = Json{ ignoreUnknownKeys=true }.decodeFromString(getRiotJsonString("${riotAsiaUrl}${matchPath}/by-puuid/${puuid}/ids", "[]"))

        fun getMatchInfo(matchId: String): MatchDto = Json{ ignoreUnknownKeys=true }.decodeFromString(getRiotJsonString("${riotAsiaUrl}${matchPath}/${matchId}"))
    }
}