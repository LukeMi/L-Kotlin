package jeferry.kotlin.toturial.data

/**
 * 基本数据类型
 */
// Boolean 类型数据
val boo: Boolean = true

// Number 数据类型
// 整型
const val aShort: Short = 1;
const val maxShort: Short = Short.MAX_VALUE;
const val minShort: Short = Short.MIN_VALUE;
const val aInt: Int = 2
const val aTeInt: Int = 0x000003
val maxInt: Int = Int.MAX_VALUE
val minInt: Int = Int.MIN_VALUE
const val aLong: Long = Long.MAX_VALUE
val maxLong = Long.MAX_VALUE
val minLong = Long.MIN_VALUE

// 浮点型
const val aFloat: Float = 5.0f
val maxFloat: Float = Float.MAX_VALUE
val minFloat: Float = Float.MIN_VALUE
val aDouble: Double = 1.00
val maxDouble: Double = Double.MAX_VALUE
val minDouble: Double = Double.MIN_VALUE
// 字节型
const val aByte: Byte = 1
const val maxByte = Byte.MAX_VALUE
const val minByte = Byte.MIN_VALUE

fun main() {

    println(if (boo) "boo is true" else "boo is false")

    println("短整型 : $aShort")
    println("Short 最大值： $maxShort")
    println("Short 最小值： $minShort")

    println("十进制 整型 : $aInt")
    println("十六进制 整型 : $aTeInt")
    println("Int 最大值： $maxInt")
    println("Int 最小值： $minInt")

    println("长整型 : $aLong")
    println("Long 最大值： $maxLong")
    println("Long 最小值： $minLong")

    println("单精度浮点型 : $aFloat")
    println("Float 最大值： $maxFloat")
    println("Float 最小值： $minFloat")

    println("双精度浮点型 : $aDouble")
    println("Double 最大值： $maxDouble")
    println("Double 最小值： $minDouble")

    println("字节型 : $aByte")
    println("Byte 最大值： $maxByte")
    println("Byte 最小值： $minByte")

    println("\n\t\t\t显示转换")
    println("toByte() ${aByte.toByte()}")
    println("toShort() ${aByte.toShort()}")
    println("toInt() ${aByte.toInt()}")
    println("toLong() ${aByte.toLong()}")
    println("toFloat() ${aByte.toFloat()}")
    println("toDouble() ${aByte.toDouble()}")


    var charArrayOf = charArrayOf('H', 'e', 'l', 'l', 'o', '\t', 'w', 'o', 'l', 'd')
    var string = String(charArrayOf)
    println("\n\t\t\t字符串 String\n $string" + "\t" + aInt)

    numBox()

    byte()

    floatFun()

    booFun()
}

/**
 * 数字装箱
 */
private fun numBox() {
    println("\n\t\t\t数字装箱不一定保留同一性，保留相等性")
    val a = 1_000
    val b = 1_000
    println("(a = $a) === (b = $b) ? ${a === b}")
    println("(a = $a) == (b =$b) ? ${a == b}")
    val boxA: Int? = a
    val anotherBoxA: Int? = a
    println("(boxA = $boxA) === (anotherBoxA = $anotherBoxA) ? ${boxA === anotherBoxA} -- 不保证同一性")
    println("(boxA = $boxA) == (anotherBoxA = $anotherBoxA) ? ${boxA == anotherBoxA} -- 保留相等性")
}

/**
 * 位运算符
 */
fun byte() {
    println("\n\t\t\t位运算符: shl(左移) , shr(右移) , ushr(无符号右移) , and(且) , or(或) , xor(异或)")
    var a = 8
    var b = 4
    var c = 8
    println("a = $a shl = ${a shl 1}") // 左移
    println("a = $a shr = ${a shr 1}") // 右移
    println("a = $a ushr = ${a ushr 1}") // 无符号右移
    println("a and b ; $a and $b = ${a and b}") // 且
    println("a or b ; $a or $b = ${a or b}") // 或
    println("a xor c ; $a xor $c = ${a xor c}") // 异或
}

fun floatFun() {
    println("\n\t\t\t 浮点数比较： 相等性检测 == != ; 比较操作符：<(小于) ， >(大于) ， <=(小于等于) ， >=(大于等于) ； 区间实例区间检测：a..b ，x in a..b，x !in a..b  ")
    val a = 1
    val b = 10
    val c = 5
    println("$a == $b ? ${a == b}")
    println("$a != $b ? ${a != b}")
    println(a..b)
    println("$c in $a .. $b ? ${c in a..b}")
    println("$c not in $a .. $b ? ${c in a..b}")
}

fun booFun() {
    println("\n\t\t\t Boolean 操作符 ||(短路逻辑或) , &&(短路逻辑与) ，!(逻辑非)  ")
    var aBoo = true;
    var bBoo = false;
    println("$aBoo || $bBoo ? ${aBoo || bBoo}")
    println("$aBoo && $bBoo ? ${aBoo && bBoo}")
    println("!$aBoo  ? ${!aBoo} ")
}
