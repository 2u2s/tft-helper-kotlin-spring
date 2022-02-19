package org.doubleus.tft_helper_kotlin_spring.constant

import com.fasterxml.jackson.databind.ObjectMapper
import java.io.File
import java.nio.file.Paths

class Parser {
    companion object {
        private val path = "${Paths.get("").toAbsolutePath()}/src/main/assets"
        private val file = File("${path}/description-en.json")
        private val rawData = file.readText(Charsets.UTF_8)
        private val mapper = ObjectMapper()
        private val tree = mapper.readTree(rawData)
        private const val seasonIndex = 3
        private val seasonData = tree.get("setData")[seasonIndex]

        private fun toCamelCase(str: String): String {
            var shouldUpper = false
            val parsed = StringBuffer()
            str.forEachIndexed{ i, it ->
                if (it == '-' || it == '_')
                    shouldUpper = true
                else {
                    if (i == 0)
                        parsed.append(it.lowercase())
                    else {
                        if (shouldUpper) {
                            parsed.append(it.uppercase())
                            shouldUpper = false
                        }
                        else if (it == ' ') {
                            shouldUpper = true
                        }
                        else if (it == '\'') {
                            return@forEachIndexed
                        }
                        else parsed.append(it)
                    }
                }
            }
            return parsed[0].lowercase() + parsed.substring(1)
        }

        fun getTraitInfo() {
            val traitList = seasonData.get("traits")
            traitList
                .sortedBy { it.get("apiName").toString() }
                .forEach{ trait ->
                    val id = trait.get("apiName").toString()
                    val styles = mutableListOf<TraitStyle>()
                    trait.get("effects").forEach{ style ->
                        styles.add(
                            TraitStyle(
                                min = style.get("minUnits").asInt(),
                                max = style.get("maxUnits").asInt(),
                                style = style.get("style").asInt()),
                        )
                    }
                    var stylesStr = "listOf("
                    styles.forEachIndexed{ i, it ->
                        stylesStr += it.toString()
                        if (i != (styles.size - 1))
                            stylesStr += ", "
                    }
                    stylesStr += ")"
                    val parsedId = id.split("_")[1].replace("\"", "")
                    println("val ${toCamelCase(parsedId)} = Trait(${id}, ${stylesStr})")
                }
        }

        fun getChampionInfo() {
            val championList = seasonData.get("champions")
            championList.forEach{ champion ->
                val cost = champion.get("cost").asInt()
                val id = champion.get("apiName").toString().replace("\"", "")
                val parsedId = id.split("_")[1].replace("\"", "")
                val traits = champion.get("traits").toList()
                var traitsStr = "listOf("
                traits.forEachIndexed{i, it ->
                    traitsStr += toCamelCase(it.toString().replace("\"", ""))
                    if (i != (traits.size - 1))
                        traitsStr += ", "
                }
                traitsStr += ")"
                println("val ${toCamelCase(parsedId)} = Champion(\"${id}\", ${traitsStr}, ${cost}, mutableListOf())")
            }
        }

        fun getItemInfo() {
            val itemList = tree.get("items")
            itemList
                .filter{
                    val filePath = it.get("icon").toString().replace("\"", "")
                    filePath.startsWith("ASSETS/Maps/Particles/TFT/Item_Icons/Spatula/Set6") || filePath.startsWith("ASSETS/Maps/Particles/TFT/Item_Icons/Standard")
                }
                .sortedBy{ it.get("id").asInt() }
                .forEach{
                    println("val ${toCamelCase(it.get("name").toString().replace("\"", ""))} = ${it.get("id").asInt()}")
                }
        }

        fun getAndroidStringInfo(target: String) {
            val championList = seasonData.get(target)
            championList.forEach { champion ->
                val id = champion.get("apiName").toString().replace("\"", "").replace("'", "\\'")
                val name = champion.get("name").toString().replace("\"", "").replace("'", "\\'")
                println("<string name=\"${id}\">${name}</string>")
            }
        }
    }
}

/*
fun main() {
    Parser.getTraitInfo()
    println("----")
    Parser.getChampionInfo()
    println("----")
    Parser.getItemInfo()
    println("----")
    Parser.getAndroidStringInfo("champions")
    println("----")
    Parser.getAndroidStringInfo("traits")
    println("----")
    Parser.getAndroidStringInfo("champions")
}
 */