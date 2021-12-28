package org.doubleus.tft_helper_kotlin_spring.dto.riot.summoner

import kotlinx.serialization.Serializable

@Serializable
data class LeagueListDto(
    val tier: String,
    val entries: List<LeagueItemDto>
)
