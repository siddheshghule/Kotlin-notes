package src

import src.project.hangman.Hangman
import src.project.tictactoe.TicTacToe

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
//                                      Drawing Bunny
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

//    print("Enter your birth year: ")
//    val birthYear = readLine()?:""
//    val currentYear = 2023
//    val result = currentYear - birthYear.toInt()
//    println("Estimated age of the user is: ${result-1} or $result")

//    var pi = 3.141592
//    println("Type of pi: ${pi::class.java}")
//
//    var name = "Tommy"
//    println("Type of name: ${name::class.java}")
//
//    var population = 75000000000
//    println("Type of population: ${population::class.java}")

    //                                  Exercise
//    print("Enter a Number: ")
//    var userInput = readLine()?:"1" // default is 1
//    var doubleNumber = 29.99
//    var output = doubleNumber * (userInput?.toInt() ?: 1) // if null then 1
//    println("The output variable ($output) type is: ${output::class.java}")
//    val multiplyByPi = 3.14 * userInput.toDouble()
//    println("$userInput * 3.14 = $multiplyByPi and the type is ${multiplyByPi::class.java}")

//                                     Exercise - Operators
    //                                   1
//    var a =76.254
//    var b = 3.867
//    println("Addition of $a and $b: ${a+b}")
//    println("Subtraction of $a and $b: ${a-b}")
//    println("Multiplication of $a and $b: ${a*b}")
//    println("Division of $a and $b: ${a/b}")
//    println("Remainder of $a and $b: ${a%b}")

    //                                   2
//    var meatCostPerKg = 29.99
//    println("1/3 Kg of mean costs ${29.99/3}")

    //                                   3
//    print("Please enter your bank balance: ")
//    var bankBalance = readLine()?:"1"
//    println("Congratulations, you have won a contest that triples your amount.")
//    println("Your current bank balance is ${bankBalance.toDouble()*3}")

    //                                   4
    // Read from the console the amount the user has in their bank account. The interest on that account is 5.5% per year. How much would that user have in 5 years?

//    print("Please enter your current bank balance: ")
//    var principal = readLine()?:"1"
//    print("Please enter rate of interest per annum: ")
//    val rateOfInterest = readLine()?:""
//    print("Please enter number of years: ")
//    val years = readLine()?:"0"
//
//    var balanceWithInterest = principal.toDouble() * ((1 + (rateOfInterest.toDouble()/100)).pow(years.toDouble()))
//    println("Your bank balance with interest of $rateOfInterest per year for the period of $years years is: $balanceWithInterest")

    //                                   Operators
//                         Exercise 1: Kids will get new tows if they have less than 5 toys and have at least one broken

//    var toys = 2
//    var broken = 1
//
//    if ((toys < 5) && ((toys - broken) >= 1)) {
//        println("Kids will get a new toys")
//
//    } else
//        println("Kids wont get toys")

//                                   Exercise 2:
    //A farmer has 3 cows, of which only one produces milk. He has two children. He is trying to apply for funding.
    // The requirements are
    // You must have no more than 5 animals
    // Animals must produce something that can be sold
    //Regardless of the other conditions, funding will be approved if the family has 3 or more members
    //Does the farmer receive the funding?

//    var noOfCows = 3
//    var givesMilk = 1
//    var noOfKids = 2
//    var conditionOne = noOfCows <= 5
//    var conditionTwo = givesMilk > 0
//    var conditionThree = (1 + noOfKids) >= 3
//
//    if (conditionOne && conditionTwo || conditionThree)
//        println("Farmer gets funding")
//    else
//        println("Farmaer does not get funding")


    //                                   Nullability
//    var catName:String? = "Lucy"
//    println(catName?.length)
//    catName = null
//    println(catName?.length)

    //                                   Nullability arithmetic

//    var number:Int? = 10
//    println(number?.plus(1)) // 11
//    println(number?.minus(1)) // 9
//    println(number?.div(5)) // 2
//    println(number?.rem(4)) // 2
//    println(number?.times(2)) // 20
//
//    var number: String?= "WASSSUPPP?"
//    println(number?.substring(3..6))
//
//    var numDouble: Double? = 13.94
//    println(numDouble?.times(6)?.toFloat())
//
//    var name = readLine()
//    println(name?.length)

//    var number = readLine()
//    var double: Double? = number?.toDoubleOrNull()
//    println(""+double?.times(7) +" length is " + double?.times(7).toString().length)

//    var catName: String? = null
//    println(catName?:"This cat has no name")
//    catName = "Fluffy"
//    println(catName?:"This cat has no name")

    //                                  Practice: Elvis and assertions
//                                   print input message or default message

//    print("Enter the message:")
//    var inputMessage = readLine()
//    println(inputMessage.let {
//        when (it) {
//            "" -> "Hello, welcome"
//            else -> it
//        }
//    })


//                                   Practice: Read if input number is not null and multiply by 5
//    val number: Int? = readLine()?.toIntOrNull()
//    println(number!!.times(5))


//                                   Exercise:
// A product costs 29.99. Ask a user at the console how many products they want to buy. If the read value is null, use the default of one. Print the total of the purchase.

//    val cost = 29.99
//    val items: Int? = readLine()?.toIntOrNull()?:4
//    println("The cost of $items items is: ${items?.times(cost)}")


    //                                   try- catch
//    print("Enter input:")
//    var test = readLine()
//    try {
//        println(test?.toInt())
//    } catch (e: Exception) {
//        println("An exception has occurred ${e.localizedMessage}")
//    }


    //                                   finally
//    print("Enter a number:")
//    var input = readLine()
//    try {
//        println(input?.toInt())
//    } catch (e: Exception) {
//        println("Exception has occurred with $e")
//    } finally {
//        println("Finally block, the input was $input")
//    }


    //                                   throw
//    print("Enter input:")
//    var input = readLine()
//    if(input.isNullOrBlank()) throw IllegalAccessException("Input is blank or null")
//    else
//        println("Input is: $input")

    //                                   Exercise Multiply by 5 if it is an Integer and print or else catch
//    print("Enter an Integer:")
//    var input = readLine()
//    try {
//        var result = input?.toInt()?.times(5)
//        println("Result of $input * 5 = $result")
//    } catch (e: Exception) {
//        println("Input was not an integer, input $input was ${input!!::class.java}")
//    }
//    finally {
//        println("Finish.")
//    }


    //                                   LIST

