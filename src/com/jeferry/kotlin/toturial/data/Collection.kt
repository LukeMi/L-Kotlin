package jeferry.kotlin.toturial.data

/**
 * 集合
 */
fun main(args: Array<String>) {
    println(
        " Iterable \n " +
                "MutableIterable - 可变\n " +
                "Collection \n " +
                "MutableCollection - 可变\n " +
                "List \n " +
                "MutableList - 可变\n " +
                "Set \n " +
                "MutableSet - 可变\n " +
                "Map \n " +
                "MutableMap - 可变"
    )

    var emptyList = emptyList<String>()
    var list = listOf<Int>(1, 5, 8, 4)

    var size = list.size
    var contains = list.contains(2)
    var indexOf = list.indexOf(2)
    var get = list.get(1)
    var lastIndex = list.lastIndex
    var subList = list.subList(1, 2)
    var lastIndexOf = list.lastIndexOf(4)
    var empty = list.isEmpty()
    var nullOrEmpty = list.isNullOrEmpty()
    var indices = list.indices

    println("emptyList.size = ${emptyList.size}")
    println("size : $size")
    println("contains : $contains")
    println("indexOf : $indexOf")
    println("get : $get")
    println("lastIndex : $lastIndex")
    println("subList : $subList")
    println("lastIndexOf : $lastIndexOf")
    println("empty : $empty")
    println("nullOrEmpty : $nullOrEmpty")
    println("indices : $indices")
    var iterator = list.iterator()
    while (iterator.hasNext()) {
        var next = iterator.next()
        println("next : $next")
        if (next == 2) {

        }
    }

}