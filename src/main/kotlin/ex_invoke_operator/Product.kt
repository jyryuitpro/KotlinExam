package ex_invoke_operator

class Product(val id: Int, val name: String) {

    // ()는 함수를 호출할 때 사용하는 연산자이다.
    // 코틀린에서는 이런 연산자도 오버로딩 가능하다.
    // () 연산자를 오버로딩하는 멤버 함수 invoke를 선언하고 있다.
    // 본 예제에서는 하나의 인수만 적었지만, 인수의 개수는 자유다. 인수를 아예 생략할 수도 있다.
    operator fun invoke(value: Int) {
        println(value)
        println("id: $id\nname: $name")
    }
}