//    val animals = listOf("cat","dog","horse")
//    println(animals)
//    var colors = listOf("yellow","green","red","red")
//    var colors2 = listOf<String>()
//    var colorsWithNull = listOf("red","green","yellow", null, null)
//    println(colors)
//    println(colors2)
//    println(colorsWithNull)
//    println(colors[0]) // yellow
//    println(colors.size)
// Functions of List
//    println(colors) // [yellow, green, red, red]
//    println(colors.size) // 4
//    println(colors.contains("red")) // true
//    println(colors.containsAll(colorsWithNull)) // false(it does not contain 'null')
//    println(colors.indexOf("red")) // first index of 'red' -> 2
//    println(colors.lastIndexOf("red")) // last index -> 3


    //                                   ArrayList

//    var colors = arrayListOf("blue","red")
//    colors.add("green")
//    println(colors)
//    colors.remove("green")
//    colors.removeAt(0)
//    println(colors)
//    var moreColors = listOf("white","black","grey")
//    colors.addAll(moreColors)
//    println(colors)
//    colors.removeAll(moreColors)
//    println(colors) // [red]
//
//    var animals = arrayListOf("dogs","cats","dogs")
//    animals.remove("dogs")
//    println(animals)

    //                                   Functions of Array List

//    val colors = arrayListOf("blue","red", "blue", "green")
//    colors[1] = "yellow" // OR colors.set(1,"yellow")
//    println(colors) // [blue, yellow, blue, green]
//    val subColors = colors.subList(1,3)
//    println(subColors) // [yellow, blue]
//    colors.clear()
//    println(colors) // []
//    println(colors.isEmpty()) // true


    //                                   Exercise 1

//    val items = arrayListOf("laptop", "mouse", "pen", "paper", "mug", "phone")
//    val removedItems = listOf("pen", "paper", "mug", "phone")
//    items.removeAll(removedItems)
//    println(items)

//                                      Exercise 2
//    val animals = arrayListOf("lion","zebra","chimp","elephant") //[lion, zebra, chimp, elephant]
//    animals.add("panda bear cub")
//    println(animals) // [lion, zebra, chimp, elephant, panda bear cub]
//    println(animals.size) // 5
//    animals.remove("lion")
//    println(animals) // [zebra, chimp, elephant, panda bear cub]
//    println("Does the zoo has all the animals: ${animals.containsAll(listOf("elephant","giraffe"))}") // false

    //                                   SET
//    val numbers = setOf(1,2,3,4,1)
//    println(numbers)
//    val numbers3 = setOf(1,2,3,4,4,null,null)
//    println(numbers3) // [1,2,3,4, null]

    //                                   HASHSET
//    val numbers = hashSetOf(1,2,3,4,1)
//    println(numbers) // [1, 2, 3, 4] <- '1' is only printed once as set contains unique values
//
//    val numbers2 = hashSetOf<Int>()
//    println(numbers2) // []
//
//    val numbers3 = hashSetOf(1,2,3,4,4,null,null)
//    println(numbers3) // [null, 1, 2, 3, 4]
//
//    numbers.add(44)
//    println(numbers) // [1, 2, 3, 4, 44]
//
//    numbers3.addAll(numbers)
//    println(numbers3) // [null, 1, 2, 3, 4, 44]
//
//    numbers.remove(1)
//    println(numbers) // [2, 3, 4, 44] <- removed all 1's
//
//    numbers3.removeAll(numbers)
//    println(numbers3) // [null, 1]

    //                                      Exercise 1:

//    val colors = hashSetOf<String>()
//    colors.addAll(listOf("green", "red", "pink", "red"))
//    println(colors) // [red, pink, green]
//
//    colors.remove("green")
//    println(colors) // [red, pink]

    //                                     Exercise 2:

//    val objectsOnTable = hashSetOf("watch", "desktop", "laptop", "hub", "mobile")
//    val objectsToRemove = setOf("mobile")
//    objectsOnTable.removeAll(objectsToRemove)
//    println(objectsOnTable) // [desktop, laptop, hub, watch]

    //                                   Exercise 3:

//    You have a list of customers for your online store. A new customer has joined. Print the list of customers.
//    A customer has chosen to leave. Print the list of customers.

//    val customers = hashSetOf("Tom", "Jerry", "Daffy", "Donald")
//    val newCustomer = readLine()?:"" // Panther
//    customers.add(newCustomer)
//    println("List of customers: $customers") // List of customers: [Tom, Panther, Jerry, Daffy, Donald]
//
//    customers.remove("Donald")
//    println(customers) // [Tom, Panther, Jerry, Daffy]

    //                                   Set functions

//    val numbers = setOf(1, 2, 3, 4, 5, 6, 7)
//    println(numbers.size) // 7
//    println(numbers.contains(3)) // true
//    println(numbers.containsAll(setOf(1,2,11))) // false
//    println(numbers.isEmpty()) // false
//    numbers.forEach { print("Number: $it ") }
// Output: Number: 1 Number: 2 Number: 3 Number: 4 Number: 5 Number: 6 Number: 7

    //                                   HashSet functions

//    val numbers = hashSetOf(1,2,3,4,5,6,7, null,7)
//    println(numbers) // [null, 1, 2, 3, 4, 5, 6, 7]
//    val newNumbers = setOf(5,6,7,8,9,10)
//    numbers.retainAll(newNumbers)
//    println("Retain numbers: $numbers") // Output: Retain numbers: [5, 6, 7]
//    numbers.clear()
//    println(numbers) // Output: []


    //                                   Practice

//    val primeNumbers = setOf(2,3,5,7,11,13,17,19,23,29)
//    println("Is 21 a prime number? ${primeNumbers.contains(21)}") // Is 21 a prime number? false
//    println("Is 13 a prime number? ${primeNumbers.contains(13)}") // Is 13 a prime number? true

//    val myDrinks = hashSetOf("water","coke","orange juice","beer")
//    val theirDrink = hashSetOf("water","orange juice", "pineapple juice", "milk")
////    TODO("If you want to buy a drink that you both can enjoy, what are the options you have?")
//    myDrinks.retainAll(theirDrink)
//    println("Drinks that we both enjoy $myDrinks") // Drinks that we both enjoy [orange juice, water]


    //                                   Exercise: Set and HashSet
