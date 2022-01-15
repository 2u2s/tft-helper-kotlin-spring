package org.doubleus.tft_helper_kotlin_spring.dto.riot.match

import kotlinx.serialization.Serializable
import org.doubleus.tft_helper_kotlin_spring.constant.*
import org.doubleus.tft_helper_kotlin_spring.constant.TftConstants.Companion.championMap

@Serializable
data class ParticipantDto(
    val last_round: Int,
    val level: Int,
    val placement: Int,
    val total_damage_to_players: Int,
    val traits: List<TraitDto>,
    val units: List<ChampionDto>,
) {
    fun toUserDeck(): UserDeck {
        val champions = mutableListOf<Champion>()
        val deckTraits = mutableListOf<TraitInfo>()
        traits.forEach { traitDto -> deckTraits.add(TraitInfo(traitDto.name, traitDto.tier_current)) }
        units.forEach { championDto -> championMap[championDto.character_id]?.let { champion -> champions.add(champion) }  }

        return UserDeck(champions, deckTraits)
    }
}