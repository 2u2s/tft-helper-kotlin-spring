package org.doubleus.tft_helper_kotlin_spring.dto.riot.summoner

import kotlinx.serialization.Serializable

@Serializable
data class LeagueItemDto(
    val summonerId: String,
    val summonerName: String,
)
