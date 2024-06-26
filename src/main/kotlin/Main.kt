package mate.academy

const val TYPE = "USUAL"

fun main() {
    val intValue: Int = 10
    val longValue: Long = 42L
    val decimal: Double = 3.45
    val bool: Boolean = false
    val charValue: Char = 'c'
    val str: String = "Hello World"

    val list = listOf<Int>(22, 23, 24)
    println(list)

    val number : Int = -100

    var positive : UInt = 100u
    positive += 15u

    var name : Any = "Hello World"
    name = 12
    name = true

    if (name is String) {
        println("This is a String")
    } else {
        println("This is not a String")
    }

    val value = "123"
    val number2 : Int = value.toInt()

    val numString = "1"
    val numInt = number2.toInt()
    val numDouble = number2.toDouble()
    println(numString.javaClass)
    println(numInt::class.java)
    println(numDouble.javaClass)

    val nameAlice = "Alice"
    nameAlice.uppercase()
    nameAlice.lowercase()
    val capitalizedName = nameAlice.replaceFirst(nameAlice[0],nameAlice[0].uppercaseChar())
    nameAlice.drop(2)
    nameAlice.dropLast(2)
    nameAlice.take(2)
    nameAlice.filter { c -> !c.isDigit() }

    val valNames = "Kotlin"
    val greeting = "Hello $valNames"

    val temperature = 23
    val weatherReport = "Temperature $temperature ˚C"

    val announcement = "Countdown: ${10 - 4} days"

    val price = 100
    val discount = 20

    val finalPrice = "Price after discount ${price - discount}"

    /**
     * operators is the same &,&&,|,||, +, - ,/ , * , -x
     */
}

fun isWerewolf(value: String) : Boolean {
    return value.reversed() == value
}