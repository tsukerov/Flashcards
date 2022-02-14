fun main() {
    val ch = readLine()!!.first()

    print(ch.isDigit() && ch != '0' || ch.isUpperCase())
}