fun main() {
    val n = readLine()!!.toInt()
    val arr = IntArray(n)
    for (i in 0 until n) {
        arr[i] = readLine()!!.toInt()
    }
    val m = readLine()!!.toInt()
    var isContain = false
    for (i in arr) {
        if (i == m) {
            isContain = true
        }
    }
    println(if (isContain) "YES" else "NO")
}