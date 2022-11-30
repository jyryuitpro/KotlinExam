package ex_member_function

import java.util.Calendar.Builder

class Building {
    var name = ""
    var date = ""
    var area = 0

    fun print() {
        println("이름: " + this.name)
        println("건축일자: " + this.date)
        println("면적: " + this.area)
    }
}

//fun printBuilding(building: ex_member_function.Building) {
//    println("이름: " + building.name)
//    println("건축일자: " + building.date)
//    println("면적: " + building.area)
//}