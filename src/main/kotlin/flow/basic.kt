package flow

fun main() {
    val num = 31

//    if (num >= 200) {
//        println("Hello")
//    } else if (num > 300) {
//        print("Not really")
//    } else {
//        println("Whatever")
//    }

//    when {
//        num > 100 -> println("Number is greater than 100")
//        num > 80 -> println("Number is greater than 80")
//
//        else -> {
//            println("Lower than required")
//        }
//    }

    when (num) {
        0,1 -> println("Zero or One")
        2 -> println("This is two")
        3 -> println("This is three")
        in 4..Int.MAX_VALUE -> println("Value is greater than three")
    }
}