//    Your company has very strict dress code. Only certain color clothes can be worn in the office.
//    val acceptedColors = hashSetOf(“white”, “black”, “grey”) You have certain colors in your wardrobe.
//    val myColors = hashSetOf(“blue”, “red”, “black”, “green”) What color clothes can you wear.
//    Your company has added another color, “red” to their list. What options do you have now?

//    var acceptedColors = hashSetOf("white", "black", "grey")
//    val myColors = hashSetOf("blue", "red", "black", "green")
//    acceptedColors.retainAll(myColors)
//    println("Clothes that I can wear are: $acceptedColors") // Clothes that I can wear are: [black]
//
//    acceptedColors = hashSetOf("white", "black", "grey") // readded as acceptedColors changed afer retainAll
//    acceptedColors.add("red")
//    acceptedColors.retainAll(myColors)
//    println("Clothes that I can wear now are: $acceptedColors") // Clothes that I can wear now are: [black, red]


    //                                   Map

//    val count = mapOf(Pair(1,"one"), Pair(2,"two"), Pair(3,"three"))
//    println(count)
//    println(count.get(2))
////    TODO(Get the whole SET of keys (they are unique))
//    println(count.keys) // [1,2,3]
////    TODO(Get the collection of values (can have duplicates))
//    println(count.values) // [one, two, three]

    //                                    HashMap

//    val countHash = hashMapOf(Pair(1,"one"), Pair(2,"two"), Pair(3,"three"))
//    countHash[4] = "four"
//    println(countHash) // {1=one, 2=two, 3=three, 4=four}
//    val count = mapOf(Pair(20,"one"), Pair(30,"two"), Pair(40,"three"))
//    countHash.putAll(count)
//    println(countHash) // {1=one, 2=two, 3=three, 4=four, 20=one, 40=three, 30=two}
//    countHash.remove(20)
//    println(countHash) // {1=one, 2=two, 3=three, 4=four, 40=three, 30=two}
//    countHash.replace(2, "TWO")
//    println(countHash) // {1=one, 2=TWO, 3=three, 4=four, 40=three, 30=two}
//    countHash.clear()
//    println(countHash) // {}

    //                                  Practice: Map and HashMap

//    var count = hashMapOf(Pair(1,"un"), Pair(2, "deux"), Pair(3,"trois"))
//    println("value of 2 in french is ${count[2]}") // value of 2 in french is deux
//    println("value of 3 in french is ${count[3]}") // value of 3 in french is trois
//    count.put(4,"quatre") //OR  count[4] = "quatre"
//    println(count) // {1=un, 2=deux, 3=trois, 4=quatre}

//    var customers = mapOf(Pair("John", 1), Pair("Alice", 5), Pair("Bob", 3))
//    println("Is Alice a customer? : ${customers.containsKey("Alice")}, and she bought ${customers["Alice"]} products.")
//        // Is Alice a customer? : true, and she bought 5 products.
//    println("Is Michael a customer? : ${customers.containsKey("Michael")}") // Is Michael a customer? : false

    //                                      Exercise:
//    You manage an amusement park, and you have a map that stores dates and attendance.
//    `var attendance = hashMapOf(Pair(“23 Sept”, 2837), Pair(“24 Sept”, 3726), Pair(“25 Sept”, 6253))`
//    Add a value for 26 Sept. How many people attended in total on 25 and 26 Sept? Is data for 22 Sept available?

//    var attendance = hashMapOf(Pair("23 Sept", 2837), Pair("24 Sept", 3726), Pair("25 Sept", 6253))
//    attendance["26 Sept"] = 1234
//    println("The total number of people attending on 25 Sept and 26 Sept are: ${(attendance["25 Sept"]?:0) + (attendance["26 Sept"]?:0)}")
//        //The total number of people attending on 25 Sept and 26 Sept are: 7487
//    println("Are people attending on 22nd Sept: ${attendance.containsKey("22 Sept")}")
//        // Are people attending on 22nd Sept: false

    //                                      If statement
//
//    print("Enter true if it is Night, else false:") // Enter true if it is Night, else false:false
//    val isNight = readLine()?:"true"
//    val night = isNight.toBoolean()
//    if(night){
//        println("Sleep") // if isNight = true -> Sleep
//    }
//    else{
//        println("Be active") // if isNight = false -> Be Active
//    }

//    print("Please input the client funds: ")
//    var input = readLine() ?: "100"
//    var clientFunds = input.toInt() // default 100
//    val price = 50
//    var clientProduct = 0
//    if (clientFunds > price) {
//        clientFunds -= price
//        clientProduct++
//        println("You have purchased $clientProduct products,")
//        println("You have $clientFunds funds.")
//    }
//    else{
//        println("You have insufficient funds: $clientFunds")
//    }

//    val petStore = listOf("Cat", "Dog", "Rabbit")
//    val hasCatFood = true
//    if (petStore.contains("Cat")) {
//        if (hasCatFood) {
//            println("Buy Cat and cat food") // output -> Buy Cat and cat food
//        } else {
//            println("Buy cat and place an order for cat food")
//        }
//    } else {
//        println("Don't buy anything")
//    }

    //                                      Exercise:

//    Define two variables
//    val hasEggs = true
//    val hasBacon = false
//    A man goes to the market. His instructions are:
//    If you find eggs, buy 12
//    If you buy eggs, and you also find bacon, buy two packs
//    Eggs cost 5 each.
//    A pack of bacon costs 20.
//    How much does the man spend at the market?

//    val hasEggs = true
//    val costEggs = 5
//    val hasBacon = false
//    val costBacon = 20
//    var moneySpent = 0
//
//    if (hasEggs) {
//        println("Buying 12 eggs") // Buying 12 eggs
//        moneySpent = 12 * costEggs
//        if (hasBacon) {
//            println("Buying 2 packs of bacon")
//            moneySpent += 2 * costBacon
//        }
//        println("Money Spent: $moneySpent") // Money Spent: 60
//    }else{
//        println("Did not buy anything")
//    }

//    val number = 25
//    if (number % 2 == 0)
//        println("Number is even")
//    else
//        println("Number is odd")
//
//    if(number%2==0) println("Number is Even") else println("Number is odd")
//
//    val isEven = if(number%2==0) "Number is Even" else "Number is odd"
//    println(isEven)

    //                                       Multiple branches

