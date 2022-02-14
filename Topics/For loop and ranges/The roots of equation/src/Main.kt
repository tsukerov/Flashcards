import kotlin.math.pow

fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    val d = readLine()!!.toInt()

    for (x in 0..1000) {
        if (a * x.toDouble().pow(3) + b * x.toDouble().pow(2) + c * x + d == 0.0) {
            println(x)
        }
    }

}