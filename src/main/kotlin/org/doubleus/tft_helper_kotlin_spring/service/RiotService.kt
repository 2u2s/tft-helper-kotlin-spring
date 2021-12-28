package org.doubleus.tft_helper_kotlin_spring.service

import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import org.doubleus.tft_helper_kotlin_spring.dto.riot.match.MatchDto
import org.doubleus.tft_helper_kotlin_spring.dto.riot.summoner.LeagueListDto
import org.doubleus.tft_helper_kotlin_spring.dto.riot.summoner.SummonerDto
import org.springframework.stereotype.Service
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse

@Service
class RiotService {

    private val riotAsiaUrl = "https://asia.api.riotgames.com"
    private val riotKrUrl = "https://kr.api.riotgames.com"

    private val leaguePath = "/tft/league/v1"
    private val summonerPath = "/tft/summoner/v1/summoners"
    private val matchPath = "/tft/match/v1/matches"

    private val tempAppKey = "RGAPI-313cd11a-56a0-42cc-acdf-4d4743041aac"
    private val sleepTime = 1000L


    fun getChallengerLeagueList(): LeagueListDto {
        val response = getRiotHttpResponse("${riotKrUrl}${leaguePath}/challenger")
        Thread.sleep(sleepTime)

        return Json{ ignoreUnknownKeys=true }.decodeFromString(response.body())
    }

    fun getGrandmasterLeagueList(): LeagueListDto {
        val response = getRiotHttpResponse("${riotKrUrl}${leaguePath}/grandmaster")
        Thread.sleep(sleepTime)

        return Json{ ignoreUnknownKeys=true }.decodeFromString(response.body())
    }

    fun getMasterLeagueList(): LeagueListDto {
        val response = getRiotHttpResponse("${riotKrUrl}${leaguePath}/master")
        Thread.sleep(sleepTime)

        return Json{ ignoreUnknownKeys=true }.decodeFromString(response.body())
    }

    fun getPuuidById(puuid: String): String {
        val response = getRiotHttpResponse("${riotKrUrl}${summonerPath}/${puuid}")
        Thread.sleep(sleepTime)
        val summonerDto = Json{ ignoreUnknownKeys=true }.decodeFromString<SummonerDto>(response.body())

        return summonerDto.puuid
    }

    fun getTopTierPuuids(): List<String> {
        val challengers = getChallengerLeagueList().entries
        val grandmasters = getGrandmasterLeagueList().entries
        val masters = getMasterLeagueList().entries

        val puuids = mutableListOf<String>()
        challengers.forEach { summoner -> puuids.add(getPuuidById(summoner.summonerId)) }
        grandmasters.forEach { summoner -> puuids.add(getPuuidById(summoner.summonerId)) }
        masters.forEach { summoner -> puuids.add(getPuuidById(summoner.summonerId)) }

        return puuids
    }

    fun getMatchInfo(matchId: String): MatchDto {
        val response = getRiotHttpResponse(riotAsiaUrl + matchPath + "/${matchId}")
        Thread.sleep(sleepTime)
        return Json{ ignoreUnknownKeys=true }.decodeFromString(response.body())
    }


    private fun getRiotHttpResponse(uri: String): HttpResponse<String> {
        val client = HttpClient.newBuilder().build()
        val request =
            HttpRequest.newBuilder()
                .uri(URI.create(uri))
                .headers("X-Riot-Token", tempAppKey)
                .build()

        return client.send(request, HttpResponse.BodyHandlers.ofString())
    }
}