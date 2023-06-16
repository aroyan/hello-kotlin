package functions

// Higher order functions
fun main() {
    printCalculatedValue(2, 3) { value1, value2 ->
        value1 + value2
    }

    printCalculatedValue(2, 3) { value1, value2 ->
        value1 - value2
    }
}

fun printCalculatedValue(val1: Int, val2: Int, calculator: (Int, Int) -> Int){
    println("The value is: ${calculator(val1, val2)}")
}