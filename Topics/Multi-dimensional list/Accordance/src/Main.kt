fun main() {
    val list = mutableListOf(
        mutableListOf("", "", ""),
        mutableListOf("", "", "")
    )
    for (i in 0..1) {
        for (j in 0..2) {
            list[i][j] = "[$i][$j]"
        }
    }
    println(list)

}