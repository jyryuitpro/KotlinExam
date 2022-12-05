package ex_companion_object

class Person private constructor() {

    // create 멤버 함수를 통해서만 Person 객체를 생성할 수 있도록 하기 위해 생성자의 접근지정자를 private으로 지정했다.
    companion object {
        fun create(): Person {
            countCreated += 1
            return Person()
        }

        var countCreated = 0
            private set
    }
}
fun main(args: Array<String>) {
    val a = Person.create()
    val b = Person.create()
    println(Person.countCreated)
}