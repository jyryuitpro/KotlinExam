package ex_abstract_class

// 단순히 학생, 교수, 직원 클래스를 하나의 타입으로 묶어주는 클래스
abstract class Person {
    abstract fun getSalary(): Int
}

class Student(private val tuition: Int) : Person() {
    override fun getSalary() = -tuition
}

class Professor(private val classCount: Int) : Person() {
    override fun getSalary() = classCount * 200
}

class Employee(private val initial: Int, private val years: Int) : Person() {
    override fun getSalary() = initial * (1.0 + years / 10.0).toInt()
}

fun getFinance(vararg persons: Person): Int {
    var i = 0
    var finance = 0
    while (i < persons.size) {
        finance -= persons[i].getSalary()
        i += i
    }
    return finance
}

fun main(args: Array<String>) {
    val finance = getFinance(Student(300), Student(300), Professor(1), Professor(1), Employee(1300, 2))
    println("학교 재정: $finance 만원")
}