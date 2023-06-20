private val hourInMilis = 60 * 60 * 1000

// Accessible for module
//internal fun milisForHours(hours: Int) = hours * hourInMilis

// Functions extensions
fun Int.milisForHours() = this * hourInMilis

// Properties extensions
val Int.isOdd: Boolean
    get() = this.mod(2) != 0