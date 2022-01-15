package org.doubleus.tft_helper_kotlin_spring.constant

data class Champion(
    val id: String,
    val traits: List<Trait>,
    val cost: Int,
    val items: List<Int>,
) {
    constructor(id: String, traits: List<Trait>, cost: Int) : this(id, traits, cost, listOf())

    fun with(items: List<Int>) = Champion(id, traits, cost, items)

    fun with(vararg items: Int) = with(items.toList())

    fun toJson(): String = "{\"id\": \"${id}\", \"items\": [${items.foldIndexed("") { i, acc, v -> "${acc}${if(i != 0) "," else ""}${v}" }}]}"
}
