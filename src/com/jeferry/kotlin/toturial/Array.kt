package jeferry.kotlin.toturial

fun main() {
    var list = listOf('H', 'e', 'l', 'l', 'o')
    println(list.indices)
    list.forEach { print(it) }
    var indexOf = list.indexOf('l')
    println("\n${indexOf}")
}