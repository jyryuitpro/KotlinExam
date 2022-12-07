package ex_mutable_map_interface

fun main(args: Array<String>) {

    val map: MutableMap<String, String> = mutableMapOf()
    println(map)

    println(map.put("Hi", "일본어"))
    println(map)

    println(map.put("Hi", "중국어"))
    println(map)

    map["Hi"] = "안녕"
    println(map)

    map.putAll(mapOf("How is it going?" to "잘 지내?", "Bye!" to "잘 가!"))
    println(map)

    println(map.remove("Hi"))
    println(map)

    println(map.remove("Bye!", "잘"))
    println(map)

    println(map.remove("Bye!", "잘 가!"))
    println(map)

    map.clear()
    println(map)
}