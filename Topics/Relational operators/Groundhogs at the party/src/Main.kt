fun main() {
    val cups = readLine()!!.toInt()
    val isWeekend = readLine()!!.toBoolean()
    val isSuccessful: Boolean = (cups in 10..20 && !isWeekend) || (cups in 15..25 && isWeekend)
    println(isSuccessful)

}