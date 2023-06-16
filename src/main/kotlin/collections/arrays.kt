package collections

fun main() {
    val ints = arrayOf(1, 2, 3, 4, null)

    val nulls = arrayOfNulls<Int>(5)

    val custom = Array(5) {index -> index}

    val sizeOfArray = ints.size

    val firstValue = ints[0]

    // Set array index 0 to value 100
    ints.set(0, 100)

    // Is equal to
    ints[1] = 200

//    for (i in 0 until ints.size){
//        println(ints[i])
//    }
//
//    println()
//
//    for (x in ints){
//        println(x)
//    }

//    println()

//    custom.forEach { item -> println(item) }

//    greet("Hello", custom)
    greet("Hello", "World", "Dunia")
}


fun greet(message: String, vararg items: Any) {
    for(item in items) {
        println("$message $item")
    }
}