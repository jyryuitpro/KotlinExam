package ex_infix_notation

class Point(var x: Int = 0, var y: Int = 0) {
    // 중위 표기법(Infix Notation)이란, 피연산자 연산자 피연산자의 순서로 표현식을 구성하는 방식을 뜻한다.
    // 멤버 함수의 매개변수가 하나뿐이면 함수 호출을 중위 표기법으로 할 수 있다.
    // 중위 표기법을 지원하려면 멤버 함수 선언문 앞에 infix를 붙여야 한다.
    // base를 원점으로 생각했을 때의 좌표를 반환한다.
    infix fun from(base: Point): Point {
        return Point(x - base.x, y - base.y)
    }
}

fun main(args: Array<String>) {
    val pt = Point(3, 6) from Point(1, 1)
    println(pt.x)
    println(pt.y)
}