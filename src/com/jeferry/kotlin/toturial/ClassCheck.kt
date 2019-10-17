package jeferry.kotlin.toturial

/**
 * 类型检测
 * Keyword : is , Any
 */
fun main() {
    var a = "123";
    var b = 1;
    println("a = $a is Int ? ${checkInt(a)}")
    println("b = $b is Int ? ${checkInt(b)}")

    println("\n检查字符串长度")

    val c = 123;
    val d = "abc";
    println("c = $c + , c.length =  ${checkStrLength(c)} \n")
    println("d = $d + , d.length =  ${checkStrLength(d)} \n")
    println("Any = Any + , Any.length =  ${checkStrLength(listOf(Any()))} \n")

}

fun checkInt(a: Any): Boolean = a is Int

/**
 * 检查字符串长度
 */
fun checkStrLength(obj: Any): Int? = if (obj is String) obj.length else null


