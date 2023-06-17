package oop.model

enum class HighlightColor(val value: Int) {
    YELLOW(0xabba34),
    BLUE(0x3495eb),
    PURPLE(0x341a)
}

fun main() {
    val color = HighlightColor.BLUE
    println(color.value)
    println(color.name)
}