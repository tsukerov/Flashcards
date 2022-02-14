fun main() {
    val list = mutableListOf<Int>()
    repeat(3) {
        list.add(readLine()!!.toInt())
    }
    println(list[0] != list[1] && list[1] != list[2] && list[0] != list[2])
}