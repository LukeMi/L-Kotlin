package jeferry.kotlin.toturial.operater

/**
 * 赋值运算符
 */
var c = 7
var d = 3
fun main(args: Array<String>) {
    println("赋值运算符")
    println(" = - 赋值\n += - 加 \n -= - 减\n *= - 乘\n /= - 除\n %= - 取余\n")

    println("c = $c")
    println("d = $d")
    d += c
    println("d += c = $d")
    d -= c
    println("d -= c = $d")
    d *= c
    println("d *= c = $d")
    d /= c
    println("d /= c = $d")
    d %= c
    println("d %= c = $d")
}