package ex_elvis_operator

fun main(args: Array<String>) {
    val number: Int? = null
    println(number ?: 0)

    val number2: Int? = 15
    println(number2 ?: 0)
}