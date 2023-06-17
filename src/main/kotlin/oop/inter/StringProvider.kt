package oop.inter

interface StringProvider {
    val placeholder: String

    // Default method implementation
    fun getString(id: Int): String = id.toString()
}