package jeferry.kotlin.toturial

/**
 * 基本数据类型
 */
// Boolean 类型数据
val boo: Boolean = true

// Number 数据类型
// 整型
const val aShort: Short = 1;
const val aInt: Int = 2
const val aTeInt: Int = 0x000003
const val aLong: Long = Long.MAX_VALUE
// 浮点型
const val aFloat: Float = 5.0f
const val aDouble: Double = 6.0
// 字节型
const val aByte = Byte.MIN_VALUE

//字符型
var cChar: Char = 'a'
var numChar: Char = '0'
var uniCodeChar: Char = '\u7231'
var yiChar: Char = '\n'

fun main() {

    println(if (boo) "boo is true" else "boo is false")

    println("短整型 : $aShort")
    println("十进制整型 : $aInt")
    println("十六进制整型 : $aTeInt")
    println("长整型 : $aLong")
    println("单精度浮点型 : $aFloat")
    println("双精度浮点型 : $aDouble")
    println("字节型 : $aByte")

    println("\n\t\t\t字符类型 Char\n转义字符 : $yiChar ,char 类型 : $cChar ,数字 char 类型 : $numChar , unicode 字符类型: $uniCodeChar ")

    println("\n\t\t\t转义字符\n \\t - 制表符 ; \\r - 回车符 ; \\n - 换行符 ; \\' - 单引号 ; \\\" - 双引号 ; \\\\ - 反斜杠,\\\$ - 美元符号，模板符号 ")

    var charArrayOf = charArrayOf('H', 'e', 'l', 'l', 'o', '\t', 'w', 'o', 'l', 'd')
    var string = String(charArrayOf)
    println("\n\t\t\t字符串 String\n $string" + "\t" + aInt)
}