package jeferry.kotlin.toturial.data

val a: Char = 'a'
val b: Char = 'b'
val c: Char = 'b'

//字符型
var cChar: Char = 'a'
var numChar: Char = '0'
var uniCodeChar: Char = '\u7231'
var yiChar: Char = '\n'

fun main() {
    println("a = $a")
    println("b = $b")
    println("c = $c")
    println("a == b ? ${a == b}")
    println("c == b ? ${c == b}")
    println("c === b ? ${c === b}")

    println(
        "\n转义字符\n" +
                "\\t - 制表符 \n" +
                "\\r - 回车符 \n" +
                "\\n - 换行符 \n" +
                "\\\' - 单引号 \n" +
                "\\\" - 双引号 \n" +
                "\\\\ - 反斜杠 \n" +
                "\\\$ - 美元符号，模板符号 "
    )

    println("\n字符类型 Char\n转义字符 : $yiChar ,char 类型 : $cChar ,数字 char 类型 : $numChar , unicode 字符类型: $uniCodeChar ")

}