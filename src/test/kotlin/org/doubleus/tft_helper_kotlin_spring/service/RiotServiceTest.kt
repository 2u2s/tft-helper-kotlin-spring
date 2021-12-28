package org.doubleus.tft_helper_kotlin_spring.service

import org.junit.jupiter.api.Test

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import java.time.LocalDateTime

@SpringBootTest
internal class RiotServiceTest
{
    @Autowired
    private lateinit var riotService: RiotService

    @Test
    fun getChallengerPuuidTest() {
        val challengerLeagueDto = riotService.getChallengerLeagueList()
        assert(challengerLeagueDto.tier == "CHALLENGER")
    }

    @Test
    fun getGrandmasterPuuidTest() {
        val challengerLeagueDto = riotService.getGrandmasterLeagueList()
        assert(challengerLeagueDto.tier == "GRANDMASTER")
    }

    @Test
    fun getMasterPuuidTest() {
        val challengerLeagueDto = riotService.getMasterLeagueList()
        assert(challengerLeagueDto.tier == "MASTER")
    }

    @Test
    fun getMatchInfoTest() {
        val matchDto = riotService.getMatchInfo("KR_5635478208")
        val gameInfo = matchDto.info
        assert(gameInfo.tft_game_type == "standard")
        assert(gameInfo.participants.size == 8)
    }
}