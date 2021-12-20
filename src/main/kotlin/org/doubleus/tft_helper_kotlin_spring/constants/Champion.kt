package org.doubleus.tft_helper_kotlin_spring.constants

data class Champion(
    val id: String,
    val traits: List<Trait>,
    val cost: Int,
    val items: List<Int>,
)