//    print("Enter an animal: ")
//    val animal = readLine()?:""
//    if (animal == "dog") {
//        println("Animal is a dog")
//    } else if (animal == "cat") {
//        println("Animal is a cat")
//    } else if (animal == "rabbit") {
//        println("Animal is a rabbit")
//    } else {
//        println("Animal not found")
//    }

    //                                      Practice: if single digit print the statement

//    print("Please enter a number:")
//    val input = readLine() ?: "0"
//    val number = input.toInt()
//    if (number / 10 == 0) println("Number is single digit") else println("Number is multiple digit")


    //                                      Practice for multiple if branches

//    val responseCode = 404
//    val message = if(responseCode/100 == 1)
//        "Information response"
//    else if(responseCode/100 == 2)
//        "Success"
//    else if(responseCode/100 == 3)
//        "Redirect"
//    else if(responseCode/100 == 4)
//        "Client error"
//    else
//        "Server Error"
//    println("Message for response $responseCode: $message") // Message for response 404: Client error
//

//                                      Exercise:
//    You are designing a grading system for school exams. The total for an exam is 100 points, and you need to convert that into a grade A to F.
//    Design a program that reads in a number that represents a student’s grade, from 1 to 100 and prints out a grade.
//    A -> 90 to 100
//    B -> 80 to 89
//    C -> 70 to 79
//    D -> 60 to 69
//    E -> 50 to 59
//    F -> everything else

//    print("Enter exam points: ")
//    val input = readLine()?:""
//    val points = input.toInt()
//    val grade: String? = if(points>=90 && points <=100)
//        "A"
//    else if(points>=80 && points <=89)
//        "B"
//    else if(points>=70 && points <=79)
//        "C"
//    else if(points>=60 && points <=69)
//        "D"
//    else if(points>=50 && points <=59)
//        "E"
//    else
//        "F"
//    println(grade)

    //                                   Arithmetic and logical EXPRESSIONS
    //                                      1.

//    if(326/72 * 15 + 93 % 13 == 62){
//        println("Math is easy")
//    }else{
//        println("Math is difficult")
//    }

    //                                      2.

//    val haveCat = true
//    val haveCatFood = true
//    if(haveCat && haveCatFood){
//        println("Cat is happy")
//    }else{
//        println("Oh no!")
//    }

    //                                      in keyword

//    val favouritePet = "dog"
//    val availablePets = listOf("dog","cat","horse")
//    if(favouritePet in availablePets){
//        println("YAY!") // YAY!
//    }else{
//        println("Oh no!")
//    }
//    if(favouritePet !in availablePets){   // !in keyword
//        println("Please notify when you have a dog.")
//    }else{
//        println("Yay!") // Yay!
//    }

    //                                  Example of in keyword for range

//    println("Please input a number")
//    val input = readLine() ?: ""
//    val number = input.toInt()
//    if(number !in 0..9){
//        println("Your input is not single digit")
//    }

    //                                      Boolean returning function:

//    val animals = arrayListOf<String>()
//    if (animals.isEmpty()) {
//        animals.add("Dog")
//    } else {
//        animals.add("Cat")
//    }
//    println(animals) // [Dog]

//    val animals = arrayListOf<String>()
//    if (animals.add("Horse")) {
//        println("Horse was added successfully") // Horse was added successfully
//    } else {
//        println("Horse not was added")
//    }
//    println(animals) // [Horse]

    //                                      Practice:
    //                                      1.
//    val guestList = listOf("Alice", "Bob", "Carol", "John")
//    print("Please enter your name: ")
//    val guest = readLine() ?: ""
//    if (guest in guestList) {
//        println("Please come in")
//    } else {
//        println("Sorry, you are not on the list")
//    }

    //                                      2.
//    print("How many cats do you have? ")
//    val input = readLine() ?: "0"
//    val numberOfCats = input.toInt()
//    val howMany = if (numberOfCats in 1..3)
//        "few cats"
//    else if(numberOfCats in 4..6)
//        "several cats"
//    else
//        "Many cats"
//    println("This lady has $howMany")

    //                                      Exercise
//    Ask a user to input their age.
//    If they are under 13, they are a child
//    If they are under 18, they are a teen
//    If they are older, they are an adult.
//    Use ranges to print out the correct message.
//    If the age is 0, convert it to 1.

//    print("Enter the age:")
//    val input = readLine() ?: "0"
//    var age = input.toInt()
//    if (age == 0) age = 1
//    if (age in 1..12) println("You are a child")
//    else if (age in 13..18) println("You are a child")
//    else println("You are an adult")

    //                                      WHEN condition

//    var animal = "cat"
//    var action: String = ""
//    when (animal) {
//        "cat" -> {
//            action = "pet it"
//        }
//        "dog" -> {
//            action = "feed it"
//        }
//        else -> {
//            action = "google it"
//        }
//    }
//
//    println("When you meet a $animal, you should $action.")

    //                                   Example: if even or odd
//    var result = ""
//    var number = 1234
//    when(number%2){
//        0 -> result = "even"
//        1 -> result = "odd"
//    }
//    println("Number is $result") // -> Number is even

    //                                      When as a statement

//    val animal = "dog"
//    val action = when(animal){
//        "cat" -> "pet it"
//        "dog" -> "feed it"
//        else -> "google it"
//    }
//    println("When you see a $animal then $action") // -> When you see a dog then feed it

    //                                      Capturing the subject
//    val name = "Monkey D. Luffy"
//    when(val length = name.length){
//        in 1..5 -> println("A name $name with length of $length characters is short")
//        in 6..10 -> println("A name $name with length of $length characters is medium")
//        else -> println("A name $name with length of $length characters is long.")
//    }

    //                                      Practice 1:
//    Assume that 3 means a day is the recommended amount.
//    Ask the user to input the number of means they have every day.
//    Based on the input, print out a message that encourages the user to increase or decrease the number of means they have.

//    print("How many meals do you have in a day?")
//    val input = readLine()
//    val numberOfMealsFromUser = input?.toIntOrNull()
//    val recommendedMeals = 3
//    when (numberOfMealsFromUser) {
//        in 0..2 -> println("You should each more.")
//        3 -> println("That is perfect")
//        else -> println("You should eat less")
//    }

    //                                      Practice 2:
