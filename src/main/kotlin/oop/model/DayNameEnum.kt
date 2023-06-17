package oop.model

enum class DayNameEnum {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER
}

val january: DayNameEnum = DayNameEnum.JANUARY

val march: DayNameEnum=  DayNameEnum.valueOf("MARCH") // Case sensitive

val allItems: Array<DayNameEnum> = DayNameEnum.values()

fun main() {
    println(january.name)
    println(january.ordinal) // Index number in ENUM, so JANUARY should be 0

    println(march)

    allItems.forEach { println(it.name) }
}