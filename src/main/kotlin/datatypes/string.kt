package datatypes

fun main() {
    val message = "This is immutable like const"

    var greeting = "Bonjour, while this is mutable like let"
    greeting = "\t!Hola\n"

    val multiline = """
        Hello world,
            I'm currently learning Kotlin
        Wish me luck
        So Char datatype is using single quote, and string cannot use single quote
    """.trimIndent()

    val calculation = "Sum of 1 + 1 = "

    val templateString = calculation + "${1+1}"

    val alphabetA = 'a'

    println(templateString)
    println(alphabetA)
    println(message)
    println(greeting)
    println(multiline)
}
