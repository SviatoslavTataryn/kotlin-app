package mate.academy

fun main() {
    val name: String? = null
    val num: Int? = 2
    val num2: Int? = null

    val result = num?.plus(10)?.times(4)
    println(result)

    val message = "Print a product info in the format: Name : price. For example, Apple: 11.99"
    println(message)
    val input: String? = readLine()

    val price: Double? = input?.substring(input.indexOf(" ") + 1)?.toDouble()

    val tax = price?.times(0.2)
    println(tax)

    val name1: String = "Alice"
    val value1 = name1 ?: "Bob"

    val ternaryOperator = if (name1 != null) name1 else "Bob"

    val name2: String? = "Bob"
    println(name2!!.length)

    println("Enter the number ... ")
    val input2 = readLine()
    val number: Int? = if (input != null) input2?.toInt() else null

    println("The provided number is $number")
    println("The result is: ${number?.times(5)}")

}
