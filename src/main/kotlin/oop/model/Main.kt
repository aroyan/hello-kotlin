package oop.model

import kotlin.random.Random

fun main() {
    val task1 = TaskData("Do Laundry", "monday")
    val task2 = TaskData("Buy Groceries", "monday")

    println(task1.name)
    println(task2.name)

    val taskCopy = task2.copy(day = "sunday")

    // Destructuring
    val (name, day) = task1

    println("Name of destructured value is $name")

    // Doesn't need instance object
    println(NetworkConfig.baseUrl)
    println(NetworkConfig.getNetworkDetails())

    // Create instance of NetworkInfoProvider
    val provider: NetworkInfoProvider = object: NetworkInfoProvider {
        override fun getNetworkDetails(): String {
           return "Not implemented"
        }

    }

    provider.getNetworkDetails()

    // Doesn't need to compare the name and day properties, Kotlin handle it automatically
//    if(taskCopy == task2){
//        println("Task1 and Task2 are the same")
//    } else {
//        println("Task 1 and Task 2 are not the same")
//    }

    // Sealed Class
    var state: UiState = UiState.Loading
    render(state)

    state = UiState.Loaded("Kotlin", "It's awesome")
    render(state)

    state = UiState.Error(IllegalStateException())
    render(state)


    // Companion Object
    val controller = SearchController.create("Kotlin")


    println(controller.toString())

    // Challenge | Sealed class
    val challenge: StringResult = StringResult.Success("Awesome", "Congrats")
//    renderString(getRandomString())

}

fun getRandomString(): String {
    val rand = Random.nextInt(10)
    return if (rand > 5){
        throw IllegalStateException()
    } else {
        rand.toString()
    }
}

fun renderString(state: StringResult) = when (state) {
    is StringResult.Error -> println("Error, string is greater than 5")
    is StringResult.Success -> println("${state.name} ${state.message}")
}

fun render(state: UiState) = when (state) {
    is UiState.Error -> println("Error")
    is UiState.Loaded -> println("Loaded: ${state.title}")
    UiState.Loading -> println("Loading")
    else -> {}
}