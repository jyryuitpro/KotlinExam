package ex_enum_class_members

enum class Mode(val number: Int) {
    // 열거 상수 각각이 열거 클래스의 인스턴스라고 생각하면 된다.
    SELECTION(0),
    PEN(1),
    SHAPE(2),
    ERASER(3);

    fun printNumber() {
        println("모드: $number")
    }
}
fun main(args: Array<String>) {
    // 현재 선택된 모드
    val mode: Mode = Mode.ERASER

    println(mode.number)
    mode.printNumber()
}