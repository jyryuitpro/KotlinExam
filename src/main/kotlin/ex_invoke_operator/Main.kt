package ex_invoke_operator

fun main(args: Array<String>) {
    val product = Product(762443, "코틀린 200제")
    // product.invoke(108)
    product(108)
}