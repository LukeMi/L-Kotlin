package jeferry.kotlin.toturial.`class`

import java.text.SimpleDateFormat
import java.util.*

class Kotlin(createTime: String = "1970/01/01") {

    var createTime = createTime

    private var  a : Int = 7;

    init {
        println("${this.javaClass.simpleName} :  init method at ${formatDate(System.currentTimeMillis())} ")
    }

    private fun formatDate(timeMill: Long): String {
        var sdf = SimpleDateFormat("yyyy/MM/dd HH:mm:ss")
        return sdf.format(Date(timeMill));
    }

    fun getA() = a
}