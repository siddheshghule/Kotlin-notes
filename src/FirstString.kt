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

    //Exercise
//    print("Enter a Number: ")
//    var userInput = readLine()?:"1" // default is 1
//    var doubleNumber = 29.99
//    var output = doubleNumber * (userInput?.toInt() ?: 1) // if null then 1
//    println("The output variable ($output) type is: ${output::class.java}")
//    val multiplyByPi = 3.14 * userInput.toDouble()
//    println("$userInput * 3.14 = $multiplyByPi and the type is ${multiplyByPi::class.java}")

    // Exercise - Operators
    // 1
//    var a =76.254
//    var b = 3.867
//    println("Addition of $a and $b: ${a+b}")
//    println("Subtraction of $a and $b: ${a-b}")
//    println("Multiplication of $a and $b: ${a*b}")
//    println("Division of $a and $b: ${a/b}")
//    println("Remainder of $a and $b: ${a%b}")

    // 2
//    var meatCostPerKg = 29.99
//    println("1/3 Kg of mean costs ${29.99/3}")

    // 3
//    print("Please enter your bank balance: ")
//    var bankBalance = readLine()?:"1"
//    println("Congratulations, you have won a contest that triples your amount.")
//    println("Your current bank balance is ${bankBalance.toDouble()*3}")

    // 4 Read from the console the amount the user has in their bank account. The interest on that account is 5.5% per year. How much would that user have in 5 years?

//    print("Please enter your current bank balance: ")
//    var principal = readLine()?:"1"
//    print("Please enter rate of interest per annum: ")
//    val rateOfInterest = readLine()?:""
//    print("Please enter number of years: ")
//    val years = readLine()?:"0"
//
//    var balanceWithInterest = principal.toDouble() * ((1 + (rateOfInterest.toDouble()/100)).pow(years.toDouble()))
//    println("Your bank balance with interest of $rateOfInterest per year for the period of $years years is: $balanceWithInterest")

    // Operators
    // Exercise 1: Kids will get new tows if they have less than 5 toys and have at least one broken
//    var toys = 2
//    var broken = 1
//
//    if ((toys < 5) && ((toys - broken) >= 1)) {
//        println("Kids will get a new toys")
//
//    } else
//        println("Kids wont get toys")

    // Exercise 2:
    //A farmer has 3 cows, of which only one produces milk. He has two children. He is trying to apply for funding.
    // The requirements are
    //You must have no more than 5 animals
    //Animals must produce something that can be sold
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

    // Nullability
//    var catName:String? = "Lucy"
//    println(catName?.length)
//    catName = null
//    println(catName?.length)

    // nullability arithmetic

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

//Practice: Elvis and assertions
// print input message or default message
//    print("Enter the message:")
//    var inputMessage = readLine()
//    println(inputMessage.let {
//        when (it) {
//            "" -> "Hello, welcome"
//            else -> it
//        }
//    })


// Read if input number is not null and multiply by 5
//    val number: Int? = readLine()?.toIntOrNull()
//    println(number!!.times(5))

// Exercise: A product costs 29.99. Ask a user at the console how many products they want to buy. If the read value is null, use the default of one. Print the total of the purchase.

//    val cost = 29.99
//    val items: Int? = readLine()?.toIntOrNull()?:4
//    println("The cost of $items items is: ${items?.times(cost)}")

    // try- catch
//    print("Enter input:")
//    var test = readLine()
//    try {
//        println(test?.toInt())
//    } catch (e: Exception) {
//        println("An exception has occurred ${e.localizedMessage}")
//    }

    // finally
//    print("Enter a number:")
//    var input = readLine()
//    try {
//        println(input?.toInt())
//    } catch (e: Exception) {
//        println("Exception has occurred with $e")
//    } finally {
//        println("Finally block, the input was $input")
//    }

    // throw
//    print("Enter input:")
//    var input = readLine()
//    if(input.isNullOrBlank()) throw IllegalAccessException("Input is blank or null")
//    else
//        println("Input is: $input")

    // Exercise Multiply by 5 if it is an Integer and print or else catch
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


// LIST
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


// ArrayList
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

    // Functions of Array List
//    val colors = arrayListOf("blue","red", "blue", "green")
//    colors[1] = "yellow" // OR colors.set(1,"yellow")
//    println(colors) // [blue, yellow, blue, green]
//    val subColors = colors.subList(1,3)
//    println(subColors) // [yellow, blue]
//    colors.clear()
//    println(colors) // []
//    println(colors.isEmpty()) // true