//Assuming, based on the hour of the day
//6 to 11 -> morning, 12 to 14 -> noon, 15 to 17 -> afternoon, 18 to 21 -> evening, 22 to 5 -> night
//Ask user to input the current hour, and print out the message.

//    print("Please enter current hour(0..23): ")
//    val input = readLine()?:""
//    val currentHour = input.toIntOrNull()
//    when(currentHour){
//        in 6..11 -> println("It is morning")
//        in 12..14 -> println("It is noon")
//        in 15..17 -> println("It is afternoon")
//        in 18..21 -> println("It is evening")
//        in 22..23 -> println("It is night")
//        in 0..5 -> println("It is night")
//        else -> println("Please enter correct input")
//    }

    //                                      Exercise:
//    Ask the user to input their name.
//    Based on the first letter of their name, print out a personalised greeting
//    for the first 3 letters of the alphabet,
//    a different one for the next 3 letters,
//    and a third message for the rest

//    print("Please Enter your name: ")
//    val name = readLine()?:""
//    when(name[0]){
//        in 'A'..'C' -> println("Hello $name")
//        in 'D'..'F' -> println("Hi $name")
//        else -> println("Hey $name")
//    }


    //                                      FOR LOOP

//    val animals = arrayListOf("cat","dog","mouse","bear")
//    for(animal in animals){
//        println("Feed the $animal")
//    }

//    for(i in 1..12){
//        val month = when(i){
//            1 -> "January"
//            2 -> "February"
//            3 -> "March"
//            4 -> "April"
//            5 -> "May"
//            6 -> "June"
//            7 -> "July"
//            8 -> "August"
//            9 -> "September"
//            10 -> "October"
//            11 -> "November"
//            else -> "December"
//        }
//        println("Month #$i is $month")
//    }


    //                                      Exercise: Add up all the numbers from 1 to 100

//    var sum = 0
//    for(i in 1..100){
//        sum += i
//    }
//    println(sum)

    //                                      Exercise: Printout message telling how many purchases they have made.

//    val customers = hashMapOf(Pair("Alice",4),Pair("Judy",8),Pair("Anna",6))
//    for(customerName in customers.keys){
//        println("$customerName has ${customers[customerName]} purchases.")
//    }

    //                                      Exercise:
//    Ask the user to input a year. For each month of that year, print out how many days there are.
//    Make sure you count leap years.
//    Assume a leap year is a year that is divisible by 4.
//    *there are additional rules for leap years, but we will ignore those in this exercise

//    print("Please enter a desired Year: ")
//    val input = readLine() ?: ""
//    val year = input.toIntOrNull()
//    val months = listOf(
//        "January", "February", "March", "April", "May", "June",
//        "July", "August", "September", "October", "November", "December"
//    )
//    for (month in months) {
//        if (year != null && listOf("January", "March", "May", "July", "August", "October", "December").contains(month)) {
//            println("$month has 31 days")
//        } else if (year != null && listOf("April", "June", "September", "November").contains(month)) {
//            println("$month has 30 days")
//        } else if (year != null && month == "February" && year % 4 == 0)
//            println("$month has 28 days") else println("$month has 29 days")
//    }

    //                                      FOR Loop ->  IN RANGE

//    for(i in 1..3){
//        println("Strike #$i")
//    }
//    println("You are out!")

//                                      Descending
//    for(i in 10 downTo 0){
//        println(i)
//        when(i){
//            9 -> println("Start your Engine!")
//            6 -> println("On your marks!")
//            3 -> println("Get Set!")
//            0 -> println("GO!")
//        }
//    }

    //                                      step Example:

//    for(i in 1..10 step 3){
//        println(i)
//    }

    //                                      Nested for loop

//    for(i in 0..5){
//        for(j in 0..5){
//            if(i==j) {
//                print("diagonal \t")
//            }
//            else print("$i, $j\t\t")
//        }
//        println()
//    }

    //                                      Exercise: printout every number smaller than user-input(maxValue)
    //                                      that is divisible by 7, in descending order

//    print("Please enter a value: ")
//    val input = readLine()?:"70"
//    val maxValue = input.toInt()
//    for(value in maxValue downTo 1){
//        if(value%7==0){
//            println(value)
//        }
//    }

    //                                      Exercise: print smiley pattern
//    for(i in 1..10){
//        for(j in 1..i){
//            print("\uD83D\uDE04 ")
//        }
//        println()
//    }

    //                                      Exercise:
//    Ask the user for a number.
//    Print out a square matrix of the size indicated by the number.
//    Inside each cell, print out 1 emoji
//    😀 If the row*column is divisible by 3
//    🤨 If the row*column % 3 is 1
//    😱 If the row*column % 3 is 2

//    print("Please enter a number to create a square matrix: ")
//    val input = readLine() ?: "4"
//    val matrixSize = input.toInt()
//    for (i in 0..matrixSize) {
//        for (j in 0..matrixSize) {
//            when ((i * j) % 3) {
//                0 -> print("\uD83D\uDE00 ")
//                1 -> print("\uD83E\uDD28 ")
//                2 -> print("\uD83D\uDE31 ")
//            }
//        }
//        println()
//    }

    //                                      While loop
//    var puzzlePieces = 20
//    var piecesPlaced = 0
//    while (piecesPlaced < puzzlePieces) {
//        piecesPlaced++
//        println("Placed piece #$piecesPlaced")
//    }

    //                                      Example: Print out a greeting message 10 times

//    var i=0
//    while(i<=10){
//        println("Hello #$i")
//        i++
//    }

    //                                      Exercise: Print out hello for each cat

//    var cats = listOf("Lucy", "Tommy", "Smokey", "Sammy", "Patch")
//    var i = 0
//    while (i < cats.size) {
//        println("Hello ${cats[i]}")
//        i++
//    }

    //                                     Exercise: Calculate the factorial of the inputted integer,
    //                                     for numbers up to 20, because the limit of Integer and Long is limited.

//    print("Please enter a number for calculating a factorial of it: ")
//    val input = readLine() ?: "1"
//    var inputtedNumber = input.toLong()
//    var factorial: Long = 1
//    while (inputtedNumber >= 1) {
//        factorial *= inputtedNumber
//        inputtedNumber--
//    }
//    println("Factorial of $input is $factorial")

    //                                      Exercise: Print out all the numbers that are divisible by 7,
    //                                      that are less than the user’s number.

