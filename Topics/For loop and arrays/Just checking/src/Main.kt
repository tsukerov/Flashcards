fun main() {
    val n = readLine()!!.toInt()
    val arr = IntArray(n)
    for (i in 0 until n) {
        arr[i] = readLine()!!.toInt()
    }

    val (p, m) = readLine()!!.split(" ")
    var containM = false
    var containP = false
    for (i in arr) {
        if (i == m.toInt()) {
            containM = true
        }
        if (i == p.toInt()) {
            containP = true
        }

    }
    println(if (containM && containP) "YES" else "NO")
}