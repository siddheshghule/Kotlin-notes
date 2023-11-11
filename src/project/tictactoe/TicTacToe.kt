package src.project.tictactoe

import kotlin.random.Random

class TicTacToe() {

    private var board = arrayListOf<ArrayList<String>>()

    init {
        populateEmptyBoard()
    }


    private fun populateEmptyBoard() {

        for (i in 0..2) {
            val row = arrayListOf<String>()
            for (j in 0..2) row.add("")
            board.add(row)
        }
    }

    private fun printBoard() {
        println("___________")
        board.forEach { row ->
            row.forEach { column ->
                when (column) {
                    "X" -> print("| X ")
                    "O" -> print("| O ")
                    else -> print("|   ")
                }
            }
            println("|")
        }
        println("___________")
    }

    fun inputValue() {
        var continueGame = true
        do {
            println("Please enter rows(1-3) and column(1-3), e.g. 1, 2: ")
            val input = readlnOrNull() ?: ""
            var splitValues = input.split(",")
            var x = splitValues[0].trim().toInt()
            var y = splitValues[1].trim().toInt()
            var skipRound = false

            if (board[x - 1][y - 1] != "") {
                println("Sorry, this position is not empty")
                skipRound = true
            } else {
                board[x - 1][y - 1] = "X"
                printBoard()
            }

            if (!skipRound) {
                var playerWon = checkWinner(true)
                if (playerWon) {
                    println("Congratulations, You have won!!")
                    continueGame = false
                    break
                }

                if (checkBoardFull() && !playerWon) {
                    println("It's a tie!!")
                    continueGame = false
                }

                if(continueGame){
                    placeComputerMove()
                    printBoard()
                    var computerWon = checkWinner(false)
                    if(computerWon){
                        println("Computer Won!!")
                        continueGame = false
                        break
                    }
                }

            }
        } while (continueGame)


    }

    private fun checkWinner(isPlayer: Boolean): Boolean {
        var won = false
        var checkSymbol = if (isPlayer) "X" else "O"
        for (i in 0..2) {
            // Check Horizontal
            if (board[i][0] == checkSymbol && board[i][1] == checkSymbol && board[i][2] == checkSymbol) {
                won = true
                break
            }
            // Check Vertical
            if (board[0][i] == checkSymbol && board[1][i] == checkSymbol && board[2][i] == checkSymbol) {
                won = true
                break
            }
        }
        // Check Diagonal
        if ((board[0][0] == checkSymbol && board[1][1] == checkSymbol && board[2][2] == checkSymbol) ||
            (board[2][0] == checkSymbol && board[1][1] == checkSymbol && board[0][2] == checkSymbol)
        ) {
            won = true
        }
        return won
    }

    private fun checkBoardFull(): Boolean {
        for (i in 0..2) {
            for (j in 0..2) {
                if (board[i][j] == "") {
                    return false
                }
            }
        }
        return true
    }

    private fun placeComputerMove() {
        var i = 0
        var j = 0
        do {
            i = Random.nextInt(3)
            j = Random.nextInt(3)
        } while (board[i][j] != "")
        board[i][j] = "O"
    }
}