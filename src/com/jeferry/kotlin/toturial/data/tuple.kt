package jeferry.kotlin.toturial.data

/**
 * 元组类型
 */
fun main(args: Array<String>) {
    val (code, msg) = kotlin.Pair(210, "导航到乘客起点")
    val (opcode, navi, title) = kotlin.Triple(310, "导航行程终点", "开始出发")

    println("code : $code ;msg : $msg")
    println("opcode :  +$opcode ;navi : + $navi ;title ： $title")
}