//    print("Please enter a number to see all the numbers less than it that are divisible by 7: ")
//    val input = readLine() ?: "1"
//    var number = input.toInt()
//    var i = 0
//    while (i <= number) {
//        if (i % 7 == 0) {
//            println(i)
//        }
//        i++
//    }

//    val puzzlePieces = 20
//    var piecesPlaced = 0
//    do {
//        piecesPlaced++
//        println("Placed piece #$piecesPlaced")
//    } while (piecesPlaced < puzzlePieces)

    //                                      nested  while loop

//    var i = 0
//    var j = 0
//    while(i<10){
//        while(j<10){
//            print("$i$j \t")
//            j++
//        }
//        println()
//        j=0
//        i++
//    }

    //                 Exercise: Ask the user to input a number multiple times, until they input
    //                           a number larger than 100

//    do {
//        print("Please input a number greater than 100:")
//        val input = readLine() ?: ""
//        val number = input.toInt()
//        if(number>=100){
//            println("Thank you!")
//        }
//        else println("Please try again!")
//    } while (number < 100)

    //              Exercise: If a factorial is less than 3000000,
    //                        ask them to input another number and repeat the process

//    do {
//        var factorial = 1
//        print("Please input a number whose factorial is more than 3000000: ")
//        var input = readLine() ?: ""
//        var number = input.toDouble()
//        var i = 1
//        while (i <= number) {
//            factorial *= i
//            i++
//        }
//        if (factorial < 3000000)
//            println("Factorial is less than 3000000!: $factorial")
//        else
//            println("Factorial is $factorial")
//
//    } while (factorial < 3000000)


    //                                      Exercise:
//    You have a set of usernames
//    val usernames = hashSetOf(“john”, “bob”, “alice”)
//    Ask the user to choose their username. If their username is taken, print out a message and ask again.
//    Add the username to the set.

//    var usernames = hashSetOf("John", "bob", "alice")
//    do {
//        var flag = false
//        print("Please input a username: ")
//        val input = readLine() ?: ""
//        if (usernames.contains(input)) {
//            println("Username $input already exists.")
//
//        } else {
//            usernames.add(input)
//            println("Username has been added")
//            flag = true
//        }
//    } while (!flag)
//    println("Username list: $usernames")
//


//                                          ### Break and Continue

//                                              break keyword

//                                   Practice:

//    var onlyEvenNumbers = arrayListOf(2, 4, 6, 8, 7, 10, 12) // 7 is not even
//    for (number in onlyEvenNumbers) {
//        if (number % 2 != 0)
//            break // breaks out of for loop
//        println("Even Number $number/2 = ${number / 2} ")
//    }


//                                              continue keyword
//                                      Practice:

//    var onlyEvenNumbers = arrayListOf(2, 4, 6, 8, 7, 10, 12) // 7 is not even
//    for (number in onlyEvenNumbers) {
//        if (number % 2 != 0)
//            continue //continues to the next step
//        println("Even Number $number/2 = ${number / 2} ")
//    }

//                                              label keyword
//                                      Practice:

//    loop@ for(i in 1..5){
//        for(j in 1..5){
//            if(i%3==0)
//                break@loop
//            println("$i,$j")
//        }
//    }


//                      Exercise: Break and continue

//                                      Exercise 1:
//    An animal shelter is accepting all animals except "snake".
//    A user is allowed to bring 5 animals to the shelter.
//    Ask the user to input the animals they want to bring.
//    If they bring a snake, print a message and stop accepting animals.

//    var animals = arrayListOf<String>()
//    for(i in 1..5){
//        print("Please enter an animal: ")
//        var input = readLine()?:""
//        if(input == "snake") {
//            println("Snakes are not allowed")
//            break
//        }
//        animals.add(input)
//    }
//    println("Current animal is: $animals")

//                                      Exercise 2:
//    You have a list of clients
//    val clients = listOf("Anna","Bob","Carol","David")
//    Print out a greeting message for each client, unless their name starts with the letter 'c'
//    val clients = listOf("Anna","Bob","Carol","David")
//    for(client in clients){
//        if(client.startsWith("C")){
//            continue
//        }
//        println("Hello $client")
//    }

//                                      Exercise 3:
//    A group of young people are going to a nightclub.
//    Design a program that accepts user ages.
//    The program displays a welcome message for each user.
//    If it receives an age lower than 18, it prints a message that this client is not allowed.
//    If it receives the word “stop”, the program ends

//    while (true) {
//        print("Please enter your age:")
//        val input = readLine() ?: ""
//        if (input == "stop") break
//        if (input.toInt() < 18)
//            println("You are underage! No entry!")
//        else
//            println("Welcome to the club")
//    }


    //                                  Functions
    //                                  Practice 1: Print hello 3 times
    //for(i in 1..3)
    //    sayHello()

    //    Practice 2: print alphabets 5 times
//    var i=5
//    do {
//        printAlphabets()
//        i--
//    }while(i>0)

    //                                     Practice 3: Take an input number and multiply by 17 and do it for 3 times
//    for(i in 1..3){
//        multipleOf17()
//    }

    //    Exercise:
    //    Design a function that asks for a user’s name. Then it asks for a user’s birth year.
    //    Finally, it prints out a message saying the user’s name and age.
    //    Call the function 3 times.
//    for(i in 1..3){
//        printNameAndAge()
//    }


    //                               #### Function Parameters
    //                            Practice 1: Basic parameter int
//    println(doubleInt(2))

    //                            Practice 2: Print Hello message for each person in arrayList
//    var people = arrayListOf("Abby", "Babby", "Cabby", "Dabby")
//    sayHelloToPeople(people)

//                               Practice 3: Parameter with default value
//    doubleMessageMethod(5)
//    doubleMessageMethod(5, "5 * 2 = ")

//                              return keyword for a function
//    var radius = 10
//    println("The Area of a circle with radius $radius is ${areaOfCircle(radius)}")

    //                      Practice 1: return personalised message for each person
//    var people  = listOf("Anna", "Max", "Sophia", "Patrick")
//    for(person in people){
//        println(personalisedMessage(person))
//    }

