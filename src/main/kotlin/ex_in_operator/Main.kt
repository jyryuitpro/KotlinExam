package ex_in_operator

fun main(args: Array<String>) {
    // in 연산자는 어떤 값이 객체에 포함되어 있는지 여부를 조사하는 역할을 한다.
    // in 연산자는 operator fun contains(매개변수: 타입) Boolean 멤버 함수로 오버로딩 할 수 있다.
    // 매개변수의 타입은 자유롭게 지정할 수 있다(in 연산자는 when 문에서도 쓸 수 있다).
    println('o' in "Kotlin")
    println("in" !in "Kotlin")
}