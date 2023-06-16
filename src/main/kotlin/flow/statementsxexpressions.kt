package flow

fun main() {

    val num = 1232
    val month = 5

    val oddOrEven = if(num % 2 == 0) "Even" else "Odd"

    println(oddOrEven)

    val nameOfMonth = when (month) {
        1 -> "Januari"
        2 -> "Februari"
        3 -> "Maret"
        4 -> "April"
        5 -> "Mei"
        in 6..12 -> "Juni ke Desember"
        else -> {
            "Invalid value"
        }
    }

    println(nameOfMonth)
}