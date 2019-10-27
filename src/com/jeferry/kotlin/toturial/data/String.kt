package jeferry.kotlin.toturial.data

val string: String = "Hello \'KOTLIN\'"
var charArrayOf = String(charArrayOf('h', 'e', 'l', 'l', 'o', ',', 'w', 'o', 'r', 'l', 'd'))
var charArrayOfSet = String(charArrayOf('h', 'e', 'l', 'l', 'o', ',', 'w', 'o', 'r', 'l', 'd'), 2, 3)
var byteArrayOf = String(byteArrayOf(1, 2, 3))
var byteArrayOfSet = String(byteArrayOf(1, 2, 3, 4, 5, 6), 2, 2)
var stringBufferConstructor = String(stringBufferConstructor())
var stringBuilderConstructor = String(stringBuilderConstructor())

fun main() {
    println("string = $string")
    println("CharArray 为形式参数的构造器 ： " + charArrayOf)
    println("charArrayOfSet 为形式参数的构造器 ➕ 偏移量 ： " + charArrayOfSet)
    println("ByteArray 为形式参数的构造器 ： " + byteArrayOf)
    println("ByteArray 为形式参数的构造器 ➕ 偏移量 ： " + byteArrayOfSet)
    println("StringBuffer 为形式参数的构造器 ： " + stringBufferConstructor)
    println("StringBuilder 为形式参数的构造器 ： " + stringBuilderConstructor)
}

fun stringBufferConstructor(): StringBuffer {
    var stringBuffer = StringBuffer()
    stringBuffer.append(1)
    stringBuffer.append(2.0f)
    stringBuffer.append(3.0)
    stringBuffer.append('c')
    stringBuffer.append("StringBuffer")
    return stringBuffer
}

fun stringBuilderConstructor(): StringBuilder {
    var sb = StringBuilder()
    sb.append(1)
    sb.append(2.0f)
    sb.append(3.0)
    sb.append('c')
    sb.append("StringBuilder")
    return sb
}