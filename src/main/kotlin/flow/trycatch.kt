package flow

fun main() {
    val message =  try {
        throw IllegalStateException()
        "The value is ${10/1}"
    } catch (error: ArithmeticException){
        error.message
    } catch (error: IllegalStateException){
        error
    }

    println(message)
}