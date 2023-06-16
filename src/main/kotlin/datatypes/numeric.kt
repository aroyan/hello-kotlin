package datatypes

fun main() {
    val price = 10_000_000U
    val deficit = -900000

    val discount = 20_000_000

    val total = price - deficit.toUInt()

    println(price)
    println(discount.toUInt())
    println(total)
}