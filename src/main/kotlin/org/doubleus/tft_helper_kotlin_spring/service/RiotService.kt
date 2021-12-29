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

    private val riotAsiaUrl = "https://asia.api.riotgames.com"
    private val riotKrUrl = "https://kr.api.riotgames.com"

    private val leaguePath = "/tft/league/v1"
    private val summonerPath = "/tft/summoner/v1/summoners"
    private val matchPath = "/tft/match/v1/matches"

    private val filePath = "./src/main/assets"
    private val challengerPuuidFileName = "puuids_challenger.txt"
    private val grandmasterPuuidFileName = "puuids_grandmaster.txt"
    //private val masterPuuidFileName = "puuids_master.txt"

    private val tempAppKey = "RGAPI-bf157bfa-2f3e-41f1-87bc-2317703c61fa"
    private val sleepTime = 1200L


    fun getChallengerLeagueList(): LeagueListDto = Json{ ignoreUnknownKeys=true }.decodeFromString(getRiotJsonString("${riotKrUrl}${leaguePath}/challenger"))

    fun getGrandmasterLeagueList(): LeagueListDto = Json{ ignoreUnknownKeys=true }.decodeFromString(getRiotJsonString("${riotKrUrl}${leaguePath}/grandmaster"))

    fun getMasterLeagueList(): LeagueListDto = Json{ ignoreUnknownKeys=true }.decodeFromString(getRiotJsonString("${riotKrUrl}${leaguePath}/master"))

    fun getPuuidById(id: String): String {
        val summonerDto = Json{ ignoreUnknownKeys=true }.decodeFromString<SummonerDto>(getRiotJsonString("${riotKrUrl}${summonerPath}/${id}"))

        return summonerDto.puuid
    }

    fun makePuuidsFile() {
        val challengerPuuidFile = File("${filePath}/${challengerPuuidFileName}")
        val challengerPuuidWriter = FileWriter(challengerPuuidFile)
        val challengers = getChallengerLeagueList().entries
        for (summoner in challengers) {
            challengerPuuidWriter.write("${getPuuidById(summoner.summonerId)}\n")
        }
        challengerPuuidWriter.close()

        val grandmasterPuuidFile = File("${filePath}/${grandmasterPuuidFileName}")
        val grandmasterPuuidWriter = FileWriter(grandmasterPuuidFile)
        val grandmasters = getGrandmasterLeagueList().entries
        for (summoner in grandmasters) {
            grandmasterPuuidWriter.write("${getPuuidById(summoner.summonerId)}\n")
        }
        grandmasterPuuidWriter.close()

        /*
        val masterPuuidFile = File("${filePath}/${masterPuuidFileName}")
        val masterPuuidWriter = FileWriter(masterPuuidFile)
        val masters = getMasterLeagueList().entries
        for (summoner in masters) {
            masterPuuidWriter.write("${getPuuidById(summoner.summonerId)}\n")
        }
        masterPuuidWriter.close()
         */
    }

    fun getTopTierPuuids(): List<String> {
        val puuids = mutableListOf<String>()

        var challengerPuuidFile = File("${filePath}/${challengerPuuidFileName}")
        var grandmasterPuuidFile = File("${filePath}/${grandmasterPuuidFileName}")
        //var masterPuuidFile = File("${filePath}/${masterPuuidFileName}")


        if (!(challengerPuuidFile.isFile && grandmasterPuuidFile.isFile /*&& masterPuuidFile.isFile*/)) {
            makePuuidsFile()
        }
        challengerPuuidFile = File("${filePath}/${challengerPuuidFileName}")
        val challengerPuuids = challengerPuuidFile.readLines().filter { it.isNotEmpty() }
        puuids.addAll(challengerPuuids)

        grandmasterPuuidFile = File("${filePath}/${grandmasterPuuidFileName}")
        val grandmasterPuuids = grandmasterPuuidFile.readLines().filter { it.trim().isNotEmpty() }
        puuids.addAll(grandmasterPuuids)
        /*
        masterPuuidFile = File("${filePath}/${masterPuuidFileName}")
        val masterPuuids = masterPuuidFile.readLines().filter { it.trim().isNotEmpty() }
        puuids.addAll(masterPuuids)
        */
        return puuids
    }

    fun getMatchInfo(matchId: String): MatchDto = Json{ ignoreUnknownKeys=true }.decodeFromString(getRiotJsonString(riotAsiaUrl + matchPath + "/${matchId}"))


    private fun getRiotJsonString(uri: String): String {
        // 오차 감안하여 sleep time에 1 더해줌.
        val endTime = LocalDateTime.now().plusNanos((sleepTime + 1) * 1000_000)

        val client = HttpClient.newBuilder().build()
        val request =
            HttpRequest.newBuilder()
                .uri(URI.create(uri))
                .headers("X-Riot-Token", tempAppKey)
                .build()
        val response = client.send(request, HttpResponse.BodyHandlers.ofString())

        if (response.statusCode() < 200 || response.statusCode() >= 300) {
            when(response.statusCode()) {
                400 -> throw Exception("Bed request.")
                401 -> throw Exception("Unauthorized.")
                403 -> throw Exception("Forbidden. Api key maybe expired.")
                404 -> throw Exception("Data not found.")
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
}