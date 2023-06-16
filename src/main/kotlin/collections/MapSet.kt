package collections

fun main() {
    val nameSets = setOf<String>("Irene", "Joy", "Wendy", "Seulgi")
    nameSets.forEach { println(it) }
//    nameSets.add("Yeri") // Error, you have to use mutableSetOf if you want to add or remove element

    val languagesMap = mutableMapOf<String, Int>(
        "JavaScript" to 10,
        "Java" to 22,
        "Kotlin" to 33,
        "R" to 44,
        "Python" to 55
    )

    languagesMap["C++"] = 66
//    languagesMap.put("C++", 66) // same as above

    languagesMap.forEach { (key, value) -> println("$key $value") }

    val newLangs = languagesMap.filter { (key, value) -> value > 22 }
        .map { it.key }

    println(newLangs)
}