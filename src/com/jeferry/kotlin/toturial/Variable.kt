package jeferry.kotlin.toturial

/**
 * var 可以多次赋值
 * val 只能一次赋值
 */
var i = 0

val j: Int = 2

fun main() {

    /**
     * 先申明
     */
    val a: Int = 1;

    /**
     * 自动推断
     */
    val b = 2;

    /**
     * 先申明，后赋值
     */
    val c: Int
    c = 3

    println("test val keyword")
    println("a = $a ,b = $b, c = $c \n")

    var d: Long = 4;
    d--
    println("test var keyword")
    println("d = $d")


}