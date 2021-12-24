package org.doubleus.tft_helper_kotlin_spring.dto.riot

import com.fasterxml.jackson.databind.PropertyNamingStrategies
import com.fasterxml.jackson.databind.annotation.JsonNaming

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy::class)
data class ParticipantDto(
    val lastRound: Int,
    val level: Int,
    val placement: Int,
    val totalDamageToPlayers: Int,
    val traits: List<TraitDto>,
    val units: List<ChampionDto>,
)