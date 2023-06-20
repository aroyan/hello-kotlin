package challenges

fun checkEmail(email :String): String {
    val emailRegex = Regex("[^@ \t\r\n]+@[^@ \t\r\n]+.[^@ \t\r\n]+")

    return if(!email.contains("@")){
        "Error: Email should have @ symbol"
    } else {
        emailRegex.matches(email).toString()
    }

}

fun main() {
    println(checkEmail("hello@mail.com"))
    println(checkEmail("hello@gmail"))
    println(checkEmail("hello@"))
    println(checkEmail("hello"))
}