//                    Practice 2: sum of 2 number(parameters), call the function 3 times
//    for (i in 1..3) {
//        println("The addition of 2 numbers is ${addition(i + 1, i + 2)}")
//    }

//                  Practice 3: Add 20% tax to the product cost and print the final price.
//    val products = hashMapOf(Pair("Shoes", 29.99), Pair("Socks", 9.99), Pair("Joggers", 19.99), Pair("T-shirt", 4.99))
//    for (item in products.keys) {
//        val cost = products[item]
//        println("The final price of the product ${item} is ${calculateTax(cost) + cost!!}")
//    }

//                                      Exercise:
//    Create a function that receives the name of an animal, and returns the estimated lifespan.
//    cats -> 15
//    dogs -> 10
//    rabbit -> 12
//    everything else -> 20
//    Ask the user to input an animal, then print out the estimated lifespan for that animal.

//    val animalsList = listOf("Cats", "Dogs", "Rabbit","Crocodile")
//    for(animal in animalsList)
//        println("$animal's estimated lifespan is ${lifespanOfAnimals(animal)} years")


//                                   #### Function Overloading
//                                           Practice 1:
//    multiply(5)
//    multiply(5,10)

//                                          Practice 2:
// Create an overloaded function that takes either an animal or a list of animals. Print out message to feed each animal.

//    feedAnimal("Cat")
//    feedAnimal(listOf("Hamster", "Dog", "Corcodile", "Snake"))

//                                          Practice 3:
//    Create a function that takes a message and prints out the size of the message.
//    Overload the function to take an integer and print out a string of the size of that integer. The content of the string is not important.

//    printMessageOrSize("Hello World")
//    printMessageOrSize(10)

//                                                              Exercise:
//    Create a function that takes a product name and price.
//    It adds 20% tax to that product and displays a message saying how much the product costs.
//    Overload the function so that it takes a map of products and prices, and does the same thing.
//    Call both functions in your program.

//    val name = "Bat"
//    val basePrice = 100.00
//    val listOfProductsAndPrice = mapOf("Bat" to 100.00, "Ball" to 70.00, "Joggers" to 60.00)
//
//    calculateAndPrintTotalAmountWithTax(name, basePrice)
//    calculateAndPrintTotalAmountWithTax(listOfProductsAndPrice)

//                                                        SCOPE
    //                                                  Exercise 1:
    //        Create a function that has a variable `years` with the value `1985`.
    //        In the main function, create a variable `years` with the value `2015`.
    //        Call the function, then print out the `year` variable.
    //        What is the value?
    //        Which variable was accessed?

//    val year = 2015
//    println("The year in the main function is $year")
//    printYears()

//                            Exercise 2:
//    var parakeets = 5
//    buyMoreParaqueets(parakeets)
//    println("You now have $parakeets parakeets")

    //                                                      vararg

//    sayHello("Alice", "Bob", "Dan", "Fiona")
//    sayHello("Tom", "Patrick", "Philip")

    //                                                      Practice:
//    Create a function that takes a variable number of integers and returns the sum of those integers

//    var result = addIntegers(1,2,3,4,5,6,7,8,9,10)
//    println("The sum of integers is $result")

//                                                           Exercise:
//    Create a function that takes an integer variable “count”
//    and a variable number of client names. Print out “count” hello messages for each client.
//
//    i.e. if count = 3, print out 3 hello messages for each client.

//    var count = 3
//    printHelloNTimes(3, "Tom", "Patrick", "Philip")

    //                                                  Local Functions
//    listAnimals()

    //                                          Practice: Print double bank balance.
//    printDoubleBalance()

//                                                      Exercise:
//    Create a function that asks the user for a name until an empty string is introduced.
//    Create a local function that takes a name and prints a greeting.
//    For each name introduced, print out a greeting.
//    readAndPrintGreetingMessage()

    //                                      Lambda with Higher Order Function

//    val names = arrayListOf("Dan", "Bob", "Carol", "Jenny")
//    val myLambda = {name: String -> println("Hello $name")}
//    sayHelloHOF(names, myLambda)
//    // OR
//    sayHelloHOF(names) { name: String -> println("Hello $name") }

//    Practice HOF and lambda
//    Create a HOF that takes a mutable collection of integers and a lambda function.
//    It then applies the lambda function to every even element of that collection.
//
//    Create a lambda function that when applies to an integer, it returns that integer divided by 10.
//
//    Call HOF using your lambda and display the result.

//    val numbers = arrayListOf(1, 2, 3, 4, 5, 6, 10, 20, 35, 36, 55, 48)
//    higherOrderFunctionLambdaPractice(numbers) { num: Int -> num / 10 }

//    Exercise:
//
//    Create a Higher Order Function that takes a list of client names and a lambda expression that returns a String.
//    It then applies the lambda expression to every client name, creates a new collection of the results and returns the result.
//    Create a lambda expression that takes a client name String and returns a personalised message.
//    Call the HOF and print out the result.

//    higherOrderFunctionLambdaExerciseString(arrayListOf("Dan", "Bob", "Carol", "Jenny")) {clientName: String -> println("Hello $clientName").toString() }

//                                                      Practice:
//    1. Given a set of random integers. printout a subset that consists only of double-digit integers.

//    val numbers = setOf(1, 2, 12, 45, 3, 56, 7, 89, 76, 444, 98, 7, 126)
//    val doubleDigitArray = numbers.filter { it -> it in 10..99 }
//    println(doubleDigitArray)

//    2. Display a list of clients sorted by the last letter of the name.

//    val clientNames = arrayListOf("Dan", "Bob", "Carol", "Jenny")
//    println(clientNames.sortedBy { it[it.length - 1] })

//    3. Print out the integer that has the biggest middle digit, in the list of three digit numbers.

//    val threeDigitNumbers = listOf(123, 456, 789, 456, 989, 798, 999)
//    println(threeDigitNumbers.maxBy { it.toString()[1] })
//    // OR
//    println(threeDigitNumbers.maxBy { it /10 % 10 })

//                                           Exercise:

//    Given a collection of random integers.
//    If a number is odd, double it.
//    If a number is even, half it.
//    Print out a subset of the collection that has numbers greater than 25.

//    val randomNumbers = listOf(12, 23, 34, 56, 67, 87, 89, 214, 542, 55, 54, 67, 84, 123)
//    println(randomNumbers.map {
//        if (it % 2 == 0)
//            it / 2
//        else
//            it * 2
//    }.filter { it > 25 })


