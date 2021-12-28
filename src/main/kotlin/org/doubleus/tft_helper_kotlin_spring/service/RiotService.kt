package org.doubleus.tft_helper_kotlin_spring.service

import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import org.doubleus.tft_helper_kotlin_spring.dto.riot.MatchDto
import org.springframework.stereotype.Service
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse

@Service
class RiotService {

    private val riotDevUrl = "https://asia.api.riotgames.com"

    private val matchPath = "/tft/match/v1/matches"

    private val tempAppKey = "RGAPI-313cd11a-56a0-42cc-acdf-4d4743041aac"

    fun getMatchInfo(matchId: String): MatchDto {
        val matchApiUrl = riotDevUrl + matchPath + "/${matchId}"

        val client = HttpClient.newBuilder().build()
        val request = HttpRequest.newBuilder().uri(URI.create(matchApiUrl)).headers("X-Riot-Token", tempAppKey).build()
        val response = client.send(request, HttpResponse.BodyHandlers.ofString())

        return Json{ ignoreUnknownKeys=true }.decodeFromString(response.body())
    }
}