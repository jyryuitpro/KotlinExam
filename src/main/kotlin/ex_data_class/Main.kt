package ex_data_class

data class Employee(val name: String, val age: Int, val salary: Int)
fun main(args: Array<String>) {
    val first = Employee("John", 30, 3000)
    val second = Employee("Page", 24, 5300)
    val third = first.copy()
    val fourth = first.copy(name = "Jiyoung")

    // Employee(name=John, age=30, salary=3000)
    println(first.toString())
    // Employee(name=John, age=30, salary=3000)
    println(third.toString())
    // Employee(name=Jiyoung, age=30, salary=3000)
    println(fourth.toString())
    // false
    println(first == second)
    // true
    println(first == third)
    // John
    println(first.component1())
}