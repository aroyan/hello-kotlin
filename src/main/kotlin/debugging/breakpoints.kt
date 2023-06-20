package debugging

import milisForHours
import kotlin.random.Random

fun getRandomInt(): Int {
    return Random.nextInt()
}
fun main() {
    for (i in 0 .. 4){
        val random = getRandomInt()
        val isEven = random.rem(2) == 0
        when(isEven) {
            true -> println("$random is even")
            false -> println("$random is odd")
        }
    }

//    println(milisForHours(200))
}
