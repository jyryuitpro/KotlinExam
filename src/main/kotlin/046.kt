fun main(args: Array<String>) {
    // 참조 변수
    // 스택 영역
    val person = object {
        // 참조값
        // 힙 영역
        val name: String = "홍길동"
        val age: Int = 36
    }

    println(person.name)
    println(person.age)
}