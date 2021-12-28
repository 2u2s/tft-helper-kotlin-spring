package org.doubleus.tft_helper_kotlin_spring.dto.riot

import kotlinx.serialization.Serializable

@Serializable
data class TraitDto(
    val name: String,
    val num_units: Int,
    val style: Int,
    val tier_current: Int,
    val tier_total: Int,
)
