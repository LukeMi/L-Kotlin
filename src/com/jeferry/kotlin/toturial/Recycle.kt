package jeferry.kotlin.toturial

/**
 * for 循环
 * keyword  for listOf , in
 */
fun main() {
    val list = listOf("a", 1, true)

    for (item in list) {
        println("item = $item")
    }

    println("\n打印索引\n")
    for (index in list.indices) {
        println("index = $index ,item = ${list[index]}")
    }
//    whileOperate()
    testWhenOperate()
}

fun whileOperate() {
    println("\n while 循环 \n")
    var list = listOf(1, 3, 6)
    var index = 0;
    while (index < list.size) {
        println(" list[$index] = ${list[index]}")
        index++;
    }
}

fun testWhenOperate() {
    println("\n when keyword \n")
    println(testWhenOperate(1))
    println(testWhenOperate(2))
    println(testWhenOperate(3L))
    println(testWhenOperate(true))
    println(testWhenOperate("true"))
    println(testWhenOperate(1.1))
}

fun testWhenOperate(any: Any): String = when (any) {
    1 -> "one"
    is Int -> "Int Type"
    is Long -> "Long Type"
    is Boolean -> "Boolean Type"
    is String -> "String Type"
    else -> "unknown"
}
