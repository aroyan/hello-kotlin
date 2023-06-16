package functions

// Challenge
// Write HOF named printFormattedName
// The function takes two params, firstName and lastName
// The function will take functional parameter to format the names
// The functional parameter should take two strings, and return string
// printFormattedName should print the result of calling the format function

fun printFormattedName(firstName:String, lastName:String, formatter: (String, String) -> String){
    println("My full name is ${formatter(firstName, lastName)}")
}

val transformToUppercase: (String, String) -> String = {first, last ->
    "${first.uppercase()} ${last.uppercase()}"
}

val transformToLowercase: (String, String) -> String = {first, last ->
    "${first.lowercase()} ${last.lowercase()}"
}

val joinNameFormatter: (String, String) -> String = {first, last ->
    "$first $last"
}

fun main() {
    printFormattedName("Aroyan", "Bakti", joinNameFormatter)

    printFormattedName("Aroyan", "Bakti", transformToUppercase)

    printFormattedName(lastName = "ARoYAN", formatter = transformToLowercase, firstName =  "BakTI")
}