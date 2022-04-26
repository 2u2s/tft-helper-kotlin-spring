package org.doubleus.tft_helper_kotlin_spring.dto.deck

import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

@Serializable
data class DeckStatisticResultDto(
    val id: String,
) {
    val total = DeckStatisticInfo(0, 0, 0, 0)
    val completed = DeckStatisticInfo(0, 0, 0, 0)


    @Serializable
    data class DeckStatisticInfo(
        var gameCnt: Int,
        var winCnt: Int,
        var top4Cnt: Int,
        var rankSum: Int,
    )

    fun accumulateData(rank: Int, isCompleted: Boolean) {
        total.gameCnt += 1
        total.rankSum += rank
        total.top4Cnt +=  if(rank <= 4) 1 else 0
        total.winCnt += if(rank == 1) 1 else 0
        if (isCompleted) {
            completed.gameCnt += 1
            completed.rankSum += rank
            completed.top4Cnt +=  if(rank <= 4) 1 else 0
            completed.winCnt += if(rank == 1) 1 else 0
        }
    }

    override fun toString(): String = Json.encodeToString(this)
}