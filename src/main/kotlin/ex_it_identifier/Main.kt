package ex_it_identifier

fun main(args: Array<String>) {
    val instantFunc: (Int) -> Unit = {
        println("Hello $it")
    }

    instantFunc(33)
}