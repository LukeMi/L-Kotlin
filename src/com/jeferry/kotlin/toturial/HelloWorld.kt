package com.jeferry.kotlin.toturial

var i = 0

fun main(args: Array<String>) {
    println("hello kotlin")
    println(++i)
    print(9)
    println(nullJudge(null))
    println(nullJudge("123"))
    print("1 + 2 = ")
    println(sum(1, 2));

    println("1 + 2 + 3 = + ${sum(1, 2, 3)} ")
    println()

    printSum(9, 6)
    println()

    printSumWithUnit(7, 6)
    println()

}

fun print(a: Int) {
    println(a.toString() + "a : $a")
    println(a.toString())

}

fun nullJudge(s: String?): String {
    return if (s.isNullOrEmpty()) {
        "qqqq"
    } else {
        s
    }
}

fun sum(a: Int, b: Int): Int {
    return a + b;
}

/**
 * @param a 第一个参数
 * @param b 第二️个参数
 * @param a 第一个参数
 */
fun sum(a: Int, b: Int, c: Int) = a + b + c

fun printSumWithUnit(a: Int, b: Int): Unit {
    println("a + b = ${a + b} ")
}

/**
 * #printSumWithUnit 的 简写
 */
fun printSum(a: Int, b: Int) {
    println("a + b = ${a + b}")
}

