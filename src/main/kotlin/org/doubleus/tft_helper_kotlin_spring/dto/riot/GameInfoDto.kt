package org.doubleus.tft_helper_kotlin_spring.dto.riot

import com.fasterxml.jackson.databind.PropertyNamingStrategies
import com.fasterxml.jackson.databind.annotation.JsonNaming

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy::class)
data class GameInfoDto(
    val participants: List<ParticipantDto>,
    val gameVariation: Double,
    val tftGameType: String,
)
