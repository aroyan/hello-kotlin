package functions

fun main() {
    val message = sendGreeting()
    println(message)
    println(sayGreeting())
}

fun sendGreeting(): String{
    return "Selamat datang"
}

// Single expression function [Automatically infer returned type]
fun sayGreeting() = "Hello World"

// Private function on this own module?
private fun sendNumberTwo() = 2

fun sendNull() = null