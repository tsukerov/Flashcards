fun main() {
    val input = mutableListOf<Int>()
    var output = false
    var onePositive = false
    repeat(3) {
        input.add(readLine()!!.toInt())
    }
    for (i in input) {
        if (i > 0 && !onePositive) {
            onePositive = true
            output = true
        } else if (i > 0 && onePositive) {
            output = false
        }
    }
    println(output)
}