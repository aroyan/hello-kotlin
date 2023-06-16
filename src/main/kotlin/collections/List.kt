package collections

fun main() {
    // By default, list is immutable
    val names = listOf<String>("John Doe", "Jane Doe", "Taylor Swift", "The Weeknd")

//    This will error
//    names[0] = "Obama"

    println(names[0])
    println(names.get(2))

//    names.forEach{ println(it)}

    val priceList = listOf<Int>(100, 200, 50, 20, 10)

    println(priceList.filter {it >= 50})

    println(priceList.map {price -> price * 2})

    val juiceMenu = mutableListOf<String>("Mango", "Strawberry", "Apple")
//    val juiceMenu = mutableListOf<String>()

    juiceMenu.add("Tomato")

    println("Fourth items in the menu is ${juiceMenu[3]}")

    println("Currently there is ${juiceMenu.size} ${if(juiceMenu.size == 1) "item" else "items"} in the menu")

    // Just wondering what is diff between Array and List
    val arrOfNames = arrayOf<String>("Taylor", "Irene", "Wendy", "Joy")
    arrOfNames[0] = "Seulgi" // Not error
//    arrOfNames.add("Yeri") // Error, Array is have a fixed size, so can't add or remove the elements inside it. But can be updated the content inside it

    val listOfNames = listOf<String>("Taylor", "Irene", "Wendy", "Joy")
//    listOfNames[0] = "Seulgi" // Error, you have to use mutableList if you want to change the content
//    listOfNames.add("Yeri") // Error too, reason is same as up above
}