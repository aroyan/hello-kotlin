package flow

// Using if else
fun getOutput(input: Any?): String = if (input is Number) {
    if(input !is Int){
        "input was an int"
    } else {
        "Input was a non int number"
    }
}
else if (input is String) {"Input was a string"}
else if (input == null) {"Input was null"}
else {"Input didn't match"}

// Using when
fun getOut(input: Any?): String = when (input) {
    is Number -> if(input !is Int) "Input was an Int" else "Input was a non int number"
    is String -> "Input was a string with length ${input.length}"
    null -> "Input was null"
    else -> "Didn't match"
}

fun main() {
    println(getOut(null))
    println(getOut(4))
    println(getOut(4.2))
    println(getOut("Hello"))
    println(getOut('a'))
}