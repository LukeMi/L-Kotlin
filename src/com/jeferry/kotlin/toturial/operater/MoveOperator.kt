package jeferry.kotlin.toturial.operater

var x = 8
var y = 5
val offSet = 1
/**
 * 位运算符号
 */
fun main(args: Array<String>) {
    println(" 位运算符")
    println(" shl - 左移 \n shr - 右移 \n ushr - 无符号右移 \n and - 位与\n or - 位或 \n xor - 位异或 \n inv - 位非\n")
    println("x = $x")
    println("y = $y")
    println("offSet = $offSet")

    println("x shl offSet = ${x shl offSet}")
    println("x shr offSet = ${x shr offSet}")
    println("x ushr offSet = ${x ushr offSet}")
    println("x and y = ${x and y}")
    println("x or y = ${x or y}")
    println("x xor y = ${x xor y}")
    println("x.inv() = ${x.inv()}")
}