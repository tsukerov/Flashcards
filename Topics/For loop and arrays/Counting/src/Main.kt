fun main() {
    val n = readLine()!!.toInt()
    val arr = IntArray(n)
    for (i in 0 until n) {
        arr[i] = readLine()!!.toInt()
    }
    val m = readLine()!!.toInt()
    var count = 0
    for (i in arr) {
        if (i == m) {
            count++
        }
    }
    println(count)
}