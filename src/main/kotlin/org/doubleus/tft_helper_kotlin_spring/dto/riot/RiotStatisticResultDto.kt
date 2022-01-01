package org.doubleus.tft_helper_kotlin_spring.dto.riot

import kotlinx.serialization.Serializable
import org.doubleus.tft_helper_kotlin_spring.dto.deck.DeckStatisticResultDto

@Serializable
data class RiotStatisticResultDto(
    val deckStatistics: List<DeckStatisticResultDto>,
    val recommendedItems: List<ChampionRecommendedItemDto>,
)

@Serializable
data class ChampionRecommendedItemDto(
    val championId: String,
    val itemInfos: List<RecommendedItemInfos>
)

@Serializable
data class RecommendedItemInfos(
    val itemId: Int,
    val cnt: Int,
)