package org.doubleus.tft_helper_kotlin_spring.dto.deck

import kotlinx.serialization.Serializable
import org.doubleus.tft_helper_kotlin_spring.constant.ConstantDeck
import org.doubleus.tft_helper_kotlin_spring.dto.champion.ChampionInfoDto
import org.doubleus.tft_helper_kotlin_spring.dto.trait.TraitInfoDto

@Serializable
data class DeckInfoDto(
    val id: String,
    val champions: List<ChampionInfoDto>,
    val traits: List<TraitInfoDto>,
) {
    constructor(deck: ConstantDeck) : this(deck.id, deck.deckChampions.map { ChampionInfoDto(it) }, deck.traitInfos.map{ TraitInfoDto(it) })
}
