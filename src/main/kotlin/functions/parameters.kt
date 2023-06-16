package functions

fun main() {
    println(sayHello("Aroyan", "Indonesia"))

    // Named arguments
    println(sayHello(name = "Desember", country = "ID"))

    // You can reverse it, and it still works the same
    println(sayHello(country = "Japan", name = "Satoshi"))

    println(sayHello("John"))

    println(sum())
    println(sum(9, 9))
}

fun sayHello(name: String, country: String = "ID") = "Hello $name, are you from $country?"

fun sum(a: Int = 1, b: Int = 1) = a + b