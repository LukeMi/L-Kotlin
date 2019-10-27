package jeferry.kotlin.toturial.data

fun main(args: Array<String>) {
    var mutableMapOf = mutableMapOf(1 to "one", 2 to "two", 3 to "three")
    var empty = mutableMapOf.isEmpty()
    var notEmpty = mutableMapOf.isNotEmpty()
    var nullOrEmpty = mutableMapOf.isNullOrEmpty()
    var size = mutableMapOf.size
    var containsKey = mutableMapOf.containsKey(2)
    var containsValue = mutableMapOf.containsValue("one")
    println(mutableMapOf.toString())
    var remove = mutableMapOf.remove(1)
    println(mutableMapOf.toString())
    var put = mutableMapOf.put(4, "four")
    var replace = mutableMapOf.replace(3, "threee")
    println("empty = $empty")
    println("notEmpty = $notEmpty")
    println("nullOrEmpty = $nullOrEmpty")
    println("size = $size")
    println("containsKey = $containsKey")
    println("containsValue = $containsValue")
    println("remove = $remove")
    println("put = $put")
    println("replace = $replace")
    println(mutableMapOf.toString())
}