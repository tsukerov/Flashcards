import kotlin.math.*

fun main() {
    val input = readLine()!!.toDouble()
    println("${floor((input - floor(input)) * 10).toInt()}")
}