//                            Project: Hangman
//
//                            Build a hangman name
//                                    You have to guess a word letter by letter
//                            You have 6 guesses
//                                    For every mistake, more of the man is drawn.
//                            If the whole man is drawn, he is hanged, and game over
//                            If the word is guessed, the man is spared.

//    val hangman = Hangman()
//    hangman.setupGame()


//                                  Project: Tic tac toe

//    val ticTacToe = TicTacToe()
//    ticTacToe.inputValue()

}

//fun higherOrderFunctionLambdaExerciseString(
//    clientNames: ArrayList<String>,
//    lambdaFunctionExercise: (String) -> String
//): ArrayList<String> {
//    val message = arrayListOf<String>()
//    for(name in clientNames){
//        message.add(lambdaFunctionExercise(name))
//    }
//    return message;
//}


//fun higherOrderFunctionLambdaPractice(numbers: ArrayList<Int>, lambdaFunction: (Int) -> Int) {
//    for (num in numbers) {
//        if (num % 2 == 0) {
//            val printVal = lambdaFunction(num)
//            println("$num / 10 = $printVal, ")
//        }
//    }
//}

//fun sayHelloHOF(names: ArrayList<String>, doSomething: (String) -> Unit) {
//    for (name in names) {
//        doSomething(name)
//    }
//}
//fun readAndPrintGreetingMessage() {
//    var inputString: String
//    fun printGreetingMessage(name: String) {
//        println("Hello $name")
//    }
//    do {
//        print("Please enter Name: ")
//        println()
//        inputString = readlnOrNull() ?: ""
//        if (inputString != "") {
//            printGreetingMessage(inputString)
//        }
//    } while (inputString != "")
//}

//fun printDoubleBalance(){
//    val usersList = hashMapOf(Pair("User1",100.0), Pair("User2",200.0), Pair("User3",300.0), Pair("User4",400.0), Pair("User5",500.0))
//    println(usersList)
//    fun doubleBalance(balance: Double): Double {
//        return (balance.times(2))
//    }
//    for(user in usersList.keys){
//        var doubleBalance: Double = doubleBalance(usersList[user]!!)
//        usersList[user] = doubleBalance
//    }
//    println(usersList)
//}


//fun listAnimals() {
//    fun listOneAnimal(animal: String) {
//        println("I have $animal")
//    }
//
//    val myAnimals = arrayListOf("cat", "dog", "cow", "horse")
//    for (animal in myAnimals) {
//        listOneAnimal(animal)
//    }
//}
//
//fun printHelloNTimes(count: Int, vararg names: String) {
//    for (name in names) {
//        for (i in 1..count) {
//            println("Hello $name")
//        }
//    }
//}


//fun addIntegers(vararg numbers: Int): Int {
//    var result = 0
//        for(number in numbers){
//            result += number
//    }
//    return result
//}
//fun sayHello(vararg names: String){
//    for(name in names){
//        println("Hello $name")
//    }
//}

//fun buyMoreParaqueets(parakeets: Int) {
//    val parakeets = 3
//}

//fun printYears() {
//    val year = 1985
//    println("The year inside the function is $year")
//}

//fun sayHello(){
//    println("Hello Everyone!")
//}

//fun printAlphabets(){
//    println("a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z")
//}

//fun multipleOf17(){
//    print("Please Enter a number: ")
//    val input = readLine()?:"0"
//    val number = input.toInt()
//    println("$number * 17 = ${number*17}")
//
//}

//fun printNameAndAge(){
//    print("Please Enter Name: ")
//    val inputName = readLine()?:""
//    print("Please Enter Birth year: ")
//    val inputYear = readLine()?:""
//    println("Name: $inputName, Age: ${2023-inputYear.toInt()} or ${2023-inputYear.toInt() - 1} ")
//}

//fun doubleInt(number: Int): Int{
//    return number*2
//}

//fun sayHelloToPeople(people: ArrayList<String>){
//    for(person in people){
//        println("Hello $person")
//    }
//}

//fun doubleMessageMethod(number: Int, message: String = "Double is"){
//    println("$message ${number * 2}")
//}

//fun areaOfCircle(radius: Int): Double{
//    return 3.1415 * radius * radius
//}

//fun personalisedMessage(person: String): String{
//    val greeting = when(person){
//        "Anna" -> "Hey $person"
//        "Max" -> "How are you $person"
//        "Sophia" -> "Hello $person"
//        "Patrick" -> "Wasssup $person"
//        else -> "Hallo leute"
//    }
//    return greeting
//}

//fun addition(number1: Int, number2: Int) = number1 + number2

//fun lifespanOfAnimals(animal: String): Int {
//    return when(animal){
//        "Cats" -> 15
//        "Dogs" -> 10
//        "Rabbit" -> 12
//        else -> 20
//    }
//}

//fun multiply(number: Int) =
//    println("Multiplication of $number by 2 = ${number*2}")
//fun multiply(number1: Int, number2: Int) =
//    println("Multiplication of $number1 by $number2  = ${number1*number2}")

//fun feedAnimal(animal: String){
//    println("Feed $animal")
//}
//fun feedAnimal(animalsList: Collection<String>){
//    for(animal in animalsList) {
//        feedAnimal(animal)
//    }
//}

//fun printMessageOrSize(number: Int){
//    println("A random String of length $number is: ${getRandomString(number)}")
//}
//
////                                  Random String Generator
//fun getRandomString(length: Int) : String {
//    val allowedChars = ('A'..'Z') + ('a'..'z') + ('0'..'9')
//    return (1..length)
//        .map { allowedChars.random() }
//        .joinToString("")
//}
//
//fun printMessageOrSize(message: String){
//    println("A length of the message $message is: ${message.length}")
//}

//fun calculateTax(price: Double?) = 20 * price!! / 100
//fun calculateAndPrintTotalAmountWithTax(name: String, basePrice: Double) {
//    println("The final price of the product $name is ${calculateTax(basePrice) + basePrice!!}")
//}
//fun calculateAndPrintTotalAmountWithTax(productsAndPrice: Map<String, Double>) {
//    for(productName in productsAndPrice.keys){
//        calculateAndPrintTotalAmountWithTax(productName, productsAndPrice[productName]!!)
//    }
//}