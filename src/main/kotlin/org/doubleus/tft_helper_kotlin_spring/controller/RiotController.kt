package org.doubleus.tft_helper_kotlin_spring.controller

import org.doubleus.tft_helper_kotlin_spring.service.RiotService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class RiotController(
    private val riotService: RiotService
) {
    @GetMapping("", "/")
    fun hello(): String {
        return "hello"
    }

    @GetMapping("/deckInfo")
    fun getDeckInfo() = riotService.getDeckInfo()

    @GetMapping("/statistics")
    fun getStatistics() = riotService.getStatistics()
}