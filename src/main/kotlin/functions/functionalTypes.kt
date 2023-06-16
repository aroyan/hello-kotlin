package functions

// Lambda?
var greetingFunction: (String) -> String = { message ->
    "Hello $message"
}

fun main() {
    println(greetingFunction("Indonesia"))
    println(greetingFunction("Kotlin"))

    // You can reassign it
    // Reassign it to message
    greetingFunction = { message ->
        "Hello $message"
    }

    // This args is not valid? Oh, you need to explicitly use it again like initialize it
    println(greetingFunction.invoke("TypeScript"))
}