fun main() {
    var output = "YES"
    val n = readLine()!!.toInt()
    val nums = mutableListOf<Int>()
    for (i in 0 until n) {
        nums.add(readLine()!!.toInt())
    }
    for (i in 0 until nums.size - 1) {
        if (nums[i] >= nums[i + 1]) output = "NO"
    }
    println(output)
}