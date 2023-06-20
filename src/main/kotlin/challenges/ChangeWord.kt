package challenges

val kalimat1 = "Taylor Swift sangat mencintai kamu selamanya"
val kalimat2 =   "Gunung Bromo tak akan mampu menggambarkan besarnya cintaku padamu"

fun changeWord(selectedText: String, changedText: String, text: String): String {
    return text.replace(selectedText, changedText, true)
}

fun main() {
    println(changeWord("taylor", "Billie", kalimat1))
    println(changeWord("bromo", "Semeru", kalimat2))
}