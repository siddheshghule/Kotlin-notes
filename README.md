# kotlin-notes

[**WORK IN PROGRESS**]

Self-notes for kotlin from Complete Kotlin development masterclass 2023 by Catalin Stefan.

## Table of  content

1. [String and Variables](#string-and-variables)
    1. [String](#string)
        1. [Chars](#chars)
    2. [Variables](#variables)
        1. [Variable names](#variable-names)
2. [User Input](#user-input)
3. [Numbers and Variable Types](#numbers-and-variable-types)
    1. [Numbers](#numbers)
    2. [Variables](#variables)
        1. [Implicit vs Explicit variable types](#implicit-vs-explicit-variable-types)
4. [Operators and Booleans](#operators-and-booleans)
    1. [Operators](#operators)
        1. [Arithmetic Operators](#arithmetic-operators)
        2. [Assignment Operators](#assignment-operators)
        3. [Comparison Operators](#comparison-operators)
        4. [Logical Operators](#logical-operators)
        5. [Booleans](#booleans)
5. [Nullability](#nullability)
    1. [Null values](#null-values)
    2. [Elvis Operator](#elvis-operator)
    3. [Non-null assertions](#non-null-assertions)
6. [Handling Exceptions](#handling-exceptions)
   1. [try-catch](#try-catch)
   2. [finally](#finally)
   3. [throw](#throw)
7. [Collections](#collections)
8. [List and ArrayList](#list-and-arraylist)
9. [Set and HashSet](#set-and-hashset)
10. [Map and HashMap](#map-and-hashmap)
11. [Flow control](#flow-control)
    1. [If conditional](#if-conditional)
    2. [When Conditional](#when-conditional)
    3. [For loop](#for-loop)
    4. [While loop](#while-loop)
    5. [Break and continue](#break-and-continue)
    6. [Expressions](#expressions)
12. [Functions](#functions)
    1. [Function Parameters](#function-parameters)
    2. [Function return](#function-return)
    3. [Function Overloading](#function-overloading)
    4. [Scope](#scope)
    5. [varargs](#varargs)
    6. [Local Functions](#local-functions) 
    7. [Lambda Functions](#lambda-functions)
       1. [Higher Order Functions](#higher-order-functions)
13. [Packages](#packages)
    1. [Naming conventions](#naming-conventions)
    2. [Imports](#imports)
14. [Project: Hangman](#project-hangman)
15. [Project: Tic Tac Toe](#project-tic-tac-toe)
16. [Object Oriented Programming](#object-oriented-programming)
    1. [Classes](#classes)
    2. [Objects](#objects)

## String and Variables

### String

String is surrounded by double-quotes or triple-quotes.  
There are 2 types of string: **Escaped String** and **Raw String**

- Escaped string is declared within double quote (" ") and may contain escape characters like '\n'.
- Raw string is declared within triple quote (""" """) and may contain multiple lines of text without any escape
  characters.

```
fun src.main(args: Array<String>) { 
println("Hello")
println("String with escape character backslash \\, and quotes \".")
}

Output:
Hello String
String with escape character backslash \, and quotes ".
```

Example: String Bunny with escape characters

```
println("(\\(\\")
println("(-.-)")
println("O_(\")(\")")

Output:
(\(\
(-.-)
O_(")(")
```

#### Chars

A char is a single character, surrounded by single quotes.  
Example: 'A', 'a, ''.  
A string is composed of character (String of chars)

--------
### Variables

A variable is a container of data.  
Examples:  
```
var dogs = 3
var name = "Tommy"
```

- Variables (var) can be changed/updated.  

Examples:

```
var age = 20
age = age+1 // OR age += 1
// age = 21
```

Note: we cannot change the variable type.  
Example:

```
var age = 20
age = twentyone
Error: Type mismatch
```

Variables can be changeable(mutable) or constants/read-only(immutable).  
- mutable: var (can be changed)  
- immutable: val (can be read-only)  

Example:

```
val age = 20
age = 21
Error: val cannot be reassigned
```

#### Variable names

Names can contain letters, numbers and underscores '_'. Cannot use space or kotlin keywords(println, var, val, etc.).
Names can start with letters or underscores, I personally prefer letters and use underscores to separate words. For
example, first name can be written as  
`var firstName = 'Tommy'` (also known as camel case) or  
`var first_name = 'Tommy' `

**_Naming convention_** - camelCase - firstName.

--------

**String Examples:**

```
val catName = "Fluffy"
println("My cat's name is \"$catName\"")

var slashes = "Two types of slashesh \\ and /"
println(slashes)

var url = "https://www.google.com"
println(url)

Output:
My cat's name is "Fluffy"
Two types of slashesh \ and /
https://google.com
```  

Example: Generate a random Number

```  
println("Random.nextDouble(): ${Random.nextDouble()}")
println("Random.nextInt(): ${Random.nextInt()}") // random integer
println("Random.nextInt(1, 9): ${Random.nextInt(1, 9)}") // random integer 1 till 8
println("Random.nextInt(10): ${Random.nextInt(10)}") // random integer less than 10

Output:
 
Random.nextDouble(): 0.3519018166295108
Random.nextInt(): -1941111987
Random.nextInt(1, 9): 8
Random.nextInt(10): 6 
```  

--------

### User Input

User input can come from many sources, and one way is from command line.  
We can use readLine().  
Example:

``` 
println("Enter user input: ")
val userInput = readLine() // read only one line
println("Your input string is: $userInput")

Output:
Enter user input:
hello
Your input string is hello
```  

- Input a number as a String and convert to integer.  
The `readLine()` command can return nothing(null), then we can use `?:""`, as if the `readLine()` returns null, then
empty string will be used `""`.

```  
println("Enter user input")
val userInput = readLine()?:"" // if empty then use "" (empty string)
println("Your input times 5 is: ${userInput.toInt()*5}")  

Output:
Enter user input
5
Your input times 5 is: 25
```  

Example: Welcome

```
println("What is your name?")
val name =  readLine()
println("Welcome, $name")

Output:
What is your name?
Tommy
Welcome, Tommy
```

Example: Multiply a number by 5

```
print("Enter a number: ")
val number = readLine()?:""
val multipleOfFive = number.toInt() * 5
println("Number multiplied by 5 is: $multipleOfFive")

Output:
Enter a number: 4
Number multiplied by 5 is: 20
```

Example: Find out estimated age of user

```
print("Enter your birth year: ")
val birthYear = readLine()?:""
val currentYear = 2023
val result = currentYear - birthYear.toInt() 
println("Estimated age of the user is: ${result-1} or $result")

Output:
Enter your birth year: 1996
Estimated age of the user is: 26 or 27
```

--------

### Numbers And Variable Types

Different types are stored in memory in different ways.  
Number types have limits.

| type  | size | min value                    | max value                    |
|-------|------|------------------------------|------------------------------|
| byte  | 8    | -128                         | 127                          |
| short | 16   | -32768                       | 32767                        |
| int   | 32   | -2147483648 (-2^31)          | 2147483647    (2^31-1)       |
| long  | 64   | -9223372036854775808 (-2^64) | 9223372036854775807 (2^64-1) |

- How to know the type of variable.

```
var pi = 3.141592
println("Type of pi: ${pi::class.java}")

var name = "Tommy"
println("Type of name: ${name::class.java}")

var population = 75000000000
println("Type of population: ${population::class.java}")

Output:
Type of pi: double
Type of name: class java.lang.String
Type of population: long
```

Exercise:

```
print("Enter a Number: ")
var userInput = readLine()
var doubleNumber = 29.99
var output = doubleNumber * (userInput?.toInt() ?: 1) // if null then 1
println("The output variable ($output) type is: ${output::class.java}")

Output:

Enter a Number: 44
The output variable (1319.56) type is: double
```

#### Implicit vs Explicit variable types

Implicit variable types are decided by Kotlin.  
Example: `val cat = 3 // Int`

Explicit variable types are decided by us. We can instruct kotlin to assign a different type to our variable.  
Example: `val cat: Byte = 5`  
`val floatVal: Float = 29.99F` Or `val floatValue = 29.99F`  
`val longVal: Float = 29` Or `val longVal = 29L`

--------
### Operators And Booleans

#### Operators:

Referred From: https://www.w3schools.com/kotlin/kotlin_operators.php

##### Arithmetic Operators

| Operator | Name           | Description                      | Example |
|----------|----------------|----------------------------------|---------|
| +        | Addition       | Adds together two values         | x + y   |
| -        | Subtraction    | Subtracts one value from another | x - y   |
| *	       | Multiplication | Multiplies two values            | x * y   |
| /        | Division       | Divides one value from another   | x / y   |
| %        | Modulus        | Returns the division remainder   | x % y   |
| ++       | Increment      | Increases the value by 1         | ++x     |
| --       | Decrement      | Decreases the value by 1         | --x     |

##### Assignment Operators

| Operator | Example | Same As   |
|----------|---------|-----------|
| =        | x = 5   | x = 5     |
| +=       | x += 3  | x = x + 3 |
| -=       | x -= 3  | x = x - 3 |
| *=       | x *= 3  | x = x * 3 |
| /=       | x /= 3  | x = x / 3 |
| %=       | x %= 3  | x = x % 3 |

##### Comparison Operators

| Operator | Name                     | Example |
|----------|--------------------------|---------|
| ==       | Equal to                 | x == y  |
| !=       | Not equal                | x != y  |
| \>       | Greater than             | x > y   |
| <        | Less than                | x < y   |
| \>=      | Greater than or equal to | x >= y  |
| <=       | Less than or equal to    | x <= y  |

##### Logical Operators

| Operator     | Name        | Description                                             | Example                  |
|--------------|-------------|---------------------------------------------------------|--------------------------|
| &&           | Logical and | Returns true if both statements are true                | x < 5 && x < 10          |
| &#124;&#124; | Logical or  | Returns true if one of the statements is true           | x < 5 &#124;&#124; x < 4 |
| !            | Logical not | Reverse the result, returns false if the result is true |

Exercise:

```
var a =76.254
var b = 3.867
println("Addition of $a and $b: ${a+b}")
println("Subtraction of $a and $b: ${a-b}")
println("Multiplication of $a and $b: ${a*b}")
println("Division of $a and $b: ${a/b}")
println("Remainder of $a and $b: ${a%b}")

Output:
Addition of 76.254 and 3.867: 80.12100000000001
Subtraction of 76.254 and 3.867: 72.387
Multiplication of 76.254 and 3.867: 294.87421800000004
Division of 76.254 and 3.867: 19.719162141194726
Remainder of 76.254 and 3.867: 2.781000000000005
```

Exercise: Read from the console the amount the user has in their bank account. The interest on that account is 5.5% per
year. How much would that user have in 5 years?

```
print("Please enter your current bank balance: ")
var principal = readLine()?:"1"
print("Please enter rate of interest per annum: ")
val rateOfInterest = readLine()?:""
print("Please enter number of years: ")
val years = readLine()?:"0"

var balanceWithInterest = principal.toDouble() * ((1 + (rateOfInterest.toDouble()/100/1)).pow(years.toDouble()))  // P(1+(r/n)^years)
println("Your bank balance with interest of $rateOfInterest per year for the period of $years years is: $balanceWithInterest")

Output:
Please enter your current bank balance: 1000
Please enter rate of interest per annum: 5.5
Please enter number of years: 5
Your bank balance with interest of 5.5 per year for the period of 5 years is: 1306.9600064093747
```
--------
#### Booleans:

- It can only have True/False value.  
- Is very memory efficient, enables Logical Operators, enables program Flow Control.

Exercise: A farmer has 3 cows, of which only one produces milk. He has two children. He is trying to apply for funding.
The requirements are

- You must have no more than 5 animals
- Animals must produce something that can be sold
- Regardless of the other conditions, funding will be approved if the family has 3 or more members  
  Does the farmer receive the funding?

```
var noOfCows = 3
var givesMilk = 1
var noOfKids = 2
var conditionOne = noOfCows <= 5
var conditionTwo = givesMilk > 0
var conditionThree = (1 + noOfKids) >= 3

    if (conditionOne && conditionTwo || conditionThree)
        println("Farmer gets funding")
    else
        println("Farmaer does not get funding")

Output:
Farmer gets funding
```

--------
### Nullability

#### Null values:

- No value is present.
- If you use a variable with null value, your program will crash with NullPointerException (NPE)
- Kotlin guards against null values, giving us Compilation Error.
- Kotlin differentiates between variables that can be null(using '?') and those that cannot.  
  
Example:
  ```
  val herName: String = "Lilly" // (Cannot be null, must be given a value. Cannot assign null)  
  val hisName: String? = null // (Can be null, so giving a value is optional)
  ```
- **Null safe calls**:
    - Nullable Operator: '?' (used for nullable variable)

Exercise:

  ```
var catName:String? = "Lucy"
println(catName?.length)
println(catName.length) // compile-time error (Surround by null check)
catName = null
println(catName?.length)

  ```

- Arithmetic Operators

 ```
var number:Int? = 10
println(number?.plus(1)) // 11
println(number?.minus(1)) // 9
println(number?.div(5)) // 2
println(number?.rem(4)) // 2
println(number?.times(2)) // 20
  ```

#### Elvis Operator(?:)
  Guarantees a result returned  
  Either the actual result for a nun-null variable, or a default value
```
var catName: String? = null
println(catName?:"This cat has no name")
catName = "Fluffy"
println(catName?:"This cat has no name")

Output:
This cat has no name
Fluffy
```

#### Non-null assertions
  !!. -> A **_developer guarantee_** that the variable is not null.  
  **Warning:** : This bypasses all the language checks for the null-safety. Can trigger a program to crash.

```
val catName: String? = null
println(catName!!.length)
// If the value is null then the program will crash.  
```

Practice: Elvis and assertions Print input message or default message

```
print("Enter the message:")
var inputMessage = readLine()
println(inputMessage.let {
when (it) {
"" -> "Hello, welcome"
else -> it
}
})
 ```

Read if input number is not null and multiply by 5

 ```
val number: Int? = readLine()?.toIntOrNull()
println(number!!.times(5))
 ```

Exercise: A product costs 29.99. Ask a user at the console how many products they want to buy. If the read value is
null, use the default of one. Print the total of the purchase.

```
val cost = 29.99
val items: Int? = readLine()?.toIntOrNull()?:1 
// When value is null, items= 1
println("The cost of $items items is: ${items?.times(cost)}")

Output:
The cost of 4 items is: 119.96 
The cost of 1 items is: 29.99
```

--------
### Handling Exceptions

An unexpected event in a program. A System cannot recover from an exception, we need to mitigate it ourselves. Execution
is stopped and data is lost.  
Exceptions always have a message, by default, and it is good practice having a message when creating custom Exception.

#### try-catch

A way to manage exception.

```
print("Enter input:")
var test = readLine()
try {
    println(test?.toInt())
} catch (e: Exception) {
    println("An exception has occurred ${e.localizedMessage}")
}

Output:
Enter input:test
An exception has occurred For input string: "test"
```

#### finally

A 'finally' block will always be executed whether an exception occurs.

```
print("Enter a number:")
var input = readLine()
try {
    println(input?.toInt())
} catch (e: Exception) {
    println("Exception has occurred with $e")
} finally {
    println("Finally block, the input was $input")
}
    
Output:
Enter a number:4
4
Finally block, the input was 4

```


#### throw

A way to generate your own exceptions.  
Can be used if you detect a state in your program that you cannot recover from.

```
print("Enter input:")
var input = readLine()
if(input.isNullOrBlank()) throw IllegalAccessException("Input is blank or null")
else
    println("Input is: $input")
```

Exercise: Multiply by 5 if it is an Integer and print or else catch

```
print("Enter an Integer:")
var input = readLine()
try {
    var result = input?.toInt()?.times(5)
    println("Result of $input * 5 = $result")
} catch (e: Exception) {
    println("Input was not an integer, input $input was ${input!!::class.java}")
}
finally {
    println("Finish.")
}

Output:
Enter an Integer:  Hello
Input was not an integer, input  was class java.lang.String
Finish.
```

--------
### Collections

A way to group of elements together.  
Zero or more elements.  
Same type of elements.  
Eg. [1,2,3,4,555,6,4], ["Dogs", "Cats", "Cow"]

<img src="https://kotlinlang.org/docs/images/collections-diagram.png" alt="isolated" width="500"/>

Note: Mutable means, they can be changed.

--------
#### List(Immutable)

Ordered collection.  
Elements can be accessed by the position(index[0,1,2,3....n])

Lists are immutable, that means we cannot add or remove elements. Meaning, we can only use elements that are present at
creation time.

```
val animals = listOf("cat","dog","horse")
println(animals) // print wont change the order
```  

If we create an empty list then we must specify the element type  
`var colors = listOf<String>()
`  
Ordered collection that can contain duplicate elements.  
`var colors = listOf("yellow","green","red","red")`  
A list can contain null elements.  
`var colorsWithNull = listOf("red","green","yellow", null, null)`

Retrieve an element of the list.

`println(colors[0])  // yellow`
`println(colors.get(0)) // yellow`
`println(colors[5]) // ArrayIndexOutOfBoundsException`

Get size of the list.
`println(colors.size) // 4`

--------
#### ArrayList(Mutable)

A mutable list is a changeable list.  
`var colors = arrayListOf("blue","red")`

We can add/remove elements

```
var colors = arrayListOf("blue","red")
colors.add("green")
println(colors) // [blue, red, green]
colors.remove("green") // [blue, red]
colors.removeAt(0) // [red]
```

We can add/remove another collection.

```
var moreColors = listOf("white","black","grey")
colors.addAll(moreColors)
println(colors) // [red, white, black, grey]
colors.removeAll(moreColors)
println(colors) // [red]
```  

If a array contains duplicate elements then it will just remove the first element.

``` 
var animals = arrayListOf("dogs","cats","dogs")
animals.remove("dogs") 
println(animals) // [cats, dogs]
``` 

Exercise:  
You have a number of items on your desk.  
`val items = arrayListOf(“laptop”, “mouse”, “pen”, “paper”, “mug”, “phone”)
`. You clean up your desk and remove as many items as you can to be more productive.
`val removedItems = listOf(“pen”, “paper”, “mug”, “phone”)`. Print out the remaining items.

``` 
val items = arrayListOf("laptop", "mouse", "pen", "paper", "mug", "phone")
val removedItems = listOf("pen", "paper", "mug", "phone")
items.removeAll(removedItems)
println(items) // [laptop, mouse]
```

--------
#### List functions

```
var colors = listOf("yellow","green","red","red")
var colorsWithNull = listOf("red","green","yellow", null, null)
println(colors) // [yellow, green, red, red]
println(colors.size) // 4
println(colors.contains("red")) // true
println(colors.containsAll(colorsWithNull)) // false(it does not contain 'null')
println(colors.indexOf("red")) // first index of 'red' -> 2
println(colors.lastIndexOf("red")) // last index -> 3
```

There are many more function :)

--------
#### ArrayList  functions

```
val colors = arrayListOf("blue","red", "blue", "green")
colors[1] = "yellow" // OR colors.set(1,"yellow")
println(colors) // [blue, yellow, blue, green]
val subColors = colors.subList(1,3)
println(subColors) // [yellow, blue]
colors.clear()
println(colors) // []
println(colors.isEmpty()) // true
```

There are many more function :)

Exercise:  
A zoo has a list of animals.   
val animals = arrayListOf(“lion”, “zebra”, “chimp”, “elephant”)  
A new panda bear cub has arrived. Print out the new list of animals.  
The lion has been sold to a different zoo. Print out the new list of animals.   
Does the zoo have both elephants and giraffes?

```
val animals = arrayListOf("lion","zebra","chimp","elephant") //[lion, zebra, chimp, elephant]
animals.add("panda bear cub")
println(animals) // [lion, zebra, chimp, elephant, panda bear cub]
println(animals.size) // 5
animals.remove("lion")
println(animals) // [zebra, chimp, elephant, panda bear cub]
println("Does the zoo has all the animals: ${animals.containsAll(listOf("elephant","giraffe"))}") 
        // Does the zoo has all the animals: false
```

--------
#### Set(Immutable)

Is a group of UNIQUE elements.  
The order has no significance.    
We can go through the elements one by one(iterate over them), but the order is not defined.  
Cannot add or remove elements, we can use HashSets for that.

```
val numbers = setOf(1,2,3,4,1)
println(numbers) // [1, 2, 3, 4] <- '1' is only printed once as set contains unique values
```

If we want to create an empty set then we must specify type of set.

```
val numbers2 = setOf<Int>()
println(numbers2) // []
```

We can have a null, but no duplicates, only once

```
val numbers3 = setOf(1,2,3,4,4,null,null)
println(numbers3) // [1, 2, 3, 4, null]
```

--------
#### HashSet(Mutable)

HashSets are Sets with the capability to add/remove elements.  
Feature: Unique elements, can have null, can add/remove elements, un-ordered.

    val numbers = hashSetOf(1,2,3,4,1)
    println(numbers) // [1, 2, 3, 4] <- '1' is only printed once as set contains unique values

Empty HashSet, we need to specify the type.

    val numbers2 = hashSetOf<Int>()
    println(numbers2) // []

HashSet with null.

    val numbers3 = hashSetOf(1,2,3,4,4,null,null)
    println(numbers3) // [null, 1, 2, 3, 4]

Add one element to the HashSet

    numbers.add(44)
    println(numbers) // [1, 2, 3, 4, 44]

Add one hashSet to another, ignoring duplicates

    numbers3.addAll(numbers)
    println(numbers3) // [null, 1, 2, 3, 4, 44]

Remove one element for the set(if exists)

    numbers.remove(1)
    println(numbers) // [2, 3, 4, 44] <- removed all 1's

Remove all elements of a set

    numbers3.removeAll(numbers)
    println(numbers3) // [null, 1]

// Exercise 1:

    val colors = hashSetOf<String>()
    colors.addAll(listOf("green", "red", "pink","red"))
    println(colors) // [red, pink, green]

    colors.remove("green")
    println(colors) // [red, pink]

Exercise 2:

    val objectsOnTable = hashSetOf("watch", "desktop", "laptop", "hub", "mobile")
    val objectsToRemove = setOf("mobile")
    objectsOnTable.removeAll(objectsToRemove)
    println(objectsOnTable) // [desktop, laptop, hub, watch]

Exercise 3:
You have a list of customers for your online store. A new customer has joined. Print the list of customers. A customer
has chosen to leave. Print the list of customers.

    val customers = hashSetOf("Tom", "Jerry", "Daffy", "Donald")
    val newCustomer = readLine()?:"" // Panther
    customers.add(newCustomer)
    println("List of customers: $customers") // List of customers: [Tom, Panther, Jerry, Daffy, Donald]

    customers.remove("Donald")
    println(customers) // [Tom, Panther, Jerry, Daffy]

--------
#### Functions for Sets and HashSets

Set functions:

    val numbers = setOf(1, 2, 3, 4, 5, 6, 7)
    println(numbers.size) // 7
    println(numbers.contains(3)) // true
    println(numbers.containsAll(setOf(1,2,11))) // false
    println(numbers.isEmpty()) // false
    numbers.forEach { print("Number: $it ") }  // Number: 1 Number: 2 Number: 3 Number: 4 Number: 5 Number: 6 Number: 7

HashSet functions:

    val numbers = hashSetOf(1,2,3,4,5,6,7, null,7)
    println(numbers) // [null, 1, 2, 3, 4, 5, 6, 7]
    val newNumbers = setOf(5,6,7,8,9,10)
    numbers.retainAll(newNumbers)
    println("Retain numbers: $numbers") // Retain numbers: [5, 6, 7]
    numbers.clear()
    println(numbers) // []

Practice:

    val primeNumbers = setOf(2,3,5,7,11,13,17,19,23,29)
    println("Is 21 a prime number? ${primeNumbers.contains(21)}") // Is 21 a prime number? false
    println("Is 13 a prime number? ${primeNumbers.contains(13)}") // Is 13 a prime number? true

    val myDrinks = hashSetOf("water","coke","orange juice","beer")
    val theirDrink = hashSetOf("water","orange juice", "pineapple juice", "milk")
    // TODO("If you want to buy a drink that you both can enjoy, what are the options you have?")
    myDrinks.retainAll(theirDrink)
    println("Drinks that we both enjoy $myDrinks") // Drinks that we both enjoy [orange juice, water]

Exercise: Set and HashSet

Your company has very strict dress code. Only certain color clothes can be worn in the office.
`val acceptedColors = hashSetOf(“white”, “black”, “grey”)` You have certain colors in your wardrobe.  
`val myColors = hashSetOf(“blue”, “red”, “black”, “green”)` What color clothes can you wear. Your company has added
another color, “red” to their list. What options do you have now?

    var acceptedColors = hashSetOf("white", "black", "grey")
    val myColors = hashSetOf("blue", "red", "black", "green")
    acceptedColors.retainAll(myColors)
    println("Clothes that I can wear are: $acceptedColors") // Clothes that I can wear are: [black]

    acceptedColors = hashSetOf("white", "black", "grey") // readded as acceptedColors changed afer retainAll
    acceptedColors.add("red")
    acceptedColors.retainAll(myColors)
    println("Clothes that I can wear now are: $acceptedColors") // Clothes that I can wear now are: [black, red]
-------------------------------
#### Map

- Conceptually Maps are part of collections abut practically they are not.
- A set of key-value pair.  (keys are sets, as the keys are always unique)
- Keys are unique(set)
- Each key maps to exactly one value
- Values can have duplicates.
- Eg. {1=one,2-two,5=five} OR a Dictionary(Words - Definition)
- Maps are immutable, HashMaps are mutable

```
val count = mapOf(Pair(1,"one"), Pair(2,"two"), Pair(3,"three"))
println(count) // {1=one, 2=two, 3=three}
println(count.get(2)) // count[2] -> two
// Get the whole SET of keys (they are unique)
println(count.keys) // [1,2,3]
// Get the collection of values (can have duplicates)
println(count.values) // [one, two, three]
```

```
val count = mapOf<Int, String>()
println(count) // {}
```
-------------------------------
#### HashMap

    val countHash = hashMapOf(Pair(1,"one"), Pair(2,"two"), Pair(3,"three"))
    countHash[4] = "four"
    println(countHash) // {1=one, 2=two, 3=three, 4=four}
    val count = mapOf(Pair(20,"one"), Pair(30,"two"), Pair(40,"three"))
    countHash.putAll(count)
    println(countHash) // {1=one, 2=two, 3=three, 4=four, 20=one, 40=three, 30=two}
    countHash.remove(20)
    println(countHash) // {1=one, 2=two, 3=three, 4=four, 40=three, 30=two}
    countHash.replace(2, "TWO")
    println(countHash) // {1=one, 2=TWO, 3=three, 4=four, 40=three, 30=two}
    countHash.clear()
    println(countHash) // {} 

Practice: Map and HashMap

```
var count = hashMapOf(Pair(1,"un"), Pair(2, "deux"), Pair(3,"trois"))
println("value of 2 in french is ${count[2]}") // value of 2 in french is deux
println("value of 3 in french is ${count[3]}") // value of 3 in french is trois
count.put(4,"quatre") //OR  count[4] = "quatre"
println(count) // {1=un, 2=deux, 3=trois, 4=quatre}
```

```
var customers = mapOf(Pair("John", 1), Pair("Alice", 5), Pair("Bob", 3))
println("Is Alice a customer? : ${customers.containsKey("Alice")}, and she bought ${customers["Alice"]} products.")
    // Is Alice a customer? : true, and she bought 5 products.
println("Is Michael a customer? : ${customers.containsKey("Michael")}") // Is Michael a customer? : false
```

**Exercise**:  
You manage an amusement park, and you have a map that stores dates and attendance.   
`var attendance = hashMapOf(Pair(“23 Sept”, 2837), Pair(“24 Sept”, 3726), Pair(“25 Sept”, 6253))`  
Add a value for 26 Sept. How many people attended in total on 25 and 26 Sept? Is data for 22 Sept available?

    var attendance = hashMapOf(Pair("23 Sept", 2837), Pair("24 Sept", 3726), Pair("25 Sept", 6253))
    attendance["26 Sept"] = 1234
    println("The total number of people attending on 25 Sept and 26 Sept are: ${(attendance["25 Sept"]?:0) + (attendance["26 Sept"]?:0)}")
        //The total number of people attending on 25 Sept and 26 Sept are: 7487
    println("Are people attending on 22nd Sept: ${attendance.containsKey("22 Sept")}")
        // Are people attending on 22nd Sept: false

-------------------------------
### Flow control

- Change the direction of execution of a program
- Make a decision
- Run a part of code multiple times
- Stop execution of a part of code

**Iterator**:
An iterator is an object that loops through elements of a collection.  
They are used when applying a same operation to all the elements.
-------------------------------
#### If conditional

<img src="https://developer.android.com/static/codelabs/basic-android-kotlin-compose-conditionals/img/c3945d8ebcbf8380_856.png" alt="isolated" width="500"/>
https://developer.android.com/codelabs/basic-android-kotlin-compose-conditionals#1  

**if statement**

```
if(logical expression){
    //do something
} else{
}
```

```
print("Enter true if it is Night, else false:") // Enter true if it is Night, else false:false
val isNight = readLine()?:"true"
val night = isNight.toBoolean()
if(night){
    println("Sleep") // if isNight = true -> Sleep
}
else{
   println("Be active") // if isNight = false -> Be Active
}
```

```
print("Please input the client funds: ")
var input = readLine() ?: "100"
var clientFunds = input.toInt() // default 100
val price = 50
var clientProduct = 0
if (clientFunds > price) {
clientFunds -= price
clientProduct++
println("You have purchased $clientProduct products,")
println("You have $clientFunds funds.")
}
else{
println("You have insufficient funds: $clientFunds")
}
```

```
val petStore = listOf("Cat", "Dog", "Rabbit")
val hasCatFood = true
if (petStore.contains("Cat")) {
    if (hasCatFood) {
        println("Buy Cat and cat food") // output -> Buy Cat and cat food
    } else {
        println("Buy cat and place an order for cat food")
    }
} else {
     println("Don't buy anything")
}
```

**Exercise:**

Define two variables

val hasEggs = true val hasBacon = false A man goes to the market. His instructions are:

If you find eggs, buy 12

If you buy eggs, and you also find bacon, buy two packs

Eggs cost 5 each. A pack of bacon costs 20. How much does the man spend at the market?

```
val hasEggs = true
val costEggs = 5
val hasBacon = false
val costBacon = 20
var moneySpent = 0

if (hasEggs) {
    println("Buying 12 eggs") // Buying 12 eggs
    moneySpent = 12 * costEggs
    if (hasBacon) {
        println("Buying 2 packs of bacon")
        moneySpent += 2 * costBacon
    }
    println("Money Spent: $moneySpent") // Money Spent: 60
}else{
     println("Did not buy anything")
}
```

**shorthand if**  
Curly brackets can be omitted if there is only one expression.

```
val number = 25
val isEven: String? = null
if (number % 2 == 0)
    println("Number is even")
else
    println("Number is odd")
```

Shorthand if expression looks like as below

```
if(number%2==0) isEven = "Number is Even" else isEven = "Number is odd"
```

Shorthand if with assignment

```
val isEven = if(number%2==0) "Number is Even" else "Number is odd"
println(isEven)
```

**Multiple branches**

```
if (expression A) {
// Do A
} else if (expression B) {
// or Do B
} else if (expression C) {
// Or Do C
} else {
// Or default action
}
```

Example:

```
print("Enter an animal: ")
val animal = readLine()?:""
if (animal == "dog") {
println("Animal is a dog")
} else if (animal == "cat") {
println("Animal is a cat")
} else if (animal == "rabbit") {
println("Animal is a rabbit")
} else {
println("Animal not found")
}
```

Practice:  
if single digit print the statement

```
print("Please enter a number:")
val input = readLine() ?: "0"
val number = input.toInt()
if (number / 10 == 0) println("Number is single digit") else println("Number is multiple digit")
```

for multiple if branches

```
val responseCode = 404
val message = if(responseCode/100 == 1)
"Information response"
else if(responseCode/100 == 2)
"Success"
else if(responseCode/100 == 3)
"Redirect"
else if(responseCode/100 == 4)
"Client error"
else
"Server Error"
println("Message for response $responseCode: $message") // Message for response 404: Client error
```

Exercise:

You are designing a grading system for school exams. The total for an exam is 100 points, and you need to convert that
into a grade A to F.

Design a program that reads in a number that represents a student’s grade, from 1 to 100 and prints out a grade.

A -> 90 to 100  
B -> 80 to 89  
C -> 70 to 79  
D -> 60 to 69  
E -> 50 to 59  
F -> everything else

```
print("Enter exam points: ")
val input = readLine()?:""
val points = input.toInt()
val grade: String? = if(points>=90 && points <=100)
    "A"
else if(points>=80 && points <=89)
    "B"
else if(points>=70 && points <=79)
    "C"
else if(points>=60 && points <=69)
    "D"
else if(points>=50 && points <=59)
    "E"
else
    "F"
println(grade)

```
-------------------------------
#### When conditional

<img src="https://developer.android.com/static/codelabs/basic-android-kotlin-compose-conditionals/img/2f7c0a1e312a2581_856.png" alt="isolated" width="500"/>  
https://developer.android.com/codelabs/basic-android-kotlin-compose-conditionals#2  

Example:

```
var animal = "cat"
var action: String = ""
when (animal) {
    "cat" -> {
        action = "pet it"
     }
     "dog" -> {
        action = "feed it"
     }
     else -> {
        action = "google it"
     }
}
    println("When you meet a $animal, you should $action.") // output -> When you meet a cat, you should pet it.
```

```
var result = ""
var number = 1234
when(number%2){
    0 -> result = "even"
    1 -> result = "odd"
}
println("Number is $result") // -> Number is even
```

**When as a statement**

```
val animal = "dog"
val action = when(animal){
    "cat" -> "pet it"
    "dog" -> "feed it"
    else -> "google it"
}
println("When you see a $animal then $action") // -> When you see a dog then feed it
```

**Capturing the subject**

It is possible to capture the value in a when statement and use it in the block.

```
val name = "Monkey D. Luffy"
when(val length = name.length){
    in 1..5 -> println("A name $name with length of $length characters is short")
    in 6..10 -> println("A name $name with length of $length characters is medium")
    else -> println("A name $name with length of $length characters is long.")
}
Output -> A name Monkey D. Luffy with length of 15 characters is long.
```

This is useful when getting a result of a function.

Practice: When conditional  
Assume that 3 means a day is the recommended amount. Ask the user to input the number of means they have every day.
Based on the input, print out a message that encourages the user to increase or decrease the number of means they have.

```
print("How many meals do you have in a day?")
val input = readLine()
val numberOfMealsFromUser = input?.toIntOrNull()
val recommendedMeals = 3
when (numberOfMealsFromUser) {
    in 0..2 -> println("You should each more.")
    3 -> println("That is perfect")
    else -> println("You should eat less")
}
```

Practice 2:  
Assuming, based on the hour of the day 6 to 11 -> morning, 12 to 14 -> noon, 15 to 17 -> afternoon, 18 to 21 -> evening,
22 to 5 -> night  
Ask user to input the current hour, and print out the message.

```
print("Please enter current hour(0..23): ")
val input = readLine()?:""
val currentHour = input.toIntOrNull()
when(currentHour){
    in 6..11 -> println("It is morning")
    in 12..14 -> println("It is noon")
    in 15..17 -> println("It is afternoon")
    in 18..21 -> println("It is evening")
    in 22..23 -> println("It is night")
    in 0..5 -> println("It is night")
    else -> println("Please enter correct input")
}

Output:

Please enter current hour(0..23): 0
It is night
```

Exercise:
Ask the user to input their name.  
Based on the first letter of their name, print out a personalised greeting  
for the first 3 letters of the alphabet,  
a different one for the next 3 letters,  
and a third message for the rest

```
print("Please Enter your name: ")
val name = readLine()?:""
when(name[0]){
    in 'A'..'C' -> println("Hello $name")
    in 'D'..'F' -> println("Hi $name")
    else -> println("Hey $name")
}

Output:
Please Enter your name: Zoro
Hey Zoro
```
-------------------------------
#### For loop

- works on elements of a collection
- Executes a block of code for each element in an iterator

`--> collection C -> for  each element in collection C -> do something`

Example:
```
val animals = arrayListOf("cat","dog","mouse","bear")
for(animal in animals){
    println("Feed the $animal")
}

Output:
Feed the cat
Feed the dog
Feed the mouse
Feed the bear
```

```
for(i in 1..12){
    val month = when(i){
        1 -> "January"
        2 -> "February"
        3 -> "March"
        4 -> "April"
        5 -> "May"
        6 -> "June"
        7 -> "July"
        8 -> "August"
        9 -> "September"
        10 -> "October"
        11 -> "November"
        else -> "December"
    }
    println("Month #$i is $month")
}
Output:
Month #1 is January
Month #2 is February
Month #3 is March
Month #4 is April
Month #5 is May
Month #6 is June
Month #7 is July
Month #8 is August
Month #9 is September
Month #10 is October
Month #11 is November
Month #12 is December
```

Exercise: Add up all the numbers from 1 to 100
```
var sum = 0
for(i in 1..100){
   sum += i
}
println(sum)
Output:
5050

```

Exercise: Printout message telling how many purchases they have made.
```
val customers = hashMapOf(Pair("Alice",4),Pair("Judy",8),Pair("Anna",6))
for(customerName in customers.keys){
    println("$customerName has ${customers[customerName]} purchases.")
}
Output:
Judy has 8 purchases.
Alice has 4 purchases.
Anna has 6 purchases.
```

Exercise:  
Ask the user to input a year. For each month of that year, print out how many days there are.  
Make sure you count leap years.  
Assume a leap year is a year that is divisible by 4.  
*there are additional rules for leap years, but we will ignore those in this exercise

```
print("Please enter a desired Year: ")
val input = readLine() ?: ""
val year = input.toIntOrNull()
val months = listOf(
    "January", "February", "March", "April", "May", "June",
    "July", "August", "September", "October", "November", "December"
)
for (month in months) {
    if (year != null && listOf("January", "March", "May", "July", "August", "October", "December").contains(month)) {
        println("$month has 31 days")
    } else if (year != null && listOf("April", "June", "September", "November").contains(month)) {
        println("$month has 30 days")
    } else if (year != null && month == "February" && year % 4 == 0)
        println("$month has 28 days") else println("$month has 29 days")
}
Output:
Please enter a desired Year: 2021
January has 31 days
February has 29 days
March has 31 days
April has 30 days
May has 31 days
June has 30 days
July has 31 days
August has 31 days
September has 30 days
October has 31 days
November has 30 days
December has 31 days
 
```

**Ranges in for loops** 

```
for(i in 1..3){
    println("Strike #$i")
}
println("You are out!")
```

Descending:
```
for(i in 10 downTo 0){
    println(i)
    when(i){
        9 -> println("Start your Engine!")
        6 -> println("On your marks!")
        3 -> println("Get Set!")
        0 -> println("GO!")
    }
}
Output:
10
9
Start your Engine!
8
7
6
On your marks!
5
4
3
Get Set!
2
1
0
GO!
```  

**step** Exercise:

```
for(i in 1..10 step 3){
    println(i)
}

Output:
1
4
7
10
```



**Nested for loops**

**Inside a for loop** you can have any code you like, including other **for loop**

```
for(i in 1..5){
    for(j in 1..5){
        print("$i, $j \t")
    }
    println()
}

Output:
1, 1 	1, 2 	1, 3 	1, 4 	1, 5 	
2, 1 	2, 2 	2, 3 	2, 4 	2, 5 	
3, 1 	3, 2 	3, 3 	3, 4 	3, 5 	
4, 1 	4, 2 	4, 3 	4, 4 	4, 5 	
5, 1 	5, 2 	5, 3 	5, 4 	5, 5 
```

```
for(i in 0..5){
    for(j in 0..5){
        if(i==j) {
            print("diagonal \t")
        }
        else print("$i, $j\t\t")
   }
   println()
}

Output:
diagonal 	0, 1		0, 2		0, 3		0, 4		0, 5		
1, 0		diagonal 	1, 2		1, 3		1, 4		1, 5		
2, 0		2, 1		diagonal 	2, 3		2, 4		2, 5		
3, 0		3, 1		3, 2		diagonal 	3, 4		3, 5		
4, 0		4, 1		4, 2		4, 3		diagonal 	4, 5		
5, 0		5, 1		5, 2		5, 3		5, 4		diagonal
```

Exercise: printout every number smaller than user-input(maxValue) that is divisible by 7, in descending order
```
print("Please enter a value: ")
val input = readLine()?:"70"
val maxValue = input.toInt()
for(value in maxValue downTo 1){
    if(value%7==0){
        println(value)
    }
}

Output:
70
63
56
49
42
35
28
21
14
7
```
Exercise: print smiley emoji pattern

```
for(i in 1..10){
    for(j in 1..i){
        print("\uD83D\uDE04 ")
    }
    println()
}

Output:
😄 
😄 😄 
😄 😄 😄 
😄 😄 😄 😄 
😄 😄 😄 😄 😄 
😄 😄 😄 😄 😄 😄 
😄 😄 😄 😄 😄 😄 😄 
😄 😄 😄 😄 😄 😄 😄 😄 
😄 😄 😄 😄 😄 😄 😄 😄 😄 
😄 😄 😄 😄 😄 😄 😄 😄 😄 😄 
```

Exercise:  
Ask the user for a number.
Print out a square matrix of the size indicated by the number.
Inside each cell, print out 1 emoji
😀 If the row*column is divisible by 3
🤨 If the row*column % 3 is 1  
😱 If the row*column % 3 is 2  
```
print("Please enter a number to create a square matrix: ")
val input = readLine() ?: "4"
val matrixSize = input.toInt()
for (i in 0..matrixSize) {
    for (j in 0..matrixSize) {
        when ((i * j) % 3) {
            0 -> print("\uD83D\uDE00 ")
            1 -> print("\uD83E\uDD28 ")
            2 -> print("\uD83D\uDE31 ")
        }
        println()
    }
}

Output:
😀 😀 😀 😀 😀 😀 
😀 🤨 😱 😀 🤨 😱 
😀 😱 🤨 😀 😱 🤨 
😀 😀 😀 😀 😀 😀 
😀 🤨 😱 😀 🤨 😱 
😀 😱 🤨 😀 😱 🤨 
```
-------------------------------
#### While loop
<img src="https://cdn.programiz.com/sites/tutorial2program/files/kotlin-while-loop-flowchart.jpg" alt="isolated" width="400"/>

- works on a boolean expression  
- `while(expression==true) -> do something`     
- Body needs to modify the value responsible for the condition, as it will influence the expression, eventually making it false  

Example: 

```
var i=0
while(i<10){
    // do something
    i++
}
```

Example: Print out a greeting message 10 times
```
var i=0
while(i<10){
    println("Hello #$i")
    i++
}

Output:
Hello #0
Hello #1
Hello #2
Hello #3
Hello #4
Hello #5
Hello #6
Hello #7
Hello #8
Hello #9
```

Exercise: Print out hello for each cat
```
val cats = listOf("Lucy", "Tommy", "Smokey", "Sammy", "Patch")
var i = 0
while (i < cats.size) {
    println("Hello ${cats[i]}")
    i++
}

Output:
Hello Lucy
Hello Tommy
Hello Smokey
Hello Sammy
Hello Patch
```

Exercise: Calculate the factorial of the inputted integer, for numbers up to 20, because the limit of Integer and Long is limited.
```
print("Please enter a number for calculating a factorial of it: ")
val input = readLine() ?: "1"
var inputtedNumber = input.toLong()
var factorial:Long = 1
while (inputtedNumber>=1) {
    factorial *= inputtedNumber
    inputtedNumber--
}
println("Factorial of $input is $factorial")

Output:
Please enter a number for calculating a factorial of it: 5
Factorial of 5 is 120
```

Exercise: Print out all the numbers that are divisible by 7, that are less than the user’s number.
```
print("Please enter a number to see all the numbers less than it that are divisible by 7: ")
val input = readLine() ?: "1"
var number = input.toInt()
var i = 0
while (i <= number) {
   if (i % 7 == 0) {
      println(i)   
    }
    i++
}

Output:
Please enter a number to see all the numbers less than it that are divisible by 7: 36
0
7
14
21
28
35
```
##### do while loop 
- Very similar to **while loop**
- Condition is evaluated at the end
- There are rare situations where you have to choose either `while` or `do while`
```
var i = 0
do {
    // do somehting
    i++
} while (i < 10)
```
Exercise:
```
val puzzlePieces = 10
var piecesPlaced = 0
do {
piecesPlaced++
println("Placed piece #$piecesPlaced")
} while (piecesPlaced < puzzlePieces)
Output:
Placed piece #1
Placed piece #2
Placed piece #3
Placed piece #4
Placed piece #5
Placed piece #6
Placed piece #7
Placed piece #8
Placed piece #9
Placed piece #10
```

Exercise: Ask the user to input a number multiple times, until they input a number larger than 100
```
do {
    print("Please input a number greater than 100:")
    val input = readLine() ?: ""
    val number = input.toInt()
    if(number>=100){
        println("Thank you!")
    }
    else println("Please try again!")
} while (number < 100)

Output:
Please input a number greater than 100:10
Please try again!
Please input a number greater than 100:20
Please try again!
Please input a number greater than 100:90
Please try again!
Please input a number greater than 100:100
Thank you!
```

Exercise: If a factorial is less than 3000000, ask them to input another number and repeat the process.
```
do {
    var factorial = 1
    print("Please input a number whose factorial is more than 3000000: ")
    var input = readLine() ?: ""
    var number = input.toDouble()
    var i = 1
    while (i <= number) {
        factorial *= i
        i++
    }
    if (factorial < 3000000)
        println("Factorial is less than 3000000!: $factorial")
    else
        println("Factorial is $factorial")

} while (factorial < 3000000)

Output:
Please input a number whose factorial is more than 3000000: 5
Factorial is less than 3000000!: 120
Please input a number whose factorial is more than 3000000: 20
Factorial is less than 3000000!: -2102132736
Please input a number whose factorial is more than 3000000: 15
Factorial is 2004310016
```

##### nested  while loop
- A block of code of a **while loop** can contain anything including other block of code.
```
var i = 0
var j = 0
while(i<10){
    while(j<10){
        print("$i$j \t")
        j++
    }
    println()
    j=0
    i++
}

Output:
00 	01 	02 	03 	04 	05 	06 	07 	08 	09 	
10 	11 	12 	13 	14 	15 	16 	17 	18 	19 	
20 	21 	22 	23 	24 	25 	26 	27 	28 	29 	
30 	31 	32 	33 	34 	35 	36 	37 	38 	39 	
40 	41 	42 	43 	44 	45 	46 	47 	48 	49 	
50 	51 	52 	53 	54 	55 	56 	57 	58 	59 	
60 	61 	62 	63 	64 	65 	66 	67 	68 	69 	
70 	71 	72 	73 	74 	75 	76 	77 	78 	79 	
80 	81 	82 	83 	84 	85 	86 	87 	88 	89 	
90 	91 	92 	93 	94 	95 	96 	97 	98 	99
```

Exercise:
You have a set of usernames  
val usernames = hashSetOf(“john”, “bob”, “alice”)  
Ask the user to choose their username. If their username is taken, print out a message and ask again.  
Add the username to the set.
```
var usernames = hashSetOf("John", "bob", "alice")
do {
    var flag = false
    print("Please input a username: ")
    val input = readLine() ?: ""
    if (usernames.contains(input)) {
        println("Username $input already exists.")
    } else {
        usernames.add(input)
        println("Username has been added")
        flag = true
    }
} while (!flag)
println("Username list: $usernames")

Output: 
Please input a username: bob
Username bob already exists.
Please input a username: Timmy
Username has been added
Username list: [John, alice, bob, Timmy]
```

-------------------------------
#### Expressions

**Arithmetic and Logical Expressions:**

An expression consists of variables and operators that evaluate to a single value.  
Eg: `1+1 // 2` OR `326/72 * 15 + 93 % 13 // 62`  
We cannot use these kinds of expressions in conditional statements.  
We need expressions that evaluate a boolean value -> `true` or `false`  
Eg: `1+1 == 2 // true` `1+1 == 5 // false`  
In conditional statements we can use any logical expressions.  
Example:

```
if(326/72 * 15 + 93 % 13 == 62){
println("Math is easy") // Math is easy
}else{
println("Math is difficult")
}
```

```
val haveCat = true
val haveCatFood = true
if(haveCat && haveCatFood){
    println("Cat is happy")
}else{
    println("Oh no!")
}
```

**in keyword**
Checks whether a value is in a Collection or in a range.  
`"cat" in listOf("dog","cat","rabbit")` AND `5 in 1.....10`  
Example with collection:

```
val favouritePet = "dog"
val availablePets = listOf("dog","cat","horse")
if(favouritePet in availablePets){ // in keyword
    println("YAY!")
}else{
    println("Oh no!")
}
if(favouritePet !in availablePets){   // !in keyword
    println("Please notify when you have a dog.")
}else{
    println("Yay!") // Yay!
}
```

Example with range:

```
println("Please input a number") // 60
val input = readLine() ?: ""
val number = input.toInt()
if(number !in 0..9){
    println("Your input is not single digit") // Your input is not single digit
}
```

Boolean returning function:  
A function can be used in a conditional statement if it returns a boolean.

```
val animals = arrayListOf<String>()
if (animals.isEmpty()) {
    animals.add("Dog")
} else {
    animals.add("Cat")
}
println(animals) // [Dog]
```

```
val animals = arrayListOf<String>()
if (animals.add("Horse")) {
    println("Horse was added successfully") // Horse was added successfully
} else {
    println("Horse not was added")
}
println(animals) // [Horse]
```

Practice:

```
val guestList = listOf("Alice", "Bob", "Carol", "John")
print("Please enter your name: ")
val guest = readLine() ?: ""
if (guest in guestList) {
    println("Please come in")
} else {
    println("Sorry, you are not on the list")
}
```

```
print("How many cats do you have? ")
val input = readLine() ?: "0"
val numberOfCats = input.toInt()
val howMany = if (numberOfCats in 1..3)
    "few cats"
else if(numberOfCats in 4..6)
    "several cats"
else
    "Many cats"
println("This lady has $howMany")
```

Exercise:
Ask a user to input their age.

If they are under 13, they are a child If they are under 18, they are a teen If they are older, they are an adult.

Use ranges to print out the correct message.

If the age is 0, convert it to 1.

```
print("Enter the age:")
val input = readLine() ?: "0"
var age = input.toInt()
if (age == 0) age = 1
if (age in 1..12) println("You are a child")
else if (age in 13..18) println("You are a child")
else println("You are an adult")
```

-------------------------------

### Break and Continue

#### break
- Terminates a loop

```
var onlyEvenNumbers = arrayListOf(2, 4, 6, 8, 7, 10, 12) // 7 is not even
for (number in onlyEvenNumbers) {
    if (number % 2 != 0)
        break // breaks out of for loop
    println("Even Number $number/2 = ${number / 2} ")
}

Output:
Even Number 2/2 = 1
Even Number 4/2 = 2
Even Number 6/2 = 3
Even Number 8/2 = 4
```

#### continue
- Proceeds to the next step of the loop 

```
var onlyEvenNumbers = arrayListOf(2, 4, 6, 8, 7, 10, 12) // 7 is not even
for (number in onlyEvenNumbers) {
    if (number % 2 != 0)
        continue //continues to the next step
    println("Even Number $number/2 = ${number / 2} ")
}

Output:

Even Number 2/2 = 1 
Even Number 4/2 = 2 
Even Number 6/2 = 3 
Even Number 8/2 = 4 
Even Number 10/2 = 5 
Even Number 12/2 = 6 
```

#### labels
- Usually not considered a good coding practice
- A label is used to mark a position in code that you can jump to
- Can be used with break and continue

```
loop@ for(i in 1..5){
    for(j in 1..5){
        if(i%3==0)
            break@loop
        println("$i,$j")
    }
}
Output:
1,1
1,2
1,3
1,4
1,5
2,1
2,2
2,3
2,4
2,5
```

#### Exercise break and continue

Exercise 1:
An animal shelter is accepting all animals except "snake".  
A user is allowed to bring 5 animals to the shelter.  
Ask the user to input the animals they want to bring.  
If they bring a snake, print a message and stop accepting animals.
```
var animals = arrayListOf<String>()
for(i in 1..5){
    print("Please enter an animal: ")
    var input = readLine()?:""
    if(input == "snake") {
        println("Snakes are not allowed")
        break
    }
    animals.add(input)
}
println("Current animal is: $animals")

Output:
Please enter an animal: dog
Please enter an animal: cat
Please enter an animal: elephant
Please enter an animal: snake
Snakes are not allowed
Current animal is: [dog, cat, elephant]
```

Exercise 2:
You have a list of clients
val clients = listOf("Anna","Bob","Carol","David")
Print out a greeting message for each client, unless their name starts with the letter 'c'
```
val clients = listOf("Anna","Bob","Carol","David")
for(client in clients){
    if(client.startsWith("C")){
        continue
    }
    println("Hello $client")
}

Output:
Hello Anna
Hello Bob
Hello David
```

Exercise 3:
A group of young people are going to a nightclub.  
Design a program that accepts user ages.  
The program displays a welcome message for each user.  
If it receives an age lower than 18, it prints a message that this client is not allowed.
If it receives the word “stop”, the program ends
```
while (true) {
    print("Please enter your age:")
    val input = readLine() ?: ""
    if (input == "stop") break
    if (input.toInt() < 18)
        println("You are underage! No entry!")
    else
        println("Welcome to the club")
}
Output
Please enter your age:14
You are underage! No entry!
Please enter your age:18
Welcome to the club
Please enter your age:3
You are underage! No entry!
Please enter your age:stop
```
-------------------------------
### Functions

- A way to group code that can be executed 0 or more times.
- Can accept input and return output, but both of these are optional depending on the requirements.
- Create a function `fun functionName(){// do something}`
- Call a function `functionName()`

Practice 1: Print hello 3 times
```
fun main(args: Array<String>) {
    for(i in 1..3)
        sayHello()
}
fun sayHello(){
    println("Hello Everyone!")
}
Output:
Hello Everyone!
Hello Everyone!
Hello Everyone!
```
Practice 2: print alphabets 5 times
```
fun main(args: Array<String>) {
    var i=5
    do {
        printAlphabets()
        i--
    }while(i>0)
}
fun printAlphabets(){
    println("a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z")
}
Output:
a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z
a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z
a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z
a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z
a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z
```

Practice 3: Take an input number and multiply by 17 and do it for 3 times

```
fun main(args: Array<String>) {
    for(i in 1..3)
        multipleOf17()
}
fun multipleOf17(){
    print("Please Enter a number: ")
    val input = readLine()?:"0"
    val number = input.toInt()
    println("$number * 17 = ${number*17}")

}

Output:
Please Enter a number: 14
14 * 17 = 238
Please Enter a number: 12
12 * 17 = 204
Please Enter a number: 1
1 * 17 = 17
```

Exercise:
Design a function that asks for a user’s name. Then it asks for a user’s birth year.  
Finally, it prints out a message saying the user’s name and age.  
Call the function 3 times.

```
fun main(args: Array<String>) {
    for(i in 1..3)
        printNameAndAge()
}
fun printNameAndAge(){
    print("Please Enter Name: ")
    val inputName = readLine()?:""
    print("Please Enter Birth year: ")
    val inputYear = readLine()?:""
    println("Name: $inputName, Age: ${2023-inputYear.toInt()}")
}

Output:
Please Enter Name: abby
Please Enter Birth year: 1995
Name: abby, Age: 28 or 27
Please Enter Name: Shabby
Please Enter Birth year: 1989
Name: Shabby, Age: 34 or 33
Please Enter Name: Dabby
Please Enter Birth year: 1990
Name: Dabby, Age: 33 or 32
```

#### Function Parameters
- A function can accept parameters(arguments)
- `fun double(number:Int){print(number*2)}`
- Parameter can have default values

Practice 1:
```
fun main(args: Array<String>) {
    print(doubleInt(2))
}
fun doubleInt(number: Int): Int{
return number*2
}
Output:
4
```

Practice 2: Print Hello message for each person in arrayList

```
fun main(args: Array<String>) {
var people = arrayListOf("Abby", "Babby", "Cabby", "Dabby")
    sayHelloToPeople(people)
}
fun sayHelloToPeople(people: ArrayList<String>){
    for(person in people){
        println("Hello $person")
    }
}
Output:
Hello Abby
Hello Babby
Hello Cabby
Hello Dabby
```

Practice 3: Parameter with default value

```
fun main(args: Array<String>) {
    doubleMessageMethod(5)
    doubleMessageMethod(5, "5 * 2 = ")
    
}

fun doubleMessageMethod(number: Int, message: String = "Double is"){
    println("$message ${number * 2}")
}
Output:
Double is 10 // with default value
5 * 2 =  10
```

#### Function return

- A function can return a result/value

return with a single line code, without needing to specify return keyword/ return type
```
fun main(args: Array<String>) {
var radius = 10
println("The Area of a circle with radius $radius is ${areaOfCircle(radius)}")
}
fun areaOfCircle(radius: Int) = return 3.1415 * radius * radius
Output:
The Area of a circle with radius 10 is 314.15000000000003
```

Practice 1: return personalised message for each person
```
fun main(args: Array<String>) {
var people  = listOf("Anna", "Max", "Sophia", "Patrick")
    for(person in people){
        println(personalisedMessage(person))
    }
}
fun personalisedMessage(person: String): String{
    val greeting = when(person){
        "Anna" -> "Hey $person"
        "Max" -> "How are you $person"
        "Sophia" -> "Hello $person"
        "Patrick" -> "Wasssup $person"
        else -> "Hallo leute"
    }
    return greeting
}

Output:
Hey Anna
How are you Max
Hello Sophia
Wasssup Patrick
```

Practice 2: sum of 2 number(parameters), call the function 3 times

```
fun main(args: Array<String>) {
for (i in 1..3) {
        println("The addition of 2 numbers is ${addition(i + 1, i + 2)}")
    }
}
fun addition(number1: Int, number2: Int) = number1 + number2

Output: 
The addition of 2 numbers is 5
The addition of 2 numbers is 7
The addition of 2 numbers is 9
```

Practice 3: Add 20% tax to the product cost and print the final price.

```
fun main(args: Array<String>) {
val products = hashMapOf(Pair("Shoes", 29.99), Pair("Socks", 9.99), Pair("Joggers", 19.99), Pair("T-shirt", 4.99))
    for (item in products.keys) {
        val cost = products[item]
        println("The final price of the product ${item} is ${calculateTax(cost) + cost!!}")
    }
}

fun calculateTax(price: Double?) = 20 * price!! / 100

Output:
The final price of the product Shoes is 35.988
The final price of the product Socks is 11.988
The final price of the product Joggers is 23.988
The final price of the product T-shirt is 5.988
```

Exercise:
Create a function that receives the name of an animal, and returns the estimated lifespan.  
cats -> 15  
dogs -> 10  
rabbit -> 12  
everything else -> 20   
Ask the user to input an animal, then print out the estimated lifespan for that animal.


```
fun main(args: Array<String>) {
    val animalsList = listOf("Cats", "Dogs", "Rabbit","Crocodile")
    for(animal in animalsList)
        println("$animal's estimated lifespan is ${lifespanOfAnimals(animal)} years")
}
fun lifespanOfAnimals(animal: String): Int {
    return when(animal){
        "Cats" -> 15
        "Dogs" -> 10
        "Rabbit" -> 12
        else -> 20
    }
}
Output:
Cats's estimated lifespan is 15 years
Dogs's estimated lifespan is 10 years
Rabbit's estimated lifespan is 12 years
Crocodile's estimated lifespan is 20 years
```

#### Function Overloading

- Two functions can have same name, if they have different numbers or types of parameters.
- `fun multiply(number: Int) = number*2`  
  And  
  `fun multiply(number1: Int, number2: Int) = number1*number2`

Practice 1:
```
fun main(args: Array<String>) {
    multiply(5)
    multiply(5,10)
}
fun multiply(number: Int) = 
    println("Multiplication of $number by 2 = ${number*2}")
fun multiply(number1: Int, number2: Int) = 
    println("Multiplication of $number1 by $number2  = ${number1*number2}")
Output:
Multiplication of 5 by 2 = 10
Multiplication of 5 by 10  = 50
```

Practice 2: Create an overloaded function that takes either an animal or a list of animals. Print out message to feed each animal.
```
fun main(args: Array<String>) {
    feedAnimal("Cat")
    feedAnimal(listOf("Hamster", "Dog", "Corcodile", "Snake"))
}
fun feedAnimal(animal: String){
    println("Feed $animal")
}
fun feedAnimal(animalsList: Collection<String>){
    for(animal in animalsList) {
        feedAnimal(animal)
    }
}
Output:
Feed Cat
Feed Hamster
Feed Dog
Feed Corcodile
Feed Snake
```

Practice 3: Create a function that takes a message and prints out the size of the message.  
Overload the function to take an integer and print out a string of the size of that integer. The content of the string is not important.

```
fun main(args: Array<String>) {
    printMessageOrSize("Hello World")
    printMessageOrSize(10)
}
fun printMessageOrSize(number: Int){
    println("A random String of length $number is: ${getRandomString(number)}")
}
fun printMessageOrSize(message: String){
    println("A length of the message '$message' is: ${message.length}")
}
 //              Random String Generator
fun getRandomString(length: Int) : String {
    val allowedChars = ('A'..'Z') + ('a'..'z') + ('0'..'9')
    return (1..length)
        .map { allowedChars.random() }
        .joinToString("")
}
Output:
A length of the message 'Hello World' is: 11
A random String of length 10 is: Qd7tWyUcsX
```

Exercise: Create a function that takes a product name and price. 
It adds 20% tax to that product and displays a message saying how much the product costs.  
Overload the function so that it takes a map of products and prices, and does the same thing.
Call both functions in your program.

```
fun main(args: Array<String>) {
    val name = "Bat"
    val basePrice = 100.00
    val listOfProductsAndPrice = mapOf("Bat" to 100.00, "Ball" to 70.00, "Joggers" to 60.00)

    calculateAndPrintTotalAmountWithTax(name, basePrice)
    calculateAndPrintTotalAmountWithTax(listOfProductsAndPrice)
}

fun calculateTax(price: Double?) = 20 * price!! / 100

fun calculateAndPrintTotalAmountWithTax(name: String, basePrice: Double) {
    println("The final price of the product $name is ${calculateTax(basePrice) + basePrice!!}")
}
fun calculateAndPrintTotalAmountWithTax(productsAndPrice: Map<String, Double>) {
    for(productName in productsAndPrice.keys){
        calculateAndPrintTotalAmountWithTax(productName, productsAndPrice[productName]!!)
    }
}
Output:
The final price of the product Bat is 120.0
The final price of the product Bat is 120.0
The final price of the product Ball is 84.0
The final price of the product Joggers is 72.0
```

#### Scope
- A variable defined inside a function only exists in that function, unless we pass that information via `return` keyword.
```
fun example(){
    val flower = 5
    println("I have $flowers flowers") // Output: I have 5 flowers
}
println("I have $flowers flowers") // Error: Unresolved reference: flowers
```

Exercise 1: 
Create a function that has a variable `years` with the value `1985`.  
In the main function, create a variable `years` with the value `2015`.  
Call the function, then print out the `year` variable.
What is the value?
Which variable was accessed?

```
fun main(args: Array<String>) {
    val year = 2015
    println("The year in the main function is $year") // print this 
    printYears() // then execute this
}
fun printYears() {
    val year = 1985
    println("The year inside the function is $year")
}
Output:
The year in the main function is 2015
The year inside the function is 1985
```

Exercise 2:
ou have the following program.

```
fun main(args: Array<String>) {
    var parakeets = 5
    buyMoreParaqueets(parakeets)
    println("You now have $parakeets parakeets")
}
 
fun buyMoreParaqueets(parakeets: Int) {
    val parakeets = 3
}
```
What is the outcome when running this program?

```
Output: You now have 5 parakeets
// Because buyMoreParaqueets() does not perform any print action 
// for the new assigned value, and there is no return of that variable.
```

#### varargs
- Variable number of parameters(arguments)

Practice: 
```
fun main(args: Array<String>) {
    sayHello("Alice", "Bob", "Dan", "Fiona")
    sayHello("Tom", "Patrick", "Philip")
}
fun sayHello(vararg names: String){
    for(name in names){
        println("Hello $name")
    }
}
Output:
Hello Alice
Hello Bob
Hello Dan
Hello Fiona
Hello Tom
Hello Patrick
Hello Philip
```

Practice: Create a function that takes a variable number of integers and returns the sum of those integers

```
fun main(args: Array<String>) {
    var result = addIntegers(1,2,3,4,5,6,7,8,9,10)
    println("The sum of integers is $result")
}
fun addIntegers(vararg numbers: Int): Int {
    var result = 0
        for(number in numbers){
            result += number
    }
    return result
}
Output: 
The sum of integers is 55
```

Exercise: Create a function that takes an integer variable “count” 
and a variable number of client names. Print out “count” hello messages for each client.

i.e. if count = 3, print out 3 hello messages for each client.
```
fun main(args: Array<String>) {
    var count = 3
    printHelloNTimes(3, "Tom", "Patrick", "Philip")
}
fun printHelloNTimes(count: Int, vararg names: String) {
    for (name in names) {
        for (i in 1..count) {
            println("Hello $name")
        }
    }
}

Output:
Hello Tom
Hello Tom
Hello Tom
Hello Patrick
Hello Patrick
Hello Patrick
Hello Philip
Hello Philip
Hello Philip
```

#### Local Functions

- A local function is a function inside a function.
- Don't have scope outside the parent function.
```
fun listAnimals() {
    fun listOneAnimal(animal: String) {
        println("I have $animal")
    }

    val myAnimals = arrayListOf("cat", "dog", "cow", "horse")
    for (animal in myAnimals) {
        listOneAnimal(animal)
    }
}

Output:
I have cat
I have dog
I have cow
I have horse
```

Practice:
Create a function that takes a map of users and their bank balance. Inside create a function that takes a number and returns its double.  
Double each user's bank balance and print out a statement.

```
fun printDoubleBalance(){
    val usersList = hashMapOf(Pair("User1",100.0), Pair("User2",200.0), Pair("User3",300.0), Pair("User4",400.0), Pair("User5",500.0))
    println(usersList)
    fun doubleBalance(balance: Double): Double {
        return (balance.times(2))
    }
    for(user in usersList.keys){
        var doubleBalance: Double = doubleBalance(usersList[user]!!)
        usersList[user] = doubleBalance
    }
    println(usersList)
}

Output:
{User5=500.0, User4=400.0, User3=300.0, User2=200.0, User1=100.0}
{User5=1000.0, User4=800.0, User3=600.0, User2=400.0, User1=200.0}
```

Exercise:
Create a function that asks the user for a name until an empty string is introduced.  
Create a local function that takes a name and prints a greeting.  
For each name introduced, print out a greeting.
```
fun readAndPrintGreetingMessage() {
    var inputString: String
    fun printGreetingMessage(name: String) {
        println("Hello $name")
    }
    do {
        print("Please enter Name: ")
        println()
        inputString = readlnOrNull() ?: ""
        if (inputString != "") {
            printGreetingMessage(inputString)
        }
    } while (inputString != "")
}

Output:
Please enter Name: 
Alex
Hello Alex
Please enter Name: 
Priya
Hello Priya
Please enter Name:
<Enter>
```
#### Lambda Functions

- A lambda is an anonymous function (has no name)  
- Normal function vs lambda
```
fun printMessage(name: String) {
    println("Hello $name")
}
```
vs  
`{name: String -> println("Hello $name"")}`
- A lambda function can have parameters, they have to be declared at the start of the block.  
- A lambda function can be assigned to a variable  
  `val myLambda = {name: String -> println("Hello $name"")}`
- The variable can be passed as a parameter to a new function, Higher order function.

##### Higher Order Functions

- A Higher Order Function(HOF) is a function that takes another function as a parameter.  

Exercise:  
```
fun main(args: Array<String>) {
val names = arrayListOf("Dan", "Bob", "Carol", "Jenny")
val myLambda = {name: String -> println("Hello $name")}
sayHelloHOF(names, myLambda)
    // OR lambda function can go outside
sayHelloHOF(names) { name: String -> println("Hello $name") }
}

fun sayHelloHOF(names: ArrayList<String>, doSomething: (String) -> Unit) {
    for (name in names) {
        doSomething(name)
    }
}
```

Practice:  
Create a HOF that takes a mutable collection of integers and a lambda function.  
It then applies the lambda function to every even element of that collection.  
Create a lambda function that when applies to an integer, it returns that integer divided by 10.  
Call HOF using your lambda and display the result.
```
fun main(args: Array<String>) {
    val numbers = arrayListOf(1, 2, 3, 4, 5, 6, 10, 20, 35, 36, 55, 48)
    higherOrderFunctionLambdaPractice(numbers) { num: Int -> num / 10 }
}

fun higherOrderFunctionLambdaPractice(numbers: ArrayList<Int>, lambdaFunction: (Int) -> Int) {
    for (num in numbers) {
        if (num % 2 == 0) {
            val printVal = lambdaFunction(num)
            println("$num / 10 = $printVal, ")
        }
    }
}
```

Exercise:

Create a Higher Order Function that takes a list of client names and a lambda expression that returns a String.  
It then applies the lambda expression to every client name, creates a new collection of the results and returns the result.  
Create a lambda expression that takes a client name String and returns a personalised message.  
Call the HOF and print out the result.  

```
fun main(args: Array<String>) {
    higherOrderFunctionLambdaExerciseString(arrayListOf("Dan", "Bob", "Carol", "Jenny")) {clientName: String -> println("Hello $clientName").toString() }
}
fun higherOrderFunctionLambdaExerciseString(
    clientNames: ArrayList<String>,
    lambdaFunctionExercise: (String) -> String
): ArrayList<String> {
    val message = arrayListOf<String>()
    for(name in clientNames){
        message.add(lambdaFunctionExercise(name))
    }
    return message;
}
```

##### Common Higher Order Functions

Here are some of the common HOFs:  
```
forEach(), map(), filter(), 
groupBy(), maxBy(), minBy(), 
sortedBy(), ...
```

Practice:
1. Given a set of random integers. printout a subset that consists only of double-digit integers.

```
val numbers = setOf(1, 2, 12, 45, 3, 56, 7, 89, 76, 444, 98, 7, 126)
val doubleDigitArray = numbers.filter { it -> it in 10..99 }
println(doubleDigitArray)
```

2. Display a list of clients sorted by the last letter of the name.  

```
val clientNames = arrayListOf("Dan", "Bob", "Carol", "Jenny")
println(clientNames.sortedBy { it[it.length - 1] })
```

3. Print out the integer that has the biggest middle digit, in the list of three digit numbers.
```
val threeDigitNumbers = listOf(123, 456, 789, 456, 989, 798, 999)
println(threeDigitNumbers.maxBy { it.toString()[1] })
    // OR
println(threeDigitNumbers.maxBy { it /10 % 10 })
```

Exercise:
Given a collection of random integers.  
If a number is odd, double it.  
If a number is even, half it.  
Print out a subset of the collection that has numbers greater than 25.  

```dtd
val randomNumbers = listOf(12, 23, 34, 56, 67, 87, 89, 214, 542, 55, 54, 67, 84, 123)
println(randomNumbers.map {
        if (it % 2 == 0)
            it / 2
        else
            it * 2
    }.filter { it > 25 })

Output: [46, 28, 134, 174, 178, 107, 271, 110, 27, 134, 42, 246]
```

-------------------------------

### Packages

- A package is a way to group and organise related code together.
- A package definition is the first line of a file.  
  e.g. `package com.orginisation.project.configuration`
- Practically, a package is a folder on the disk.
- **Scope** - is the visibility in the same package. 
In order to use the code from another package, that package must be [imported](#imports) into the project.

#### Naming conventions

- Package names are separated by dots.
- Names are always lower case, with no underscore.
- Leftmost name is the highest level package.
- Rightmost name is the lowest level package.

#### Imports

- In order to use the code from another package, we mush import that package.  
e.g. `com.orginisation.project.feature.featureOne`(for single function )
OR  
`com.orginisation.project.feature.*` (for all the functions available in that file.)

-------------------------------

### Project: Hangman

Build a hangman name  
You have to guess a word letter by letter  
You have 6 guesses  
For every mistake, more of the man is drawn.  
If the whole man is drawn, he is hanged, and game over  
If the word is guessed, the man is spared.  
```
  |--------|-  
  |  |  
  |  O  
  | /|\  
  |  |  
  | / \  
 /|\  
/ | \  

```

Solution: 
Execute the following code from [FirstString.kt](src/FirstString.kt)
```
val hangman = Hangman()
hangman.setupGame()
```


### Project: Tic Tac Toe

Solution:
Execute the following code from [FirstString.kt](src/FirstString.kt)
```
val ticTacToe = TicTacToe()
ticTacToe.inputValue()
```
-------------------------------

### Object Oriented Programming

- Object-oriented programming, or OOPs, is a programming model which breaks down a problem in terms of **classes and objects**. 
- OOPs allows the creation of several instances of a class called objects, hence facilitating code reuse. 
- Some object-oriented programming languages are C++, Java, Javascript,Python, etc.

- The four main pillars or features of object-oriented programming include 
  
  - **Abstraction,** 
  - **Polymorphism,** 
  - **Inheritance,** and 
  - **Encapsulation,** 
  - or you can learn it as `A PIE` to recall all of them easily.

#### Classes

- A class is a blueprint for components(objects). 
- A class has
  - Variables
  - Functions(methods)
  - Constructors 
  - ... and few other features.  

#### Objects

- An object is an instance of a class.  
`val student1 = Student()`  
`val student2 = Student()`
- An object can change its values without impacting other objects from the same class.  
  `student1.name = "Rudolf"`
- An object can call its methods.  
`val studentAge = student1.getAge()`

Code can be found in: [Oops.kt](src/Oops.kt)  

Practice: 

1. Create a class called Animal. It has a variable topSpeed and a function `run()` that prints out a message which states the animal's top speed.  
Create an object from that class, and run the function.  
Update the variable and run the function again.  

```
fun main(args: Array<String>) {
    val cat = Animal();
    cat.name = "Cat"
    cat.topSpeed = 40
    cat.run()

    cat.topSpeed = 45
    cat.run()
}

class Animal {
    var name = ""
    var topSpeed = 0
    fun run() {
        println("$name's top speed is $topSpeed")
    }
}
```












-------------------------------

#### Question to search:

If `val` means immutable, and it cannot be changed, how can we make changes to arrayList
