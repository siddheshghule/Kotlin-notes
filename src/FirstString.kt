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

    val colors = hashSetOf<String>()
    colors.addAll(listOf("green", "red", "pink","red"))
    println(colors) // [red, pink, green]

    colors.remove("green")
    println(colors) // [red, pink]

//    Exercise 2:
    val objectsOnTable = hashSetOf("watch", "desktop", "laptop", "hub", "mobile")
    val objectsToRemove = setOf("mobile")
    objectsOnTable.removeAll(objectsToRemove)
    println(objectsOnTable) // [desktop, laptop, hub, watch]

    // Exercise 3:
//    You have a list of customers for your online store. A new customer has joined. Print the list of customers.
//    A customer has chosen to leave. Print the list of customers.
    val customers = hashSetOf("Tom", "Jerry", "Daffy", "Donald")
    val newCustomer = readLine()?:"" // Panther
    customers.add(newCustomer)
    println("List of customers: $customers") // List of customers: [Tom, Panther, Jerry, Daffy, Donald]

    customers.remove("Donald")
    println(customers) // [Tom, Panther, Jerry, Daffy]
}


