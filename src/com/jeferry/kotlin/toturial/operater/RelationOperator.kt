package jeferry.kotlin.toturial.operater

/**
 * 关系运算符
 */
var i = 4
var j = 6
var k = i
fun main() {
    println("关系运算符")
    println(
        " < - 小于 \n " +
                "> - 大于 \n " +
                "<= - 小于等于\n " +
                ">= - 大于等于\n " +
                "== - 等于 \n " +
                "!= - 不等于\n " +
                "=== - 恒等于\n " +
                "!== - 非恒等于 "
    )
    println()
    println("i = $i")
    println("j = $j")
    println("k = $k")
    println("i < j = ${i < j}")
    println("i > j = ${i > j}")
    println("i <= j = ${i <= j}")
    println("i >= j = ${i >= j}")
    println("i == k = ${i == k}")
    println("i != k = ${i != k}")
    println("i === k = ${i === k}")
    println("i !== k = ${i !== k}")
}