package oop

interface StringProvider {

    val placeholder: String

    // Default method implementation
    fun getString(id: Int): String = id.toString()
}

interface ResourceProvider: StringProvider {
    // Default method implementation
    fun getDimension(id: Int): Long = id.toLong()
}

class DefaultResourceProvider : ResourceProvider {

    override val placeholder: String = "<placeholder>"
}

fun main() {
//    val person: Person = Student(20, "Aroyan", "Bakti")
    val someVar: Any? = null


    val stringProvider: StringProvider = DefaultResourceProvider()
    println(stringProvider.getString(200))
    println(stringProvider.placeholder)

    if(stringProvider is StringProvider){
        println("The var is a StringProvider")
    }
}