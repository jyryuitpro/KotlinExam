package ex_init_blocks

class Size(width: Int, height: Int) {
    // 인스턴스가 생성되면, 위에서부터 순서대로 프로퍼티의 선언 및 초기화문과, init 블록이 실행된다.
    val width = width
    val height: Int

    init {
        this.height = height
    }

    val area: Int

    init {
        area = width * height
    }
}

fun main(args: Array<String>) {
    val size = Size(10, 50)
    println(size.area)
}