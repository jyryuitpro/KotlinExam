package ex_indexed_access_operator

class Person(var name: String, var birthday: String) {

    // [] 연산자를 오버로딩하는 멤버 함수 get을 선언하고 있다.
    // position에 해당하는 위치의 프로퍼티 값을 반환하도록 했다.
    operator fun get(position: Int): String {
        return when (position) {
            0 -> name
            1 -> birthday
            else -> "알 수 없음"
        }
    }

    // [] 연산자를 오버로딩하는 멤버 함수 set을 선언하고 있다.
    // position에 해당하는 위치의 프로퍼티 값을 value로 변경하도록 했다.
    operator fun set(position: Int, value: String) {
        when (position) {
            0 -> name = value
            1 -> birthday = value
        }
    }
}