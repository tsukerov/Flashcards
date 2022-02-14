fun main() {
    val n = readLine()!!.toInt()
    var min = readLine()!!.toInt()
    var number: Int
    for (i in 1 until n) {
        number = readLine()!!.toInt()
        if (number < min) min = number
    }
    println(min)
}