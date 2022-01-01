package org.doubleus.tft_helper_kotlin_spring.dto.deck

import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import org.doubleus.tft_helper_kotlin_spring.constants.ConstantDeck

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

    constructor(constantDeck: ConstantDeck): this(constantDeck.id)

    fun accumulateData(rank: Int, isCompleted: Boolean) {
        total.game_cnt += 1
        total.rank_sum += rank
        total.top4_cnt +=  if(rank <= 4) 1 else 0
        total.win_cnt += if(rank == 1) 1 else 0
        if (isCompleted) {
            completed.game_cnt += 1
            completed.rank_sum += rank
            completed.top4_cnt +=  if(rank <= 4) 1 else 0
            completed.win_cnt += if(rank == 1) 1 else 0
        }
    }

    override fun toString(): String {

        return Json.encodeToString(this)
    }
}