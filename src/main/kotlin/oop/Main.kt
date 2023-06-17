package oop

import oop.inter.ResourceProvider
import oop.inter.StringProvider

class DefaultResourceProvider : ResourceProvider {

    override val placeholder: String = "<placeholder>"
}

fun main() {
//    val person: Person = Student(20, "Aroyan", "Bakti")

    val stringProvider: StringProvider = DefaultResourceProvider()
    println(stringProvider.getString(200))
    println(stringProvider.placeholder)

    if(stringProvider is StringProvider){
        println("The var is a StringProvider")
    }
}