package ex_operator_overloading

class Point(var x: Int = 0, var y: Int = 0) {

    // operator의 의미는 Point의 인스턴스 간에 연산자를 사용했을 때 이 멤버 함수를 대신 호출해달라는 뜻이다.
    // 함수 이름은 plus로 했는데, 이 이름은 정해진 이름이며 다른 이름을 사용하면 연산자 오버로딩이 제대로 되지 않는다.
    // plus 라는 이름은 + 연산자를 오버로딩한다.
    // 즉, pt1 + pt2를 하면, 실제로는 pt1.plus(pt2)을 수행한다.
    operator fun plus(other: Point): Point {
        return Point(x + other.x, y + other.y)
    }

    operator fun minus(other: Point): Point {
        return Point(x - other.x, y - other.y)
    }

    operator fun times(number: Int): Point {
        return Point(x * number, y * number)
    }

    operator fun div(number: Int): Point {
        return Point(x / number, y / number)
    }

    // 좌표 값을 출력한다
    fun print() {
        println("x: $x, y: $y")
    }
}