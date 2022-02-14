fun main() {
    val arrSize = readLine()!!.toInt()
    val arr = IntArray(arrSize)
    for (i in 0 until arrSize) {
        arr[i] = readLine()!!.toInt()
    }
    print(arr[arrSize - 1])
    for (i in 0 until arrSize - 1) {
        print(" ${arr[i]}")
    }
}