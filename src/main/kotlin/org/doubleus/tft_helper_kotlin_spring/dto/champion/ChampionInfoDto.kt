package org.doubleus.tft_helper_kotlin_spring.dto.champion

import kotlinx.serialization.Serializable
import org.doubleus.tft_helper_kotlin_spring.constant.Champion

@Serializable
data class ChampionInfoDto(
    val id: String,
    val items: List<Int>,
) {
    constructor(champion: Champion): this(champion.id, champion.items)
}
