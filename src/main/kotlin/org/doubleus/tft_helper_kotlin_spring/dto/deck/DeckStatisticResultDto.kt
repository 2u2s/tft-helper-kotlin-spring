package org.doubleus.tft_helper_kotlin_spring.dto.deck

import kotlinx.serialization.Serializable

@Serializable
data class DeckStatisticResultDto(
    val id: String,
) {
    val total = DeckStatisticInfo(0, 0, 0, 0)
    val completed = DeckStatisticInfo(0, 0, 0, 0)


    @Serializable
    data class DeckStatisticInfo(
        var game_cnt: Int,
        var win_cnt: Int,
        var top4_cnt: Int,
        var rank_sum: Int,
    )
}