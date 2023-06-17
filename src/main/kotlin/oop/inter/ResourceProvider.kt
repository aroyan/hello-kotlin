package oop.inter

interface ResourceProvider: StringProvider {
    // Default method implementation
    fun getDimension(id: Int): Long = id.toLong()
}