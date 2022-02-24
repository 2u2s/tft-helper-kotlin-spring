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
        private const val debonairEmblem    =   70
        private const val strikerEmblem     =   71
        private const val hextechEmblem     =   72
        private const val warmog            =   77
        private const val chemtechEmblem    =   78
        private const val bansheesClaw      =   79
        private const val tacticiansCrown   =   88
        private const val assassinEmblem    =   89
        private const val edgeOfNight       =   94
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
            edgeOfNight,        bloodthirster,      zekesHerald,        strikerEmblem,
            infinityEdge,

            rapidFirecannon,    guinsoo,            statikkShiv,        titansResolve,
            runaan,             zzRotPortal,        challengerEmblem,   lastWhisper,

            rabadon,            archangelsStaff,    solari,             ionicSpark,
            morellonomicon,     arcanistEmblem,     jeweledGauntlet,

            blueBuff,           frozenHeart,        chaliceOfPower,     redemption,
            hextechEmblem,      handOfJustice,

            brambleVest,        gargoyle,           sunfireCape,        bodyguardEmblem,
            shroudOfStillness,

            dragonsClaw,        zephyr,             syndicateEmblem,    quicksilver,

            warmog,             chemtechEmblem,     bansheesClaw,

            tacticiansCrown,    assassinEmblem,

            thiefsGloves,

            mutantEmblem,       clockworkEmblem,    mercenaryEmblem,    socialiteEmblem,
            enforcerEmblem,     scrapEmblem,        debonairEmblem,     bruiserEmblem,
            innovatorEmblem,    sniperEmblem,       scholarEmblem,
        )


        // TRAITS
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
        private val debonair = Trait(
            "Set6_Debonair",
            listOf(
                TraitStyle(style=1, min=3, max=4),
                TraitStyle(style=3, min=5, max=6),
                TraitStyle(style=4, min=7, max=8)
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
        private val hextech = Trait(
            "Set6_Hextech",
            listOf(
                TraitStyle(style=1, min=2, max=3),
                TraitStyle(style=2, min=4, max=5),
                TraitStyle(style=3, min=6, max=7),
                TraitStyle(style=4, min=8, max=25000)
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
        private val mastermind = Trait(
            "Set6_Mastermind",
            listOf(
                TraitStyle(style=3, min=1, max=25000)
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
                TraitStyle(style=3, min=5, max=6),
                TraitStyle(style=4, min=7, max=25000)
            )
        )
        private val rivals = Trait(
            "Set6_Rivals",
            listOf(
                TraitStyle(style=3, min=1, max=1)
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
                TraitStyle(style=3, min=3, max=4),
                TraitStyle(style=4, min=5, max=25000)
            )
        )
        private val striker = Trait(
            "Set6_Striker",
            listOf(
                TraitStyle(style=1, min=2, max=3),
                TraitStyle(style=3, min=4, max=5),
                TraitStyle(style=4, min=6, max=25000)
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
                TraitStyle(style=1, min=2, max=2),
                TraitStyle(style=2, min=3, max=3),
                TraitStyle(style=3, min=4, max=4),
                TraitStyle(style=4, min=5, max=25000)
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
            arcanist,   assassin,   bodyguard,  bruiser,
            challenger, chemtech,   clockwork,  colossus,
            debonair,   enchanter,  enforcer,   glutton,
            hextech,    innovator,  mastermind, mercenary,
            mutant,     rivals,     scholar,    scrap,
            sniper,     socialite,  striker,    syndicate,
            transformer,twinshot,   yordle,     yordleLord,
        )
        val traitMap: Map<String, Trait> = traits.associateBy { trait -> trait.id }
        val traitItemMap: Map<Int, String> = mapOf(
            strikerEmblem to striker.id,
            challengerEmblem to challenger.id,
            arcanistEmblem to arcanist.id,
            hextechEmblem to hextech.id,
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
            debonairEmblem to debonair.id,
            bruiserEmblem to bruiser.id,
            innovatorEmblem to innovator.id,
            sniperEmblem to sniper.id,
            scholarEmblem to scholar.id,
        )

        //CHAMPIONS
        val brand =         Champion("TFT6_Brand",          listOf(debonair, arcanist),             1)
        val caitlyn =       Champion("TFT6_Caitlyn",        listOf(enforcer, sniper),               1)
        val camille =       Champion("TFT6_Camille",        listOf(clockwork, challenger),          1)
        val darius =        Champion("TFT6_Darius",         listOf(syndicate, bodyguard),           1)
        val ezreal =        Champion("TFT6_Ezreal",         listOf(scrap, innovator),               1)
        val illaoi =        Champion("TFT6_Illaoi",         listOf(mercenary, bruiser),             1)
        val jarvanIV =      Champion("TFT6_JarvanIV",       listOf(hextech, striker),               1)
        val kassadin =      Champion("TFT6_Kassadin",       listOf(mutant, scholar),                1)
        val nocturne =      Champion("TFT6_Nocturne",       listOf(hextech, assassin),              1)
        val poppy =         Champion("TFT6_Poppy",          listOf(yordle, bodyguard),              1)
        val singed =        Champion("TFT6_Singed",         listOf(chemtech, innovator),            1)
        val twitch =        Champion("TFT6_Twitch",         listOf(chemtech, assassin),             1)
        val ziggs =         Champion("TFT6_Ziggs",          listOf(scrap, yordle, arcanist),        1)

        val ashe =          Champion("TFT6_Ashe",           listOf(syndicate, sniper),              2)
        val blitzcrank =    Champion("TFT6_Blitzcrank",     listOf(scrap, bodyguard),               2)
        val corki =         Champion("TFT6_Corki",          listOf(yordle, twinshot),               2)
        val lulu =          Champion("TFT6_Lulu",           listOf(yordle, enchanter),              2)
        val quinn =         Champion("TFT6_Quinn",          listOf(mercenary, challenger),          2)
        val rekSai =        Champion("TFT6_RekSai",         listOf(mutant, striker, bruiser),       2)
        val sejuani =       Champion("TFT6_Sejuani",        listOf(hextech, enforcer, bruiser),     2)
        val swain =         Champion("TFT6_Swain",          listOf(hextech, arcanist),              2)
        val syndra =        Champion("TFT6_Syndra",         listOf(debonair, scholar),              2)
        val talon =         Champion("TFT6_Talon",          listOf(debonair, assassin),             2)
        val warwick =       Champion("TFT6_Warwick",        listOf(chemtech, challenger),           2)
        val zilean =        Champion("TFT6_Zilean",         listOf(clockwork, innovator),           2)
        val zyra =          Champion("TFT6_Zyra",           listOf(syndicate, scholar),             2)

        val choGath =       Champion("TFT6_ChoGath",        listOf(mutant, bruiser, colossus),      3)
        val ekko =          Champion("TFT6_Ekko",           listOf(scrap, innovator, assassin),     3)
        val gangplank =     Champion("TFT6_Gangplank",      listOf(mercenary, twinshot),            3)
        val gnar =          Champion("TFT6_Gnar",           listOf(yordle, socialite, striker),     3)
        val leona =         Champion("TFT6_Leona",          listOf(debonair, bodyguard),            3)
        val lucian =        Champion("TFT6_Lucian",         listOf(hextech, twinshot),              3)
        val malzahar =      Champion("TFT6_Malzahar",       listOf(mutant, arcanist),               3)
        val missFortune =   Champion("TFT6_MissFortune",    listOf(mercenary, sniper),              3)
        val morgana =       Champion("TFT6_Morgana",        listOf(syndicate, enchanter),           3)
        val senna =         Champion("TFT6_Senna",          listOf(socialite, enchanter),           3)
        val tryndamere =    Champion("TFT6_Tryndamere",     listOf(chemtech, challenger),           3)
        val vex =           Champion("TFT6_Vex",            listOf(yordle, arcanist),               3)
        val zac =           Champion("TFT6_Zac",            listOf(chemtech, bruiser),              3)

        val ahri =          Champion("TFT6_Ahri",           listOf(syndicate, arcanist),            4)
        val alistar =       Champion("TFT6_Alistar",        listOf(hextech, colossus),              4)
        val braum =         Champion("TFT6_Braum",          listOf(syndicate, bodyguard),           4)
        val draven =        Champion("TFT6_Draven",         listOf(debonair, challenger),           4)
        val irelia =        Champion("TFT6_Irelia",         listOf(scrap, striker),                 4)
        val jhin =          Champion("TFT6_Jhin",           listOf(clockwork, sniper),              4)
        val khaZix =        Champion("TFT6_KhaZix",         listOf(mutant, assassin),               4)
        val orianna =       Champion("TFT6_Orianna",        listOf(clockwork, enchanter),           4)
        val renata =        Champion("TFT6_Renata",         listOf(chemtech, scholar),              4)
        val seraphine =     Champion("TFT6_Seraphine",      listOf(socialite, innovator),           4)
        val sivir =         Champion("TFT6_Sivir",          listOf(hextech, striker),               4)
        val vi =            Champion("TFT6b_Vi",            listOf(enforcer, rivals, bruiser),      4)

        val galio =         Champion("TFT6_Galio",          listOf(socialite, bodyguard, colossus), 5)
        val jayce =         Champion("TFT6_Jayce",          listOf(enforcer, innovator, transformer), 5)
        val jinx =          Champion("TFT6_Jinx",           listOf(scrap, rivals, twinshot),        5)
        val kaisa =         Champion("TFT6_Kaisa",          listOf(mutant, challenger),             5)
        val silco =         Champion("TFT6_Silco",          listOf(mastermind, scholar),            5)
        val tahmKench =     Champion("TFT6_TahmKench",      listOf(mercenary, bruiser, glutton),    5)
        val veigar =        Champion("TFT6_Veigar",         listOf(yordleLord),                     5)
        val viktor =        Champion("TFT6_Viktor",         listOf(chemtech, arcanist),             5)
        val zeri =          Champion("TFT6_Zeri",           listOf(debonair, sniper),               5)

        val champions: List<Champion> = listOf(
            brand,          caitlyn,        camille,        darius,
            ezreal,         illaoi,         jarvanIV,       kassadin,
            nocturne,       poppy,          singed,         twitch,
            ziggs,

            ashe,           blitzcrank,     corki,          lulu,
            quinn,          rekSai,         sejuani,        swain,
            syndra,         talon,          warwick,        zilean,
            zyra,

            choGath,        ekko,           gangplank,      gnar,
            leona,          lucian,         malzahar,       missFortune,
            morgana,        senna,          tryndamere,     vex,
            zac,

            ahri,           alistar,        braum,          draven,
            irelia,         jhin,           khaZix,         orianna,
            renata,         seraphine,      sivir,          vi,

            galio,          jayce,          jinx,           kaisa,
            silco,          tahmKench,      veigar,         viktor,
            zeri,
        )
        val championMap: Map<String, Champion> = champions.associateBy { champion -> champion.id }
        val championIndexMap: Map<String, Int> = champions.associate { it.id to champions.indexOf(it) }

        //decks
        val hextechSivir = ConstantDeck(
            "hextechSivir",
            listOf(
                jarvanIV,
                sejuani,
                swain,
                lucian,
                alistar,
                sivir,
                vi,
            ),
            listOf(
                sivir, alistar
            ),
            listOf(
                Pair(hextech.id,    3),
                Pair(striker.id,   1),
            ),
        )

        val decks: List<ConstantDeck> = listOf(
        )
    }
}
