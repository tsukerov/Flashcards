fun main() {
    val input = readLine()!!
    val vowels = "aeiouy"
    var countVowels = 0
    var countCons = 0
    var minNum = 0
    for (ch in input) {
        if (ch in vowels) {
            countVowels++
            countCons = 0
        } else {
            countCons++
            countVowels = 0
        }
        if (countVowels == 3) {
            minNum++
            countVowels = 1
        }
        if (countCons == 3) {
            minNum++
            countCons = 1
        }
    }
    println(minNum)
}
