package oop.shape

class Shape(
    private val name: String,
    private val sides: Int,
    private val height: Int = 0,
    private val width: Int = 0,
    private val radius: Int = 0
) {
    fun getArea(): Int{
        return if(radius != 0){
            println("It's circle")
            0
        } else {
            height.plus(width).times(sides.div(2))
        }
    }

     fun getPerimeter(): Int{
         return height.times(width)
     }
}

val kotak = Shape("Kotak", 4, 5, 10)

val lingkaran = Shape("Lingkaran", 0, radius = 10)

fun main() {
    println(kotak.getArea())
    println(kotak.getPerimeter())

    println(lingkaran.getArea())
    println(lingkaran.toString())
}