package org.doubleus.tft_helper_kotlin_spring.dto.trait

import kotlinx.serialization.Serializable
import org.doubleus.tft_helper_kotlin_spring.constant.TraitInfo

@Serializable
data class TraitInfoDto(
    val id: String,
    val tierCurrent: Int,
) {
    constructor(traitInfo: TraitInfo): this(traitInfo.id, traitInfo.value)
}
