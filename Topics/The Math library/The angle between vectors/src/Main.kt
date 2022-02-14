import kotlin.math.*

fun main() {
    val vector1 = readLine()!!.split(" ")
    val vector2 = readLine()!!.split(" ")

    val v1Length = hypot(vector1[0].toDouble(), vector1[1].toDouble())
    val v2Length = hypot(vector2[0].toDouble(), vector2[1].toDouble())
    val vectorsProduct = vector1[0].toDouble() * vector2[0].toDouble() + vector1[1].toDouble() * vector2[1].toDouble()

    val angle = acos(vectorsProduct / (v1Length * v2Length))
    println(angle * 180 / PI)

}