fun main() {
    when (readLine()!!) {
        "triangle" -> {
            val a = readLine()!!.toDouble()
            val b = readLine()!!.toDouble()
            val c = readLine()!!.toDouble()
            println(
                "${
                    kotlin.math.sqrt(
                        (a + b + c) / 2 *
                                ((a + b + c) / 2 - a) * ((a + b + c) / 2 - b) * ((a + b + c) / 2 - c)
                    )
                }"
            )
        }
        "rectangle" -> {
            val a = readLine()!!.toDouble()
            val b = readLine()!!.toDouble()
            println("${a * b}")
        }
        "circle" -> {
            val r = readLine()!!.toDouble()
            println("${3.14 * r * r}")
        }
    }
}