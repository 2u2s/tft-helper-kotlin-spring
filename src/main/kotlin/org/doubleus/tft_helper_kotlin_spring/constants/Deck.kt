package org.doubleus.tft_helper_kotlin_spring.constants

abstract class Deck(
    open val champions: List<Champion>,
)

data class ConstantDeck(
    val id: String,
    override val champions: List<Champion>,
    val mainChampions: List<Champion>,
    val mainTraits: List<Pair<String, Int>>,
): Deck(champions)

data class UserDeck(
    override val champions: List<Champion>,
    val traits: List<Pair<String, Int>>,
): Deck(champions)