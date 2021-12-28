package org.doubleus.tft_helper_kotlin_spring.dto.riot.match

import kotlinx.serialization.Serializable

@Serializable
data class ChampionDto(
    val character_id: String,
    val items: List<Int>,
    val rarity: Int,
    val tier: Int,
) {
    val cost = rarity + 1
}
