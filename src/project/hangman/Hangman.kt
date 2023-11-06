package src.project.hangman

import kotlin.random.Random

class Hangman {
    private val words = listOf(
        "ample", "speech", "nature", "income", "affair", "basket", "police",
        "person", "cookie", "breath", "theory", "coffee", "agency", "wealth", "studio", "system",
        "safety", "moment", "thanks", "dealer"
    )

    private var word = ""
    private val guesses = arrayListOf<Char>()
    private var remainingGuesses = 6
    private var mistakes = 0;
    private var gameOver = false

    fun setupGame() {
        val randomWordIndex = Random.nextInt(words.size)
        word = words[randomWordIndex].uppercase()
        for (i in word.indices) guesses.add('_')
        printGameStatus()
        println(word)
        do {
            printGameStatus()
            println("Please enter a letter: ")
            val input = readlnOrNull() ?: ""
            if (input.isNullOrBlank()) {
                println("Please enter a valid input.")
            } else {
                val letter = input[0].uppercaseChar()
                if (word.contains(letter)) {
                    for (i in word.indices) {
                        if (word[i] == letter) {
                            guesses[i] = letter
                        }
                    }
                    if (!guesses.contains('_')) {
                        printGameStatus()
                        println("Congratulations, you won!")
                        gameOver = true
                    }
                } else {
                    println("Sorry, that ws not part of the word.")
                    remainingGuesses--
                    mistakes++
                    printGameStatus()
                    if (mistakes == 6) {
                        println("Sorry you lost!")
                        gameOver = true
                    }
                }
            }
        } while (!gameOver)
    }

    private fun printGameStatus() {
        when (mistakes) {
            0 -> printZeroMistakes()
            1 -> printOneMistakes()
            2 -> printTwoMistakes()
            3 -> printThreeMistakes()
            4 -> printFourMistakes()
            5 -> printFiveMistakes()
            6 -> printSixMistakes()
        }

        print("Word: ")
        for (element in guesses) {
            print("$element ")
        }
        println("\n")
        println("You have $remainingGuesses guess(es) left")
    }

    private fun printZeroMistakes() {
        println("  |--------|-")
        println("  |        | ")
        println("  |          ")
        println("  |            ")
        println("  |          ")
        println("  |           ")
        println(" /|\\         ")
        println("/ | \\        ")
    }

    private fun printOneMistakes() {
        println("  |--------|-")
        println("  |        | ")
        println("  |        O ")
        println("  |            ")
        println("  |          ")
        println("  |           ")
        println(" /|\\         ")
        println("/ | \\        ")
    }

    private fun printTwoMistakes() {
        println("  |--------|-")
        println("  |        | ")
        println("  |        O ")
        println("  |       /|  ")
        println("  |           ")
        println("  |           ")
        println(" /|\\         ")
        println("/ | \\        ")
    }

    private fun printThreeMistakes() {
        println("  |--------|-")
        println("  |        | ")
        println("  |        O ")
        println("  |       /|\\ ")
        println("  |          ")
        println("  |           ")
        println(" /|\\         ")
        println("/ | \\        ")
    }

    private fun printFourMistakes() {
        println("  |--------|-")
        println("  |        | ")
        println("  |        O ")
        println("  |       /|\\ ")
        println("  |        | ")
        println("  |          ")
        println(" /|\\         ")
        println("/ | \\        ")
    }

    private fun printFiveMistakes() {
        println("  |--------|-")
        println("  |        | ")
        println("  |        O ")
        println("  |       /|\\ ")
        println("  |        | ")
        println("  |       /   ")
        println(" /|\\         ")
        println("/ | \\        ")
    }

    private fun printSixMistakes() {
        println("  |--------|-")
        println("  |        | ")
        println("  |        O ")
        println("  |       /|\\ ")
        println("  |        | ")
        println("  |       / \\")
        println(" /|\\         ")
        println("/ | \\        ")
    }
}