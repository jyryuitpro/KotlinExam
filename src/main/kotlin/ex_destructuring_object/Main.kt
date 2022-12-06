package ex_destructuring_object

import ex_data_class.Employee

data class Employee(val name: String, val age: Int, val salary: Int)

fun main(args: Array<String>) {
    val (name, _, salary) = Employee("John", 30, 3300)
    println(name)
    println(salary)
}