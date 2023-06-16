package flow

fun main() {
    var counter = 0

//    while (counter < 5) {
//        println(counter)
//        counter++
//        if(counter == 1) break
//    }

    do {
        println(counter)
        counter += 1
    } while (counter < 5)
}