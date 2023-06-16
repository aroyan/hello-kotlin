package collections

fun main() {
    // Sequence is good for performance
    val langSeq = sequenceOf<String>("Java", "JavaScript", "Kotlin", "Ruby", "PHP", "Zig", "C++", "C#", "C")

    val langList = listOf<String>("Java", "JavaScript", "Kotlin", "Ruby", "PHP", "Zig", "C++", "C#", "C")

    // Set breakpoints below to see the difference of how it's perform. This one below is only running 2 steps when I step over the debugger
    langSeq.filter { item -> item.length > 3 }.map { item -> item.uppercase() }.take(2)

    // Set breakpoints below to see the difference of how it's perform. While this one is running more than 10 steps
    langList.filter { item -> item.length > 3 }.map { item -> item.uppercase() }.take(2)
}