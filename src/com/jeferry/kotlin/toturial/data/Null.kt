package jeferry.kotlin.toturial.data

fun main(args: Array<String>) {
    println(" ParamsType? - 可为空操作符 \n ?. - 安全操作符 \n ?: - Elvis操作符 \n !! - 抛出空异常")
    var address: String? = null
    var name: String = "jeferry"
    println("address = $address")
    println("name = $name")
    println("address.length = ${address?.length} ")
    println("address.length = ${address?.length ?: -1} ")
    println()
}