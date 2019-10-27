package jeferry.kotlin.toturial.data

fun main(args: Array<String>) {
    var arrayOf = arrayOf(1, 'a', true, "string")
    var size = arrayOf?.size
    var indices = arrayOf.indices
    var indexOf = arrayOf.indexOf(true)
    var contains = arrayOf.contains("string")
    var get = arrayOf.get(2)
    println("array size : ${size}")
    println("array indices : ${indices}")
    println("array contains : ${contains}")
    println("array get : ${get}")

    println("\n循环打印")
    for (a in arrayOf) {
        println(a)
    }
}