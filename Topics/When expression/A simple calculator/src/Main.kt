fun main() {
    val (a, o, b) = readLine()!!.split(" ")
    when (o) {
        "+" -> println(a.toLong().plus(b.toLong()))
        "-" -> println(a.toLong().minus(b.toLong()))
        "/" -> {
            if (b.toLong().equals(0L)) println("Division by 0!")
            else {
                println(a.toLong().div(b.toLong()))
            }
        }
        "*" -> println(a.toLong().times(b.toLong()))
        else -> println("Unknown operator")
    }
}