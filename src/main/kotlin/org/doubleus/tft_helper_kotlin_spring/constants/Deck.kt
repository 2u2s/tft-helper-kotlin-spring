package org.doubleus.tft_helper_kotlin_spring.constants

import org.doubleus.tft_helper_kotlin_spring.constants.TftConstants.Companion.champions

abstract class Deck(
    open val deckChampions: List<Champion>,
) {
    fun getChampionVector(): List<Int> {
        val output = champions.map { 0 }.toMutableList()
        this.deckChampions.forEach { champion ->
            output[champions.indexOf(champion)] += 1
        }
        return output
    }
}

data class ConstantDeck(
    val id: String,
    override val deckChampions: List<Champion>,
    val mainChampions: List<Champion>,
    val mainTraits: List<Pair<String, Int>>,
): Deck(deckChampions)

data class UserDeck(
    override val deckChampions: List<Champion>,
    val traits: List<Pair<String, Int>>,
): Deck(deckChampions)