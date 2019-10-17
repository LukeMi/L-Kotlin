package jeferry.kotlin.toturial

/**
 * 空值检测
 * keyworld ?:
 */
fun main() {

    println("测试对象为 123 字符串")
    println("${parseInt("123")} \n")

    println("测试对象为 a 字符串")
    println("${parseInt("a")} \n")

    val a = parseInt("9")
    val b = parseInt("b")

    if (a != null && b != null) {
        println("a and b are all number , a = $a , b = $b")
    } else {
        println("a and b are not all number , a = $a , b = $b")
    }

    val c = "adc";
    val d = "123";
    println("c = $c  ${parseInt(c) ?: "is not Int"}  ")
    println("d = $d  ${parseInt(d) ?: "is not Int"}  ")
}

fun parseInt(str: String): Int? = str.toIntOrNull()

fun print(a: String, b: String) {

}
