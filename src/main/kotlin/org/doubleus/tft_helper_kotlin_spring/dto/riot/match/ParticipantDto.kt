package org.doubleus.tft_helper_kotlin_spring.dto.riot.match

import kotlinx.serialization.Serializable

@Serializable
data class ParticipantDto(
    val last_round: Int,
    val level: Int,
    val placement: Int,
    val total_damage_to_players: Int,
    val traits: List<TraitDto>,
    val units: List<ChampionDto>,
)