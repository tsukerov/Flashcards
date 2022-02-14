fun main() {
    val input = readLine()!!.toInt()
    when {
        input < 1 -> println("no army")
        input in 1..4 -> println("few")
        input in 5..9 -> println("several")
        input in 10..19 -> println("pack")
        input in 20..49 -> println("lots")
        input in 50..99 -> println("horde")
        input in 100..249 -> println("throng")
        input in 250..499 -> println("swarm")
        input in 500..999 -> println("zounds")
        input >= 1000 -> println("legion")
    }
}