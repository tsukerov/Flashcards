import kotlin.math.*

fun main() {
    val a = readLine()!!.toDouble()
    val b = readLine()!!.toDouble()
    val c = readLine()!!.toDouble()

    val d = b.pow(2) - 4 * a * c
    val result = mutableListOf<Double>()
    result.add((0 - b + sqrt(d)) / (2 * a))
    result.add((0 - b - sqrt(d)) / (2 * a))
    result.sort()
    println("${result[0]} ${result[1]}")

}