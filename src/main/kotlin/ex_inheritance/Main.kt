package ex_inheritance

// 기본적으로 클래스는 상속이 막혀있다.
// 상속을 허용하려면, 클래스 정의부 앞에 open 키워드를 붙여주어야 한다.
open class Person(val name: String, val age: Int)

class Student(name: String, age: Int, val id: Int) : Person(name, age)

fun main(args: Array<String>) {
    val person = Person("홍길동", 35)
    val student = Student("김길동", 23, 20171217)
}