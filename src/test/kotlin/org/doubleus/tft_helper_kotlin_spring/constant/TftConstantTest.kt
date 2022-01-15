package org.doubleus.tft_helper_kotlin_spring.constant

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class TftConstantTest {
    @Test
    fun championToJsonTest() {
        val championWithItem = Champion("test_champion", listOf(), 0, listOf(1, 2, 3))
        println(championWithItem.toJson())
        assert(championWithItem.toJson() == "{\"id\": \"test_champion\", \"items\": [1,2,3]}")
    }
}