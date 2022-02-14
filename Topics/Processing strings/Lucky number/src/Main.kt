fun main() {
    val input = readLine()!!
    var sum1 = 0
    var sum2 = 0
    for(i in 0 until (input.length)/2) {
        sum1 += input[i].toInt()
        sum2 += input[i + input.length/2].toInt()
    }
    if(sum1 == sum2) println("YES") else println("NO")

}