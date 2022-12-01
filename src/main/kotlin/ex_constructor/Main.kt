package ex_constructor

// constructor 키워드는 생략해도 상관 없다.
class Person constructor(name: String, age: Int) {
    val name: String
    val age: Int

    // init 블록 안에서 프로퍼티를 초기화하면 프로퍼티를 선언과 동시에 초기화하지 않아도 된다.
    init {
        this.name = name
        this.age = age
    }
}
fun main(args: Array<String>) {
    val person = Person("홍길동", 46)
    println("이름: ${person.name}")
    println("나이: ${person.age}")
}