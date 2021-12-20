package org.doubleus.tft_helper_kotlin_spring.constants

data class Trait(
    val id: String,
    val styles: List<TraitStyle>,
)

data class TraitStyle(
    val min: Int,
    val max: Int,
    val style: Int,
) {
    companion object {
        const val BRONZE = 1
        const val SILVER = 2
        const val GOLD = 3
        const val CHROMA = 4
    }
}