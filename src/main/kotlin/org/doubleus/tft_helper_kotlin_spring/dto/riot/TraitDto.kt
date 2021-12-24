package org.doubleus.tft_helper_kotlin_spring.dto.riot

import com.fasterxml.jackson.databind.PropertyNamingStrategies
import com.fasterxml.jackson.databind.annotation.JsonNaming

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy::class)
data class TraitDto(
    val name: String,
    val numUnits: Int,
    val style: Int,
    val tierCurrent: Int,
    val tierTotal: Int,
)
