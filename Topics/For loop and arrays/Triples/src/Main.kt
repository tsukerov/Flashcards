fun main() {
    val arrSize = readLine()!!.toInt()
    val arr = IntArray(arrSize)
    var count = 0

    for (i in 0..arrSize - 1) {
        arr[i] = readLine()!!.toInt()
    }
    for (i in 0..arrSize - 3) {
        if (arr[i] - arr[i + 1] == -1 && arr[i + 1] - arr[i + 2] == -1) count++
    }

    println(count)
}