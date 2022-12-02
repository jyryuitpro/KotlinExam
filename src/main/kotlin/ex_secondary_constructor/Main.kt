package ex_secondary_constructor

// 초 값을 저장하는 val second: Int 프로퍼티를 선언 및 초기화하는 주 생성자를 정의하고 있다.
class Time(val second: Int) {

    init {
        println("init 블록 실행 중")
    }

    // 보조 생성자 1
    // 만약 클래스에 주 생성자가 존재한다면, 주 생성자를 반드시 먼저 호출해주어야 한다.
    // this(인수)는 이 클래스에 포함된 또 다른 생성자를 호출하는 문법이다.
    // 여기서는 Int 타입 인수 하나를 전달했으므로 주 생성자가 호출된다.
    constructor(minute: Int, second: Int) : this(minute)

    // 보조 생성자 2
    // 여기서도 마찬가지로 주 생성자를 반드시 먼저 호출해주어야 한다.
    // 여기서는 Int 타입 인수 두 개를 전달하여 생성자를 호출했으므로 보조 생성자 1이 호출된다.
    // 보조 생성자 1은 다시 주 생성자를 먼저 호출하므로, 궁극적으로는 주 생성자가 가장 먼저 호출되게 된다.
    constructor(hour: Int, minute: Int, second: Int) : this(hour * 60 + minute, second)

    init {
        println("또 다른 init 블록 실행중")
    }
}
fun main(args: Array<String>) {
    println("${Time(15, 6).second} 초")
    println("${Time(6, 15, 6).second} 초")
}