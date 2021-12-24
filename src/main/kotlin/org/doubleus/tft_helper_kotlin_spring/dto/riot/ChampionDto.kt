package org.doubleus.tft_helper_kotlin_spring.dto.riot

import com.fasterxml.jackson.databind.PropertyNamingStrategies
import com.fasterxml.jackson.databind.annotation.JsonNaming

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy::class)
data class ChampionDto(
    val characterId: String,
    val items: List<Int>,
    val rarity: Int,
    val tier: Int,
) {
    val cost = rarity + 1
}
