package org.doubleus.tft_helper_kotlin_spring.dto.riot

import kotlinx.serialization.Serializable

@Serializable
data class GameInfoDto(
    val participants: List<ParticipantDto>,
    val game_version: String,
    val tft_game_type: String,
)
