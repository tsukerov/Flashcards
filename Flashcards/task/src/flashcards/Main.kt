package flashcards

import java.io.File
data class CardInstance(val definition: String, val mistakes: Int)

val cardsMap = mutableMapOf<String, String>()
fun main() {
    var input = ""
    while (input != "exit") {
        println("Input the action (add, remove, import, export, ask, exit, log, hardest card, reset stats):")
        input = readLine()!!
        when (input) {
            "add" -> addCard()
            "remove" -> removeCard()
            "import" -> importCards()
            "export" -> exportCards()
            "ask" -> ask()
            "exit" -> println("Bye bye!")
            "log" -> logExport()
            "hardest card" -> hardestCard()
            "reset stats" -> resetStats()


        }

    }

}

fun addCard() {
    println("The card:")
    val card = readLine()!!
    if (card !in cardsMap.keys) {
        println("The definition of the card:")
        val definition = readLine()!!
        if (definition !in cardsMap.values) {
            println("The pair (\"$card\":\"$definition\") has been added.")
            cardsMap[card] = definition
        } else println("The definition \"$definition\" already exists.")

    } else println("The card \"$card\" already exists.")

}

fun removeCard() {
    println("Which card?")
    val card = readLine()!!
    if (card in cardsMap.keys) {
        cardsMap.remove(card)
        println("The card has been removed.")
    } else println("Can't remove \"$card\": there is no such card.")

}

fun importCards() {
    println("File name:")
    var count = 0
    val file = File(readLine()!!)
    if (file.exists()) {
        file.forEachLine {
            val pair = it.split("\t")
            cardsMap[pair[0]] = pair[1]
            count++
        }
        println("$count cards have been loaded.")
    } else println("File not found.")


}

fun exportCards() {
    println("File name:")
    val file = File(readLine()!!)
    if (file.exists()) file.writeText("")

    var count = 0
    for (card in cardsMap) {
        file.appendText("${card.key}\t${card.value}\n")
        count++
    }
    println("$count cards have been saved.")

}

fun ask() {
    println("How many times to ask?")
    val numOfTimes = readLine()!!.toInt()
    var count = 0
    while (count < numOfTimes) {
        for (card in cardsMap) {
            print("Print the definition of \"${card.key}\":\n")
            val answer = readLine()!!
            println(
                if (answer == card.value) "Correct!"
                else if (cardsMap.containsValue(answer)) "Wrong. The right answer is \"${card.value}\", but your definition is correct for \"${cardsMap.filterValues { it == answer }.keys.first()}\"."
                else
                    "Wrong. The right answer is \"${card.value}\"."
            )
            count++
            if (count >= numOfTimes) break
        }

    }
}

fun logExport() {

}

fun hardestCard() {

}

fun resetStats() {

}

fun createCards(amount: Int): MutableMap<String, String> {
    val cardsMap = mutableMapOf<String, String>()
    for (i in 1..amount) {
        var term = ""
        var definition = ""
        print("Card #$i:\n")
        do {
            var isUnique = true
            term = readLine()!!
            if (term in cardsMap.keys) {
                println("The term \"$term\" already exists. Try again:")
                isUnique = false
            }
        } while (!isUnique)

        print("The definition for card #$i:\n")

        do {
            var isUnique = true
            definition = readLine()!!
            if (definition in cardsMap.values) {
                println("The definition \"$definition\" already exists. Try again:")
                isUnique = false
            }
        } while (!isUnique)
        cardsMap[term] = definition
    }
    return cardsMap
}

fun testCards(cards: MutableMap<String, String>) {
    for (card in cards) {
        print("Print the definition of \"${card.key}\":\n")
        val answer = readLine()!!
        println(
            if (answer == card.value) "Correct!"
            else if (cards.containsValue(answer)) "Wrong. The right answer is \"${card.value}\", but your definition is correct for \"${cards.filterValues { it == answer }.keys.first()}\"."
            else
                "Wrong. The right answer is \"${card.value}\"."
        )
    }
}


