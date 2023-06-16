package flow

fun main() {
    val genericVariable: Any = 5

    val intVariable: Int = genericVariable as Int

    checkType(genericVariable)
    checkType(intVariable)

    checkType(null)
}

fun checkType(input: Any?) {
    if(input is String?) {
        if(input == null) {
            println("Input is null String")
        } else {
            println("Input is a String with length ${input.length}")
        }
    }

    if(input !is Int) {
        println("Input is not an Int")
    }
}

fun typeCheck(input: Any?){
    when(input){
        null -> println("Input is null")
        is String -> println("Input is string with ${input.length}")
    }
}