package jeferry.kotlin.toturial

fun main() {

    range(14, 1, 11)

    range(4, 1, 11)
}

private fun range(value: Int, fromIndex: Int, endIndex: Int) {
    if (value in fromIndex..endIndex) {
        println("value = $value is inside of the range [fromIndex , $fromIndex ]")
    } else {
        println("value = $value is outside of the range [fromIndex , $fromIndex ]")
    }
}