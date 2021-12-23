package org.doubleus.tft_helper_kotlin_spring.constants

class TftConstants {
    companion object {
        // TRAITS
        val academy = Trait("Set6_Academy", listOf(TraitStyle(min=2, max=3, style=1), TraitStyle(min=4, max=5, style=2), TraitStyle(min=6, max=7, style=3), TraitStyle(min=8, max=25000, style=4)))
        val arcanist = Trait("Set6_Arcanist", listOf(TraitStyle(min=2, max=3, style=1), TraitStyle(min=4, max=5, style=2), TraitStyle(min=6, max=7, style=3), TraitStyle(min=8, max=25000, style=4)))
        val assassin = Trait("Set6_Assassin", listOf(TraitStyle(min=2, max=3, style=1), TraitStyle(min=4, max=5, style=2), TraitStyle(min=6, max=25000, style=3)))
        val bodyguard = Trait("Set6_Bodyguard", listOf(TraitStyle(min=2, max=3, style=1), TraitStyle(min=4, max=5, style=2), TraitStyle(min=6, max=7, style=3), TraitStyle(min=8, max=9999, style=4)))
        val bruiser = Trait("Set6_Bruiser", listOf(TraitStyle(min=2, max=3, style=1), TraitStyle(min=4, max=5, style=2), TraitStyle(min=6, max=7, style=3), TraitStyle(min=8, max=25000, style=4)))
        val challenger = Trait("Set6_Challenger", listOf(TraitStyle(min=2, max=3, style=1), TraitStyle(min=4, max=5, style=2), TraitStyle(min=6, max=7, style=3), TraitStyle(min=8, max=9999, style=4)))
        val chemtech = Trait("Set6_Chemtech", listOf(TraitStyle(min=3, max=4, style=1), TraitStyle(min=5, max=6, style=2), TraitStyle(min=7, max=8, style=3), TraitStyle(min=9, max=25000, style=4)))
        val clockwork = Trait("Set6_Clockwork", listOf(TraitStyle(min=2, max=3, style=1), TraitStyle(min=4, max=5, style=3), TraitStyle(min=6, max=25000, style=4)))
        val colossus = Trait("Set6_Colossus", listOf(TraitStyle(min=2, max=25000, style=3)))
        val cuddly = Trait("Set6_Cuddly", listOf(TraitStyle(min=1, max=25000, style=3)))
        val enchanter = Trait("Set6_Enchanter", listOf(TraitStyle(min=2, max=2, style=1), TraitStyle(min=3, max=3, style=2), TraitStyle(min=4, max=4, style=3), TraitStyle(min=5, max=9999, style=4)))
        val enforcer = Trait("Set6_Enforcer", listOf(TraitStyle(min=2, max=3, style=1), TraitStyle(min=4, max=25000, style=3)))
        val glutton = Trait("Set6_Glutton", listOf(TraitStyle(min=1, max=25000, style=3)))
        val imperial = Trait("Set6_Imperial", listOf(TraitStyle(min=3, max=4, style=3), TraitStyle(min=5, max=25000, style=4)))
        val innovator = Trait("Set6_Innovator", listOf(TraitStyle(min=3, max=4, style=1), TraitStyle(min=5, max=6, style=3), TraitStyle(min=7, max=25000, style=4)))
        val mercenary = Trait("Set6_Mercenary", listOf(TraitStyle(min=3, max=4, style=1), TraitStyle(min=5, max=6, style=3), TraitStyle(min=7, max=25000, style=4)))
        val mutant = Trait("Set6_Mutant", listOf(TraitStyle(min=3, max=4, style=1), TraitStyle(min=5, max=25000, style=3)))
        val protector = Trait("Set6_Protector", listOf(TraitStyle(min=2, max=2, style=1), TraitStyle(min=3, max=3, style=2), TraitStyle(min=4, max=4, style=3), TraitStyle(min=5, max=25000, style=4)))
        val scholar = Trait("Set6_Scholar", listOf(TraitStyle(min=2, max=3, style=1), TraitStyle(min=4, max=5, style=3), TraitStyle(min=6, max=25000, style=4)))
        val scrap = Trait("Set6_Scrap", listOf(TraitStyle(min=2, max=3, style=1), TraitStyle(min=4, max=5, style=2), TraitStyle(min=6, max=25000, style=3)))
        val sister = Trait("Set6_Sister", listOf(TraitStyle(min=2, max=25000, style=3)))
        val sniper = Trait("Set6_Sniper", listOf(TraitStyle(min=2, max=3, style=1), TraitStyle(min=4, max=5, style=3), TraitStyle(min=6, max=25000, style=4)))
        val socialite = Trait("Set6_Socialite", listOf(TraitStyle(min=1, max=1, style=1), TraitStyle(min=2, max=2, style=2), TraitStyle(min=3, max=25000, style=3)))
        val syndicate = Trait("Set6_Syndicate", listOf(TraitStyle(min=3, max=4, style=1), TraitStyle(min=5, max=6, style=3), TraitStyle(min=7, max=25000, style=4)))
        val transformer = Trait("Set6_Transformer", listOf(TraitStyle(min=1, max=25000, style=3)))
        val twinshot = Trait("Set6_Twinshot", listOf(TraitStyle(min=2, max=3, style=1), TraitStyle(min=4, max=5, style=3), TraitStyle(min=6, max=25000, style=4)))
        val yordle = Trait("Set6_Yordle", listOf(TraitStyle(min=3, max=5, style=1), TraitStyle(min=6, max=25000, style=3)))
        val yordleLord = Trait("Set6_YordleLord", listOf(TraitStyle(min=1, max=25000, style=4)))


        //CHAMPIONS
        val graves = Champion("TFT6_Graves", listOf(academy , twinshot), 1, mutableListOf())
        val singed = Champion("TFT6_Singed", listOf(chemtech, innovator), 1, mutableListOf())
        val twitch = Champion("TFT6_Twitch", listOf(chemtech, assassin), 1, mutableListOf())
        val camille = Champion("TFT6_Camille", listOf(clockwork, challenger), 1, mutableListOf())
        val illaoi = Champion("TFT6_Illaoi", listOf(mercenary, bruiser), 1, mutableListOf())
        val twistedFate = Champion("TFT6_TwistedFate", listOf(syndicate, arcanist), 1, mutableListOf())
        val caitlyn = Champion("TFT6_Caitlyn", listOf(enforcer, sniper), 1, mutableListOf())
        val darius = Champion("TFT6_Darius", listOf(syndicate, bodyguard), 1, mutableListOf())
        val garen = Champion("TFT6_Garen", listOf(academy , protector), 1, mutableListOf())
        val ezreal = Champion("TFT6_Ezreal", listOf(scrap, innovator), 1, mutableListOf())
        val ziggs = Champion("TFT6_Ziggs", listOf(scrap, yordle, arcanist), 1, mutableListOf())
        val poppy = Champion("TFT6_Poppy", listOf(yordle, bodyguard), 1, mutableListOf())
        val kassadin = Champion("TFT6_Kassadin", listOf(mutant, protector), 1, mutableListOf())

        val katarina = Champion("TFT6_Katarina", listOf(academy , assassin), 2, mutableListOf())
        val warwick = Champion("TFT6_Warwick", listOf(chemtech, challenger), 2, mutableListOf())
        val zyra = Champion("TFT6_Zyra", listOf(syndicate, scholar), 2, mutableListOf())
        val swain = Champion("TFT6_Swain", listOf(imperial, arcanist), 2, mutableListOf())
        val vi = Champion("TFT6_Vi", listOf(enforcer, sister, bruiser), 2, mutableListOf())
        val zilean = Champion("TFT6_Zilean", listOf(clockwork, innovator), 2, mutableListOf())
        val blitzcrank = Champion("TFT6_Blitzcrank", listOf(scrap, protector, bodyguard), 2, mutableListOf())
        val trundle = Champion("TFT6_Trundle", listOf(scrap, bruiser), 2, mutableListOf())
        val lulu = Champion("TFT6_Lulu", listOf(yordle, enchanter), 2, mutableListOf())
        val tristana = Champion("TFT6_Tristana", listOf(yordle, sniper), 2, mutableListOf())
        val quinn = Champion("TFT6_Quinn", listOf(mercenary, challenger), 2, mutableListOf())
        val talon = Champion("TFT6_Talon", listOf(imperial, assassin), 2, mutableListOf())
        val kogMaw = Champion("TFT6_KogMaw", listOf(mutant, sniper, twinshot), 2, mutableListOf())

        val leona = Champion("TFT6_Leona", listOf(academy , bodyguard), 3, mutableListOf())
        val lissandra = Champion("TFT6_Lissandra", listOf(chemtech, scholar), 3, mutableListOf())
        val zac = Champion("TFT6_Zac", listOf(chemtech, bruiser), 3, mutableListOf())
        val samira = Champion("TFT6_Samira", listOf(imperial, challenger), 3, mutableListOf())
        val missFortune = Champion("TFT6_MissFortune", listOf(mercenary, sniper), 3, mutableListOf())
        val gangplank = Champion("TFT6_Gangplank", listOf(mercenary, twinshot), 3, mutableListOf())
        val malzahar = Champion("TFT6_Malzahar", listOf(mutant, arcanist), 3, mutableListOf())
        val choGath = Champion("TFT6_ChoGath", listOf(mutant, bruiser, colossus), 3, mutableListOf())
        val vex = Champion("TFT6_Vex", listOf(yordle, arcanist), 3, mutableListOf())
        val heimerdinger = Champion("TFT6_Heimerdinger", listOf(yordle, innovator, scholar), 3, mutableListOf())
        val taric = Champion("TFT6_Taric", listOf(socialite, enchanter), 3, mutableListOf())
        val shaco = Champion("TFT6_Shaco", listOf(syndicate, assassin), 3, mutableListOf())
        val ekko = Champion("TFT6_Ekko", listOf(scrap, assassin), 3, mutableListOf())

        val mundo = Champion("TFT6_DrMundo", listOf(chemtech, mutant, bruiser), 4, mutableListOf())
        val lux = Champion("TFT6_Lux", listOf(academy , arcanist), 4, mutableListOf())
        val yone = Champion("TFT6_Yone", listOf(academy , challenger), 4, mutableListOf())
        val orianna = Champion("TFT6_Orianna", listOf(clockwork, enchanter), 4, mutableListOf())
        val jhin = Champion("TFT6_Jhin", listOf(clockwork, sniper), 4, mutableListOf())
        val seraphine = Champion("TFT6_Seraphine", listOf(socialite, innovator), 4, mutableListOf())
        val sion = Champion("TFT6_Sion", listOf(imperial, protector, colossus), 4, mutableListOf())
        val fiora = Champion("TFT6_Fiora", listOf(enforcer, challenger), 4, mutableListOf())
        val janna = Champion("TFT6_Janna", listOf(scrap, enchanter, scholar), 4, mutableListOf())
        val urgot = Champion("TFT6_Urgot", listOf(chemtech, twinshot), 4, mutableListOf())
        val braum = Champion("TFT6_Braum", listOf(syndicate, bodyguard), 4, mutableListOf())

        val yuumi = Champion("TFT6_Yuumi", listOf(cuddly, academy , scholar), 5, mutableListOf())
        val viktor = Champion("TFT6_Viktor", listOf(chemtech, arcanist), 5, mutableListOf())
        val tahmKench = Champion("TFT6_TahmKench", listOf(mercenary, bruiser, glutton), 5, mutableListOf())
        val jayce = Champion("TFT6_Jayce", listOf(enforcer, innovator, transformer), 5, mutableListOf())
        val galio = Champion("TFT6_Galio", listOf(socialite, bodyguard, colossus), 5, mutableListOf())
        val jinx = Champion("TFT6_Jinx", listOf(scrap, sister, twinshot), 5, mutableListOf())
        val kaisa = Champion("TFT6_Kaisa", listOf(mutant, challenger), 5, mutableListOf())
        val akali = Champion("TFT6_Akali", listOf(syndicate, assassin), 5, mutableListOf())
        val veigar = Champion("TFT6_Veigar", listOf(yordleLord), 5, mutableListOf())


        //ITEMS
        const val bfSword = 1
        const val recurveBow = 2
        const val needlesslyLargeRod = 3
        const val tearOfTheGoddess = 4
        const val chainVest = 5
        const val negatronCloak = 6
        const val giantsBelt = 7
        const val spatula = 8
        const val sparringGloves = 9
        const val deathblade = 11
        const val giantSlayer = 12
        const val hextechGunblade = 13
        const val spearOfShojin = 14
        const val guardianAngel = 15
        const val bloodthirster = 16
        const val zekesHerald = 17
        const val imperialEmblem = 18
        const val infinityEdge = 19
        const val rapidFirecannon = 22
        const val guinsoosRageblade = 23
        const val statikkShiv = 24
        const val titansResolve = 25
        const val runaansHurricane = 26
        const val zzRotPortal = 27
        const val challengerEmblem = 28
        const val lastWhisper = 29
        const val rabadonsDeathcap = 33
        const val archangelsStaff = 34
        const val locketOfTheIronSolari = 35
        const val ionicSpark = 36
        const val morellonomicon = 37
        const val arcanistEmblem = 38
        const val jeweledGauntlet = 39
        const val blueBuff = 44
        const val frozenHeart = 45
        const val chaliceOfPower = 46
        const val redemption = 47
        const val academyEmblem = 48
        const val handOfJustice = 49
        const val brambleVest = 55
        const val gargoyleStoneplate = 56
        const val sunfireCape = 57
        const val bodyguardEmblem = 58
        const val shroudOfStillness = 59
        const val dragonsClaw = 66
        const val zephyr = 67
        const val syndicateEmblem = 68
        const val quicksilver = 69
        const val warmogsArmor = 77
        const val chemtechEmblem = 78
        const val bansheesClaw = 79
        const val tacticiansCrown = 88
        const val assassinEmblem = 89
        const val thiefsGloves = 99
        const val mutantEmblem = 2190
        const val clockworkEmblem = 2191
        const val mercenaryEmblem = 2192
        const val socialiteEmblem = 2193
        const val enforcerEmblem = 2194
        const val scrapEmblem = 2195
        const val protectorEmblem = 2196
        const val bruiserEmblem = 2197
        const val innovatorEmblem = 2198
        const val sniperEmblem = 2199
        const val scholarEmblem = 2200

        val traits: List<Trait> = listOf(
            academy, arcanist, assassin, bodyguard,
            bruiser, challenger, chemtech, clockwork,
            colossus, cuddly, enchanter, enforcer,
            glutton, imperial, innovator, mercenary,
            mutant, protector, scholar, scrap,
            sister, sniper, socialite, syndicate,
            transformer, twinshot, yordle, yordleLord
        )
        val champions: List<Champion> = listOf(
            graves, singed, twitch, camille,
            illaoi, twistedFate, caitlyn, darius,
            garen, ezreal, ziggs, poppy,
            kassadin,

            katarina, warwick, zyra, swain,
            vi, zilean, blitzcrank, trundle,
            lulu, tristana, quinn, talon,
            kogMaw,

            leona, lissandra, zac, samira,
            missFortune, gangplank, malzahar, choGath,
            vex, heimerdinger, taric, shaco,
            ekko,

            mundo, lux, yone, orianna,
            jhin, seraphine, sion, fiora,
            janna, urgot, braum,

            yuumi, viktor, tahmKench, jayce,
            galio, jinx, kaisa, akali,
            veigar,
        )
        val items: List<Int> = listOf(
            bfSword, recurveBow, needlesslyLargeRod, tearOfTheGoddess,
            chainVest, negatronCloak, giantsBelt, spatula,
            sparringGloves,

            deathblade, giantSlayer, hextechGunblade, spearOfShojin,
            guardianAngel, bloodthirster, zekesHerald, imperialEmblem,
            infinityEdge,

            rapidFirecannon, guinsoosRageblade, statikkShiv, titansResolve,
            runaansHurricane, zzRotPortal, challengerEmblem, lastWhisper,

            rabadonsDeathcap, archangelsStaff, locketOfTheIronSolari, ionicSpark,
            morellonomicon, arcanistEmblem, jeweledGauntlet,

            blueBuff, frozenHeart, chaliceOfPower, redemption,
            academyEmblem, handOfJustice,

            brambleVest, gargoyleStoneplate, sunfireCape, bodyguardEmblem,
            shroudOfStillness,

            dragonsClaw, zephyr, syndicateEmblem, quicksilver,

            warmogsArmor, chemtechEmblem, bansheesClaw,

            tacticiansCrown, assassinEmblem,

            thiefsGloves,

            mutantEmblem, clockworkEmblem, mercenaryEmblem, socialiteEmblem,
            enforcerEmblem, scrapEmblem, protectorEmblem, bruiserEmblem,
            innovatorEmblem, sniperEmblem, scholarEmblem,
        )

        val traitMap: Map<String, Trait> = traits.associateBy { trait -> trait.id }
        val championMap: Map<String, Champion> = champions.associateBy { champion -> champion.id }
    }
}