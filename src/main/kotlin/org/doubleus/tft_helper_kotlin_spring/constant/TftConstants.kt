package org.doubleus.tft_helper_kotlin_spring.constant

class TftConstants {
    companion object {
        //ITEMS
        private const val bfSword           =    1
        private const val recurveBow        =    2
        private const val largeRod          =    3
        private const val tearOfTheGoddess  =    4
        private const val chainVest         =    5
        private const val negatronCloak     =    6
        private const val giantsBelt        =    7
        private const val spatula           =    8
        private const val sparringGloves    =    9
        private const val deathblade        =   11
        private const val giantSlayer       =   12
        private const val hextechGunblade   =   13
        private const val shojin            =   14
        private const val guardianAngel     =   15
        private const val bloodthirster     =   16
        private const val zekesHerald       =   17
        private const val imperialEmblem    =   18
        private const val infinityEdge      =   19
        private const val rapidFirecannon   =   22
        private const val guinsoo           =   23
        private const val statikkShiv       =   24
        private const val titansResolve     =   25
        private const val runaan            =   26
        private const val zzRotPortal       =   27
        private const val challengerEmblem  =   28
        private const val lastWhisper       =   29
        private const val rabadon           =   33
        private const val archangelsStaff   =   34
        private const val solari            =   35
        private const val ionicSpark        =   36
        private const val morellonomicon    =   37
        private const val arcanistEmblem    =   38
        private const val jeweledGauntlet   =   39
        private const val blueBuff          =   44
        private const val frozenHeart       =   45
        private const val chaliceOfPower    =   46
        private const val redemption        =   47
        private const val academyEmblem     =   48
        private const val handOfJustice     =   49
        private const val brambleVest       =   55
        private const val gargoyle          =   56
        private const val sunfireCape       =   57
        private const val bodyguardEmblem   =   58
        private const val shroudOfStillness =   59
        private const val dragonsClaw       =   66
        private const val zephyr            =   67
        private const val syndicateEmblem   =   68
        private const val quicksilver       =   69
        private const val warmog            =   77
        private const val chemtechEmblem    =   78
        private const val bansheesClaw      =   79
        private const val tacticiansCrown   =   88
        private const val assassinEmblem    =   89
        private const val thiefsGloves      =   99
        private const val mutantEmblem      = 2190
        private const val clockworkEmblem   = 2191
        private const val mercenaryEmblem   = 2192
        private const val socialiteEmblem   = 2193
        private const val enforcerEmblem    = 2194
        private const val scrapEmblem       = 2195
        private const val protectorEmblem   = 2196
        private const val bruiserEmblem     = 2197
        private const val innovatorEmblem   = 2198
        private const val sniperEmblem      = 2199
        private const val scholarEmblem     = 2200

        val items: List<Int> = listOf(
            bfSword,            recurveBow,         largeRod,           tearOfTheGoddess,
            chainVest,          negatronCloak,      giantsBelt,         spatula,
            sparringGloves,

            deathblade,         giantSlayer,        hextechGunblade,    shojin,
            guardianAngel,      bloodthirster,      zekesHerald,        imperialEmblem,
            infinityEdge,

            rapidFirecannon,    guinsoo,            statikkShiv,        titansResolve,
            runaan,             zzRotPortal,        challengerEmblem,   lastWhisper,

            rabadon,            archangelsStaff,    solari,             ionicSpark,
            morellonomicon,     arcanistEmblem,     jeweledGauntlet,

            blueBuff,           frozenHeart,        chaliceOfPower,     redemption,
            academyEmblem,      handOfJustice,

            brambleVest,        gargoyle,           sunfireCape,        bodyguardEmblem,
            shroudOfStillness,

            dragonsClaw,        zephyr,             syndicateEmblem,    quicksilver,

            warmog,             chemtechEmblem,     bansheesClaw,

            tacticiansCrown,    assassinEmblem,

            thiefsGloves,

            mutantEmblem,       clockworkEmblem,    mercenaryEmblem,    socialiteEmblem,
            enforcerEmblem,     scrapEmblem,        protectorEmblem,    bruiserEmblem,
            innovatorEmblem,    sniperEmblem,       scholarEmblem,
        )


        // TRAITS
        private val academy = Trait(
            "Set6_Academy",
            listOf(
                TraitStyle(style=1, min=2, max=3),
                TraitStyle(style=2, min=4, max=5),
                TraitStyle(style=3, min=6, max=7),
                TraitStyle(style=4, min=8, max=25000)
            )
        )
        private val arcanist = Trait(
            "Set6_Arcanist",
            listOf(
                TraitStyle(style=1, min=2, max=3),
                TraitStyle(style=2, min=4, max=5),
                TraitStyle(style=3, min=6, max=7),
                TraitStyle(style=4, min=8, max=25000)
            )
        )
        private val assassin = Trait(
            "Set6_Assassin",
            listOf(
                TraitStyle(style=1, min=2, max=3),
                TraitStyle(style=2, min=4, max=5),
                TraitStyle(style=3, min=6, max=25000)
            )
        )
        private val bodyguard = Trait(
            "Set6_Bodyguard",
            listOf(
                TraitStyle(style=1, min=2, max=3),
                TraitStyle(style=2, min=4, max=5),
                TraitStyle(style=3, min=6, max=7),
                TraitStyle(style=4, min=8, max=9999)
            )
        )
        private val bruiser = Trait(
            "Set6_Bruiser",
            listOf(
                TraitStyle(style=1, min=2, max=3),
                TraitStyle(style=2, min=4, max=5),
                TraitStyle(style=3, min=6, max=7),
                TraitStyle(style=4, min=8, max=25000)
            )
        )
        private val challenger = Trait(
            "Set6_Challenger",
            listOf(
                TraitStyle(style=1, min=2, max=3),
                TraitStyle(style=2, min=4, max=5),
                TraitStyle(style=3, min=6, max=7),
                TraitStyle(style=4, min=8, max=9999)
            )
        )
        private val chemtech = Trait(
            "Set6_Chemtech",
            listOf(
                TraitStyle(style=1, min=3, max=4),
                TraitStyle(style=2, min=5, max=6),
                TraitStyle(style=3, min=7, max=8),
                TraitStyle(style=4, min=9, max=25000)
            )
        )
        private val clockwork = Trait(
            "Set6_Clockwork",
            listOf(
                TraitStyle(style=1, min=2, max=3),
                TraitStyle(style=3, min=4, max=5),
                TraitStyle(style=4, min=6, max=25000)
            )
        )
        private val colossus = Trait(
            "Set6_Colossus",
            listOf(
                TraitStyle(style=3, min=2, max=25000)
            )
        )
        private val cuddly = Trait(
            "Set6_Cuddly",
            listOf(
                TraitStyle(style=3, min=1, max=25000)
            )
        )
        private val enchanter = Trait(
            "Set6_Enchanter",
            listOf(
                TraitStyle(style=1, min=2, max=2),
                TraitStyle(style=2, min=3, max=3),
                TraitStyle(style=3, min=4, max=4),
                TraitStyle(style=4, min=5, max=9999)
            )
        )
        private val enforcer = Trait(
            "Set6_Enforcer",
            listOf(
                TraitStyle(style=1, min=2, max=3),
                TraitStyle(style=3, min=4, max=25000)
            )
        )
        private val glutton = Trait(
            "Set6_Glutton",
            listOf(
                TraitStyle(style=3, min=1, max=25000)
            )
        )
        private val imperial = Trait(
            "Set6_Imperial",
            listOf(
                TraitStyle(style=3, min=3, max=4),
                TraitStyle(style=4, min=5, max=25000)
            )
        )
        private val innovator = Trait(
            "Set6_Innovator",
            listOf(
                TraitStyle(style=1, min=3, max=4),
                TraitStyle(style=3, min=5, max=6),
                TraitStyle(style=4, min=7, max=25000)
            )
        )
        private val mercenary = Trait(
            "Set6_Mercenary",
            listOf(
                TraitStyle(style=1, min=3, max=4),
                TraitStyle(style=3, min=5, max=6),
                TraitStyle(style=4, min=7, max=25000)
            )
        )
        private val mutant = Trait(
            "Set6_Mutant",
            listOf(
                TraitStyle(style=1, min=3, max=4),
                TraitStyle(style=3, min=5, max=25000)
            )
        )
        private val protector = Trait(
            "Set6_Protector",
            listOf(
                TraitStyle(style=1, min=2, max=2),
                TraitStyle(style=2, min=3, max=3),
                TraitStyle(style=3, min=4, max=4),
                TraitStyle(style=4, min=5, max=25000)
            )
        )
        private val scholar = Trait(
            "Set6_Scholar",
            listOf(
                TraitStyle(style=1, min=2, max=3),
                TraitStyle(style=3, min=4, max=5),
                TraitStyle(style=4, min=6, max=25000)
            )
        )
        private val scrap = Trait(
            "Set6_Scrap",
            listOf(
                TraitStyle(style=1, min=2, max=3),
                TraitStyle(style=2, min=4, max=5),
                TraitStyle(style=3, min=6, max=25000)
            )
        )
        private val sister = Trait(
            "Set6_Sister",
            listOf(
                TraitStyle(style=3, min=2, max=25000)
            )
        )
        private val sniper = Trait(
            "Set6_Sniper",
            listOf(
                TraitStyle(style=1, min=2, max=3),
                TraitStyle(style=3, min=4, max=5),
                TraitStyle(style=4, min=6, max=25000)
            )
        )
        private val socialite = Trait(
            "Set6_Socialite",
            listOf(
                TraitStyle(style=1, min=1, max=1),
                TraitStyle(style=2, min=2, max=2),
                TraitStyle(style=3, min=3, max=25000)
            )
        )
        private val syndicate = Trait(
            "Set6_Syndicate",
            listOf(
                TraitStyle(style=1, min=3, max=4),
                TraitStyle(style=3, min=5, max=6),
                TraitStyle(style=4, min=7, max=25000)
            )
        )
        private val transformer = Trait(
            "Set6_Transformer",
            listOf(
                TraitStyle(style=3, min=1, max=25000)
            )
        )
        private val twinshot = Trait(
            "Set6_Twinshot",
            listOf(
                TraitStyle(style=1, min=2, max=3),
                TraitStyle(style=3, min=4, max=5),
                TraitStyle(style=4, min=6, max=25000)
            )
        )
        private val yordle = Trait(
            "Set6_Yordle",
            listOf(
                TraitStyle(style=1, min=3, max=5),
                TraitStyle(style=3, min=6, max=25000)
            )
        )
        private val yordleLord = Trait(
            "Set6_YordleLord",
            listOf(
                TraitStyle(style=4, min=1, max=25000)
            )
        )

        val traits: List<Trait> = listOf(
            academy,        arcanist,       assassin,       bodyguard,
            bruiser,        challenger,     chemtech,       clockwork,
            colossus,       cuddly,         enchanter,      enforcer,
            glutton,        imperial,       innovator,      mercenary,
            mutant,         protector,      scholar,        scrap,
            sister,         sniper,         socialite,      syndicate,
            transformer,    twinshot,       yordle,         yordleLord
        )
        val traitMap: Map<String, Trait> = traits.associateBy { trait -> trait.id }
        val traitItemMap: Map<Int, String> = mapOf(
            imperialEmblem to imperial.id,
            challengerEmblem to challenger.id,
            arcanistEmblem to arcanist.id,
            academyEmblem to academy.id,
            bodyguardEmblem to bodyguard.id,
            syndicateEmblem to syndicate.id,
            chemtechEmblem to chemtech.id,
            assassinEmblem to assassin.id,
            mutantEmblem to mutant.id,
            clockworkEmblem to clockwork.id,
            mercenaryEmblem to mercenary.id,
            socialiteEmblem to socialite.id,
            enforcerEmblem to enforcer.id,
            scrapEmblem to scrap.id,
            protectorEmblem to protector.id,
            bruiserEmblem to bruiser.id,
            innovatorEmblem to innovator.id,
            sniperEmblem to sniper.id,
            scholarEmblem to scholar.id,
        )

        //CHAMPIONS
        val graves =        Champion("TFT6_Graves",         listOf(academy, twinshot),              1)
        val singed =        Champion("TFT6_Singed",         listOf(chemtech, innovator),            1)
        val twitch =        Champion("TFT6_Twitch",         listOf(chemtech, assassin),             1)
        val camille =       Champion("TFT6_Camille",        listOf(clockwork, challenger),          1)
        val illaoi =        Champion("TFT6_Illaoi",         listOf(mercenary, bruiser),             1)
        val twistedFate =   Champion( "TFT6_TwistedFate",   listOf(syndicate, arcanist),            1)
        val caitlyn =       Champion("TFT6_Caitlyn",        listOf(enforcer, sniper),               1)
        val darius =        Champion("TFT6_Darius",         listOf(syndicate, bodyguard),           1)
        val garen =         Champion("TFT6_Garen",          listOf(academy, protector),             1)
        val ezreal =        Champion("TFT6_Ezreal",         listOf(scrap, innovator),               1)
        val ziggs =         Champion("TFT6_Ziggs",          listOf(scrap, yordle, arcanist),        1)
        val poppy =         Champion("TFT6_Poppy",          listOf(yordle, bodyguard),              1)
        val kassadin =      Champion("TFT6_Kassadin",       listOf(mutant, protector),              1)

        val katarina =      Champion("TFT6_Katarina",       listOf(academy, assassin),              2)
        val warwick =       Champion("TFT6_Warwick",        listOf(chemtech, challenger),           2)
        val zyra =          Champion("TFT6_Zyra",           listOf(syndicate, scholar),             2)
        val swain =         Champion("TFT6_Swain",          listOf(imperial, arcanist),             2)
        val vi =            Champion("TFT6_Vi",             listOf(enforcer, sister, bruiser),      2)
        val zilean =        Champion("TFT6_Zilean",         listOf(clockwork, innovator),           2)
        val blitzcrank =    Champion("TFT6_Blitzcrank",     listOf(scrap, protector, bodyguard),    2)
        val trundle =       Champion("TFT6_Trundle",        listOf(scrap, bruiser),                 2)
        val lulu =          Champion("TFT6_Lulu",           listOf(yordle, enchanter),              2)
        val tristana =      Champion("TFT6_Tristana",       listOf(yordle, sniper),                 2)
        val quinn =         Champion("TFT6_Quinn",          listOf(mercenary, challenger),          2)
        val talon =         Champion("TFT6_Talon",          listOf(imperial, assassin),             2)
        val kogMaw =        Champion("TFT6_KogMaw",         listOf(mutant, sniper, twinshot),       2)

        val leona =         Champion("TFT6_Leona",          listOf(academy, bodyguard),             3)
        val lissandra =     Champion("TFT6_Lissandra",      listOf(chemtech, scholar),              3)
        val zac =           Champion("TFT6_Zac",            listOf(chemtech, bruiser),              3)
        val samira =        Champion("TFT6_Samira",         listOf(imperial, challenger),           3)
        val missFortune =   Champion("TFT6_MissFortune",    listOf(mercenary, sniper),              3)
        val gangplank =     Champion("TFT6_Gangplank",      listOf(mercenary, twinshot),            3)
        val malzahar =      Champion("TFT6_Malzahar",       listOf(mutant, arcanist),               3)
        val choGath =       Champion("TFT6_ChoGath",        listOf(mutant, bruiser, colossus),      3)
        val vex =           Champion("TFT6_Vex",            listOf(yordle, arcanist),               3)
        val heimerdinger =  Champion("TFT6_Heimerdinger",   listOf(yordle, innovator, scholar),     3)
        val taric =         Champion("TFT6_Taric",          listOf(socialite, enchanter),           3)
        val shaco =         Champion("TFT6_Shaco",          listOf(syndicate, assassin),            3)
        val ekko =          Champion("TFT6_Ekko",           listOf(scrap, assassin),                3)

        val mundo =         Champion("TFT6_DrMundo",        listOf(chemtech, mutant, bruiser),      4)
        val lux =           Champion("TFT6_Lux",            listOf(academy, arcanist),              4)
        val yone =          Champion("TFT6_Yone",           listOf(academy, challenger),            4)
        val orianna =       Champion("TFT6_Orianna",        listOf(clockwork, enchanter),           4)
        val jhin =          Champion("TFT6_Jhin",           listOf(clockwork, sniper),              4)
        val seraphine =     Champion("TFT6_Seraphine",      listOf(socialite, innovator),           4)
        val sion =          Champion("TFT6_Sion",           listOf(imperial, protector, colossus),  4)
        val fiora =         Champion("TFT6_Fiora",          listOf(enforcer, challenger),           4)
        val janna =         Champion("TFT6_Janna",          listOf(scrap, enchanter, scholar),      4)
        val urgot =         Champion("TFT6_Urgot",          listOf(chemtech, twinshot),             4)
        val braum =         Champion("TFT6_Braum",          listOf(syndicate, bodyguard),           4)

        val yuumi =         Champion("TFT6_Yuumi",          listOf(cuddly, academy, scholar),       5)
        val viktor =        Champion("TFT6_Viktor",         listOf(chemtech, arcanist),             5)
        val tahmKench =     Champion("TFT6_TahmKench",      listOf(mercenary, bruiser, glutton),    5)
        val jayce =         Champion("TFT6_Jayce",          listOf(enforcer,innovator,transformer), 5)
        val galio =         Champion("TFT6_Galio",          listOf(socialite, bodyguard, colossus), 5)
        val jinx =          Champion("TFT6_Jinx",           listOf(scrap, sister, twinshot),        5)
        val kaisa =         Champion("TFT6_Kaisa",          listOf(mutant, challenger),             5)
        val akali =         Champion("TFT6_Akali",          listOf(syndicate, assassin),            5)
        val veigar =        Champion("TFT6_Veigar",         listOf(yordleLord),                     5)

        val champions: List<Champion> = listOf(
            graves,         singed,         twitch,         camille,
            illaoi,         twistedFate,    caitlyn,        darius,
            garen,          ezreal,         ziggs,          poppy,
            kassadin,

            katarina,       warwick,        zyra,           swain,
            vi,             zilean,         blitzcrank,     trundle,
            lulu,           tristana,       quinn,          talon,
            kogMaw,

            leona,          lissandra,      zac,            samira,
            missFortune,    gangplank,      malzahar,       choGath,
            vex,            heimerdinger,   taric,          shaco,
            ekko,

            mundo,          lux,            yone,           orianna,
            jhin,           seraphine,      sion,           fiora,
            janna,          urgot,          braum,

            yuumi,          viktor,         tahmKench,      jayce,
            galio,          jinx,           kaisa,          akali,
            veigar,
        )
        val championMap: Map<String, Champion> = champions.associateBy { champion -> champion.id }
        val championIndexMap: Map<String, Int> = champions.associate { it.id to champions.indexOf(it) }

        private val fiveChemtech = ConstantDeck(
            "fiveChemtech",
            listOf(
                vi,
                lissandra.with(guardianAngel, archangelsStaff, morellonomicon),
                zac,
                mundo.with(brambleVest, dragonsClaw),
                urgot.with(guardianAngel, infinityEdge, lastWhisper),
                jinx.with(guinsoo),
                tahmKench,
                viktor.with(shojin),
            ),
            listOf(
                lissandra,  mundo,      urgot,      jinx,
            ),
            listOf(
                Pair(chemtech.id,   2),
                Pair(twinshot.id,   1),
            ),
        )
        private val highValueJinx = ConstantDeck(
            "highValueJinx",
            listOf(
                vi,
                janna,
                jhin,
                orianna,
                jayce.with(brambleVest, titansResolve),
                jinx.with(guardianAngel, guinsoo, handOfJustice),
                tahmKench,
                yuumi.with(morellonomicon),
            ),
            listOf(
                vi,         jinx,       jayce,      yuumi,
            ),
            listOf(
                Pair(sister.id,     1),
                Pair(transformer.id,1),
                Pair(cuddly.id,     1),
                Pair(enchanter.id,  1),
            ),
        )
        private val bodyguardJhin = ConstantDeck(
            "bodyguardJhin",
            listOf(
                leona,
                missFortune,
                taric,
                braum.with(brambleVest, gargoyle, dragonsClaw),
                janna,
                jhin.with(infinityEdge, giantSlayer, lastWhisper),
                orianna.with(shojin),
                yuumi.with(morellonomicon),
            ),
            listOf(
                braum,      jhin,       orianna,    yuumi,
            ),
            listOf(
                Pair(cuddly.id,     1),
                Pair(enchanter.id,  2),
                Pair(bodyguard.id,  1),
                Pair(clockwork.id,  1),
            ),
        )
        private val sevenInnovator = ConstantDeck(
            "sevenInnovator",
            listOf(
                ezreal,
                singed,
                zilean,
                heimerdinger.with(jeweledGauntlet, blueBuff),
                janna,
                orianna,
                seraphine.with(shojin, morellonomicon),
                jayce.with(bloodthirster, infinityEdge, giantSlayer),
            ),
            listOf(
                seraphine,  jayce,
            ),
            listOf(
                Pair(innovator.id,  3),
            ),
        )
        private val challengerYone = ConstantDeck(
            "challengerYone",
            listOf(
                quinn,
                warwick,
                leona,
                samira,
                braum.with(brambleVest, dragonsClaw),
                fiora.with(titansResolve, handOfJustice),
                yone.with(guardianAngel, runaan, lastWhisper),
                kaisa.with(shojin, jeweledGauntlet),
            ),
            listOf(
                yone,       fiora
            ),
            listOf(
                Pair(challenger.id, 3),
            ),
        )
        private val scholarLissandra = ConstantDeck(
            "scholarLissandra",
            listOf(
                heimerdinger,
                lissandra.with(guardianAngel, archangelsStaff, morellonomicon),
                taric.with(brambleVest, warmog),
                janna,
                orianna.with(shojin),
                seraphine.with(shojin),
                jayce.with(titansResolve, bloodthirster),
                yuumi,
            ),
            listOf(
                lissandra,   yuumi
            ),
            listOf(
                Pair(scholar.id,    2),
                Pair(transformer.id,1),
            ),
        )
        private val sixArcanist = ConstantDeck(
            "sixArcanist",
            listOf(
                ziggs,
                swain,
                malzahar,
                vex.with(brambleVest, dragonsClaw, ionicSpark),
                janna,
                lux.with(infinityEdge, jeweledGauntlet, blueBuff),
                viktor.with(shojin, guinsoo),
                yuumi,
            ),
            listOf(
                vex,        lux,
            ),
            listOf(
                Pair(arcanist.id,  3),
            ),
        )
        private val clapio = ConstantDeck(
            "clapio",
            listOf(
                blitzcrank,
                taric,
                janna,
                seraphine.with(shojin, archangelsStaff, morellonomicon),
                sion.with(frozenHeart),
                galio.with(infinityEdge, guinsoo, titansResolve),
                yuumi,
            ),
            listOf(
                sion,        galio,
            ),
            listOf(
                Pair(colossus.id,  1),
            ),
        )
        private val socialiteAkali = ConstantDeck(
            "socialiteAkali",
            listOf(
                shaco,
                taric,
                braum,
                janna,
                seraphine.with(morellonomicon),
                akali.with(infinityEdge, archangelsStaff, ionicSpark),
                galio.with(brambleVest, gargoyle),
                yuumi,
            ),
            listOf(
                akali,      braum,      galio
            ),
            listOf(
                Pair(socialite.id,  3),
                Pair(assassin.id,   1),
            ),
        )
        private val differentKaisa = ConstantDeck(
            "differentKaisa",
            listOf(
                taric,
                braum.with(warmog),
                janna,
                seraphine.with(morellonomicon),
                galio.with(ionicSpark, brambleVest, dragonsClaw),
                kaisa.with(hextechGunblade, shojin, jeweledGauntlet),
                tahmKench,
                yuumi,
            ),
            listOf(
                galio,      kaisa,
            ),
            listOf(
                Pair(socialite.id,  3),
            ),
        )
        private val rerollMutant = ConstantDeck(
            "rerollMutant",
            listOf(
                kassadin,
                choGath.with(redemption, brambleVest, dragonsClaw),
                malzahar.with(hextechGunblade, jeweledGauntlet, blueBuff),
                mundo.with(ionicSpark),
                sion,
                kaisa.with(shojin),
            ),
            listOf(
                malzahar,      choGath,
            ),
            listOf(
                Pair(mutant.id,     2),
            ),
        )
        private val rerollMissFortune = ConstantDeck(
            "rerollMissFortune",
            listOf(
                leona,
                missFortune.with(shojin, jeweledGauntlet, handOfJustice),
                taric,
                braum.with(brambleVest, dragonsClaw, warmog),
                janna,
                jhin.with(giantSlayer, infinityEdge),
                orianna,
                yuumi,
            ),
            listOf(
                leona,      missFortune,braum,      jhin,
            ),
            listOf(
                Pair(sniper.id,     1),
                Pair(bodyguard.id,  1),
            ),
        )
        private val rerollGaKaGCaiKo = ConstantDeck(
            "rerollGaKaGCaiKo",
            listOf(
                caitlyn,
                garen.with(bloodthirster, brambleVest, warmog),
                graves,
                kassadin,
                blitzcrank,
                kogMaw.with(giantSlayer, guinsoo, handOfJustice),
                vi,
                mundo,
            ),
            listOf(
                garen,      kogMaw,
            ),
            listOf(),
        )
        private val rerollTrundle = ConstantDeck(
            "rerollTrundle",
            listOf(
                ezreal,
                blitzcrank,
                trundle.with(bloodthirster, runaan, quicksilver),
                vi,
                ekko.with(morellonomicon),
                braum,
                janna,
                jinx.with(guardianAngel, guinsoo),
            ),
            listOf(
                trundle,    ekko,       jinx,
            ),
            listOf(
                Pair(scrap.id,      2),
                Pair(sister.id,     1),
            ),
        )
        private val rerollKatarina = ConstantDeck(
            "rerollKatarina",
            listOf(
                katarina.with(infinityEdge, ionicSpark, handOfJustice),
                ekko.with(morellonomicon, frozenHeart),
                leona,
                talon,
                braum.with(gargoyle, warmog),
                lux.with(blueBuff),
                akali,
                yuumi,
            ),
            listOf(
                katarina,   ekko,       braum,
            ),
            listOf(
                Pair(assassin.id,   2),
                Pair(academy.id,    1),
            ),
        )
        private val rerollWarwick = ConstantDeck(
            "rerollKatarina",
            listOf(
                singed,
                quinn.with(shojin),
                warwick.with(guinsoo, titansResolve, quicksilver),
                lissandra.with(morellonomicon),
                zac,
                fiora.with(handOfJustice),
                mundo.with(brambleVest, warmog),
                kaisa
            ),
            listOf(
                warwick,
            ),
            listOf(
                Pair(chemtech.id,   1),
                Pair(challenger.id, 1),
            ),
        )
        private val rerollYordle = ConstantDeck(
            "rerollYordle",
            listOf(
                poppy,
                ziggs,
                lulu,
                tristana,
                heimerdinger.with(archangelsStaff, jeweledGauntlet, blueBuff),
                vex.with(brambleVest, dragonsClaw, warmog),
                janna,
                veigar.with(rabadon, hextechGunblade)
            ),
            listOf(
                janna, veigar
            ),
            listOf(
                Pair(yordleLord.id, 1),
            ),
        )

        val decks: List<ConstantDeck> = listOf(
            fiveChemtech,       highValueJinx,      bodyguardJhin,      sevenInnovator,
            challengerYone,     scholarLissandra,   sixArcanist,        clapio,
            socialiteAkali,     differentKaisa,     rerollMutant,       rerollMissFortune,
            rerollGaKaGCaiKo,   rerollTrundle,      rerollKatarina,     rerollWarwick,
            rerollYordle,
        )
    }
}
