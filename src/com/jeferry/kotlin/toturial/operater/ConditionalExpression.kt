package jeferry.kotlin.toturial.operater

/**
 * 条件表达式
 */
fun main() {
    println("比较最小值")
    println("a = 3， b = 4 ,最小值 = ${min(3, 4)} \n")

    println("比较最大值")
    println("a = 5， b = 6 ,最大值 = ${max(5, 6)} \n")

    println("两个数是否相等")
    println("a = 8， b = 9 ,相等 = ${equal(8, 9)} \n")
}

fun min(a: Int, b: Int): Int {
    return if (a >= b) b else a
}

fun max(a: Int, b: Int) = if (a >= b) a else b

fun equal(a: Int, b: Int) = a == b