// Exercise
//    val items = arrayListOf("laptop", "mouse", "pen", "paper", "mug", "phone")
//    val removedItems = listOf("pen", "paper", "mug", "phone")
//    items.removeAll(removedItems)
//    println(items)

//    Exercise 2
//    val animals = arrayListOf("lion","zebra","chimp","elephant") //[lion, zebra, chimp, elephant]
//    animals.add("panda bear cub")
//    println(animals) // [lion, zebra, chimp, elephant, panda bear cub]
//    println(animals.size) // 5
//    animals.remove("lion")
//    println(animals) // [zebra, chimp, elephant, panda bear cub]
//    println("Does the zoo has all the animals: ${animals.containsAll(listOf("elephant","giraffe"))}") // false

    // SET
//    val numbers = setOf(1,2,3,4,1)
//    println(numbers)
//    val numbers3 = setOf(1,2,3,4,4,null,null)
//    println(numbers3) // [1,2,3,4, null]

    // HASHSET
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

//    Exercise 1:

//    val colors = hashSetOf<String>()
//    colors.addAll(listOf("green", "red", "pink", "red"))
//    println(colors) // [red, pink, green]
//
//    colors.remove("green")
//    println(colors) // [red, pink]
//
////    Exercise 2:
//    val objectsOnTable = hashSetOf("watch", "desktop", "laptop", "hub", "mobile")
//    val objectsToRemove = setOf("mobile")
//    objectsOnTable.removeAll(objectsToRemove)
//    println(objectsOnTable) // [desktop, laptop, hub, watch]

    // Exercise 3:
//    You have a list of customers for your online store. A new customer has joined. Print the list of customers.
//    A customer has chosen to leave. Print the list of customers.

//    val customers = hashSetOf("Tom", "Jerry", "Daffy", "Donald")
//    val newCustomer = readLine()?:"" // Panther
//    customers.add(newCustomer)
//    println("List of customers: $customers") // List of customers: [Tom, Panther, Jerry, Daffy, Donald]
//
//    customers.remove("Donald")
//    println(customers) // [Tom, Panther, Jerry, Daffy]

//    // Set functions
////    val numbers = setOf(1, 2, 3, 4, 5, 6, 7)
////    println(numbers.size) // 7
////    println(numbers.contains(3)) // true
////    println(numbers.containsAll(setOf(1,2,11))) // false
////    println(numbers.isEmpty()) // false
////    numbers.forEach { print("Number: $it ") }  // Number: 1 Number: 2 Number: 3 Number: 4 Number: 5 Number: 6 Number: 7
//
//    // HashSet functions
////    val numbers = hashSetOf(1,2,3,4,5,6,7, null,7)
////    println(numbers) // [null, 1, 2, 3, 4, 5, 6, 7]
////    val newNumbers = setOf(5,6,7,8,9,10)
////    numbers.retainAll(newNumbers)
////    println("Retain numbers: $numbers") // Retain numbers: [5, 6, 7]
////    numbers.clear()
////    println(numbers) // []
//
//    // Practice
//    val primeNumbers = setOf(2,3,5,7,11,13,17,19,23,29)
//    println("Is 21 a prime number? ${primeNumbers.contains(21)}") // Is 21 a prime number? false
//    println("Is 13 a prime number? ${primeNumbers.contains(13)}") // Is 13 a prime number? true
//
//    val myDrinks = hashSetOf("water","coke","orange juice","beer")
//    val theirDrink = hashSetOf("water","orange juice", "pineapple juice", "milk")
////    TODO("If you want to buy a drink that you both can enjoy, what are the options you have?")
//    myDrinks.retainAll(theirDrink)
//    println("Drinks that we both enjoy $myDrinks") // Drinks that we both enjoy [orange juice, water]
//
//
//    // Exercise: Set and HashSet
////    Your company has very strict dress code. Only certain color clothes can be worn in the office.
////    val acceptedColors = hashSetOf(“white”, “black”, “grey”) You have certain colors in your wardrobe.
////    val myColors = hashSetOf(“blue”, “red”, “black”, “green”) What color clothes can you wear.
////    Your company has added another color, “red” to their list. What options do you have now?
//    var acceptedColors = hashSetOf("white", "black", "grey")
//    val myColors = hashSetOf("blue", "red", "black", "green")
//    acceptedColors.retainAll(myColors)
//    println("Clothes that I can wear are: $acceptedColors") // Clothes that I can wear are: [black]
//
//    acceptedColors = hashSetOf("white", "black", "grey") // readded as acceptedColors changed afer retainAll
//    acceptedColors.add("red")
//    acceptedColors.retainAll(myColors)
//    println("Clothes that I can wear now are: $acceptedColors") // Clothes that I can wear now are: [black, red]

