package jeferry.kotlin.toturial.`class`

fun main() {
    var kotlin = Kotlin()
    println("默认时间：${kotlin.createTime}")
    kotlin.createTime = "2019/10/18"
    println("设置时间：${kotlin.createTime}")
    var k2 = Kotlin("1946/02/03")
    var a = k2.getA()
    println("构造时间：${k2.createTime} ; a参数 ：${a}")
}