import kotlin.random.Random

fun main(args: Array<String>) {
//    println("Hello String")
//    println("String with escape character backslash \\, and quotes \".")
//
//    var age = 20
//    println("age:$age")
//    age += 1
//    println("age:$age")
//
//    val catName = "Fluffy"
//    println("My cat's name is \"$catName\"")
//
//    var slashes = "Two types of slashesh \\ and /"
//    println(slashes)
//
//    var url = "https://www.google.com"
//    println(url)
//    println("The length of url is ${url.length}")
//
//    // Drawing Bunny
//
//    println("(\\(\\")
//    println("(-.-)")
//    println("O_(\")(\")")

//    println("Enter user input")
//    val userInput = readLine()?:"" // if empty then use "" (empty string)
//    println("Your input times 5 is: ${userInput.toInt()*5}")

//    println("Random.nextDouble(): ${Random.nextDouble()}")
//    println("Random.nextInt(): ${Random.nextInt()}") // random integer
//    println("Random.nextInt(1, 9): ${Random.nextInt(1, 9)}") // random integer 1 till 8
//    println("Random.nextInt(10): ${Random.nextInt(10)}") // random integer less than 10

//    println("What is your name?")
//    val name =  readLine()
//    println("Welcome, $name")

//    print("Enter a number:")
//    val number = readLine()?:""
//    val multipleOfFive = number.toInt() * 5
//    println("Number multiplied by 5 is: $multipleOfFive")

    print("Enter your birth year: ")
    val birthYear = readLine()?:""
    val currentYear = 2023
    val result = currentYear - birthYear.toInt()
    println("Estimated age of the user is: ${result-1} or $result")


}
