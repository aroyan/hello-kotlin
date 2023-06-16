package datatypes

fun main() {
    var appName: String? = null
    // Using double exclamation mark is to enforce that the appName variable is not null
    // It will get NullPointerException if the variable is actually null
    // println(appName!!.length)

    // Using ? to access the method or variable instead, so it works like optional chaining in JavaScript
    // It will return null instead of NullPointerException
    println(appName?.length)

    // Elvis operator or Nullish coalescing in JavaScript
    // So if the left hand side variable is null, it'll return the right hand side variable instead
    println(appName?.length ?: "This variable is null")

    appName = "Terbang Tinggi"

    println(appName?.length)
}