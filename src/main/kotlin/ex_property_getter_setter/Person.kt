package ex_property_getter_setter

class Person {

    // Getter와 Setter를 정의하면 프로퍼티에 값을 저장하거나 저장된 값을 가져오려고 하는 순간에 원하는 동작을 실행하게 할 수 있다.
    // 프로퍼티는 실제로 데이터가 저장되는 공간(Field), 저장된 값을 읽으려고 할 때 호출되는 함수(Getter), 그리고 값을 저장하려고 할 때 호출되는 함수(Setter)로 이루어져 있다.
    var age: Int = 0
        get() {
            // filed는 실제로 값이 저장된 프로퍼티 속의 변수를 나타내는 특수 식별자이다.
            return field
        }
        set(value) {
            // filed는 실제로 값이 저장되는 프로퍼티 속의 변수를 나타내는 특수 식별자이다.
            field = if (value >= 0) value else 0
        }
}