// Map
//    val count = mapOf(Pair(1,"one"), Pair(2,"two"), Pair(3,"three"))
//    println(count)
//    println(count.get(2))
////    TODO(Get the whole SET of keys (they are unique))
//    println(count.keys) // [1,2,3]
////    TODO(Get the collection of values (can have duplicates))
//    println(count.values) // [one, two, three]

//    HashMap
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

//    Practice: Map and HashMap

//    var count = hashMapOf(Pair(1,"un"), Pair(2, "deux"), Pair(3,"trois"))
//    println("value of 2 in french is ${count[2]}") // value of 2 in french is deux
//    println("value of 3 in french is ${count[3]}") // value of 3 in french is trois
//    count.put(4,"quatre") //OR  count[4] = "quatre"
//    println(count) // {1=un, 2=deux, 3=trois, 4=quatre}
//
//    var customers = mapOf(Pair("John", 1), Pair("Alice", 5), Pair("Bob", 3))
//    println("Is Alice a customer? : ${customers.containsKey("Alice")}, and she bought ${customers["Alice"]} products.")
//        // Is Alice a customer? : true, and she bought 5 products.
//    println("Is Michael a customer? : ${customers.containsKey("Michael")}") // Is Michael a customer? : false

//    Exercise:
//    You manage an amusement park, and you have a map that stores dates and attendance.
//    `var attendance = hashMapOf(Pair(“23 Sept”, 2837), Pair(“24 Sept”, 3726), Pair(“25 Sept”, 6253))`
//    Add a value for 26 Sept. How many people attended in total on 25 and 26 Sept? Is data for 22 Sept available?
//    var attendance = hashMapOf(Pair("23 Sept", 2837), Pair("24 Sept", 3726), Pair("25 Sept", 6253))
//    attendance["26 Sept"] = 1234
//    println("The total number of people attending on 25 Sept and 26 Sept are: ${(attendance["25 Sept"]?:0) + (attendance["26 Sept"]?:0)}")
//        //The total number of people attending on 25 Sept and 26 Sept are: 7487
//    println("Are people attending on 22nd Sept: ${attendance.containsKey("22 Sept")}")
//        // Are people attending on 22nd Sept: false

//    If statement
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

//    Exercise:

//    Define two variables
//    val hasEggs = true
//    val hasBacon = false
//    A man goes to the market. His instructions are:
//
//    If you find eggs, buy 12
//
//    If you buy eggs, and you also find bacon, buy two packs
//
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

//     multiple branches
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

//    practice: if single digit print the statement
//    print("Please enter a number:")
//    val input = readLine() ?: "0"
//    val number = input.toInt()
//    if (number / 10 == 0) println("Number is single digit") else println("Number is multiple digit")
//
////    practice for multiple if branches
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

//    Exercise: You are designing a grading system for school exams. The total for an exam is 100 points, and you need to convert that into a grade A to F.
//
//    Design a program that reads in a number that represents a student’s grade, from 1 to 100 and prints out a grade.
//
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

    // Arithmetic and logical EXPRESSIONS
//    1.
//    if(326/72 * 15 + 93 % 13 == 62){
//        println("Math is easy")
//    }else{
//        println("Math is difficult")
//    }

//    2.
//    val haveCat = true
//    val haveCatFood = true
//    if(haveCat && haveCatFood){
//        println("Cat is happy")
//    }else{
//        println("Oh no!")
//    }

//    in keyword

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
//Example of in keyword for range
//    println("Please input a number")
//    val input = readLine() ?: ""
//    val number = input.toInt()
//    if(number !in 0..9){
//        println("Your input is not single digit")
//    }

//    Boolean returning function:

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

//    Practice:
//    1.
//    val guestList = listOf("Alice", "Bob", "Carol", "John")
//    print("Please enter your name: ")
//    val guest = readLine() ?: ""
//    if (guest in guestList) {
//        println("Please come in")
//    } else {
//        println("Sorry, you are not on the list")
//    }

//    2.
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

//    Exercise
//    Ask a user to input their age.
//
//    If they are under 13, they are a child
//    If they are under 18, they are a teen
//    If they are older, they are an adult.
//    Use ranges to print out the correct message.
//    If the age is 0, convert it to 1.
    print("Enter the age:")
    val input = readLine() ?: "0"
    var age = input.toInt()
    if (age == 0) age = 1
    if (age in 1..12) println("You are a child")
    else if (age in 13..18) println("You are a child")
    else println("You are an adult")


}


