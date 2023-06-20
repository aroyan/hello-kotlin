import functions.printFormattedName
import functions.transformToUppercase

// Properties extensions
val Int.isEven: Boolean
    get() = this.mod(2) == 0

val appLogger = ApplicationLogger(SimpleLogger())
val viewModel = ViewModel()

fun main(args: Array<String>) {
    appLogger.log("Hello", appLogger)


    viewModel.search("Kotlin")
    viewModel.search("Code")

//    println("Hello World!")
//    printFormattedName("Aroyan", "Bakti", transformToUppercase)
//    println(milisForHours(1))
//    println(milisForHours(20))

    println(4.milisForHours())
    println(20.milisForHours())

    "[abc]+".toRegex()

    println(10.isEven)

    "HELLO".log()
    123.log()
    true.log()
    arrayOf(1, 2, 3, 4).log()
}