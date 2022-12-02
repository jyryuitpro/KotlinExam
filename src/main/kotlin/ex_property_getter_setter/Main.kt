package ex_property_getter_setter

fun main(args: Array<String>) {
    val person = Person()
    // setter
    person.age = -30
    // getter
    println(person.age)
}