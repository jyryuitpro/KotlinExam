package ex_lambda_expression

fun main(args: Array<String>) {
    val instantFunc: (Int) -> Unit
    instantFunc = { number: Int ->
        println("Hello $number")
    }

    instantFunc(33)
    instantFunc.invoke(33)
}