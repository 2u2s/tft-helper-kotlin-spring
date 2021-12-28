package org.doubleus.tft_helper_kotlin_spring.dto.riot.summoner

import kotlinx.serialization.Serializable

@Serializable
data class SummonerDto(
    val id: String,
    val name: String,
    val puuid: String,
)
