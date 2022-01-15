package org.doubleus.tft_helper_kotlin_spring.constant

import org.doubleus.tft_helper_kotlin_spring.constant.TftConstants.Companion.championIndexMap
import org.doubleus.tft_helper_kotlin_spring.constant.TftConstants.Companion.champions
import kotlin.math.sqrt

typealias TraitInfo = Pair<String, Int>

abstract class Deck(
    open val deckChampions: List<Champion>,
) {
    fun getChampionVector(): List<Int> {
        val output = champions.map { 0 }.toMutableList()
        this.deckChampions.forEach { champion ->
            output[championIndexMap[champion.id]!!] += 1
        }
        return output
    }
}

data class ConstantDeck(
    val id: String,
    override val deckChampions: List<Champion>,
    val mainChampions: List<Champion>,
    val mainTraitInfos: List<TraitInfo>,
): Deck(deckChampions) {
    fun getSimilarity(userDeck: UserDeck): Double {
        val myVector = getChampionVector()
        val userVector = userDeck.getChampionVector()
        val innerProduct: Double = myVector.foldIndexed(0.0) { i, acc, _ -> acc + (myVector[i] * userVector[i]) }
        val myVectorLength = sqrt(myVector.fold(0.0) { acc, v -> acc + v })
        val userVectorLength = sqrt(userVector.fold(0.0) { acc, v -> acc + v })

        return sqrt(innerProduct / (myVectorLength * userVectorLength))
    }

    fun hasMainTraits(userDeck: UserDeck): Boolean {
        val userTraitMap = userDeck.traitInfos.toMap()
        var itHas = true
        mainTraitInfos.forEach { mainTrait ->
            itHas = itHas && ((userTraitMap[mainTrait.first]?: 0) >= mainTrait.second)
        }
        return itHas
    }
}

data class UserDeck(
    override val deckChampions: List<Champion>,
    val traitInfos: List<TraitInfo>,
): Deck(deckChampions)