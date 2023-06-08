# kotlin-notes

Self-notes for kotlin from Complete Kotlin development masterclass 2023 by Catalin Stefan.

### Table of  content

1. [String and Variables](#stringAndVariables)
    1. [String](#string)
    2. [Variable](#variable)
    3. [User Input](#userInput)

<a href="string"></a>

### <a href="#string">String</a>

String is surrounded by double-quotes or triple-quotes.  
There are 2 types of string: **Escaped String** and **Raw String**

- Escaped string is declared within double quote (" ") and may contain escape characters like '\n'.
- Raw string is declared within triple quote (""" """) and may contain multiple lines of text without any escape
  characters.

```
fun main(args: Array<String>) { 
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
```

Output:

```
(\(\
(-.-)
O_(")(")
```

#### Chars

A char is a single character, surrounded by single quotes.  
Example: 'A', 'a, ''.  
A string is composed of character (String of chars)

<a href="variables"></a>

### <a href="#variables">Variables</a>

A variable is a container of data.  
Examples:

```
var dogs = 3
var name = "Tommy"
```

Variables (var) can be changed/updated.  
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

Variables can be changeable(mutable) and constants/read-only(immutable).  
mutable: var (can be changed)
immutable: val (can be read-only)
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

**Naming convention** - camelCase - firstName.

String Examples:

```
val catName = "Fluffy"
println("My cat's name is \"$catName\"")

var slashes = "Two types of slashesh \\ and /"
println(slashes)

var url = "https://www.google.com"
println(url)
```

Output:

```
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
```  

Output:

```  
Random.nextDouble(): 0.3519018166295108
Random.nextInt(): -1941111987
Random.nextInt(1, 9): 8
Random.nextInt(10): 6 
```  

<a href="userInput"></a>

### <a href="#userInput">User Input</a>

User input can come from many sources, and one way is from command line.  
We can use readLine().  
Example:

``` 
println("Enter user input")
val userInput = readLine() // read only one line
println("Your input string is: $userInput")
```   

Output:

``` 
Enter user input
hello
Your input string is hello
```  

Input a number as a String and convert to integer.  
The `readLine()` command can return nothing(null), then we can use `?:""`, asif the `readLine()` returns null, then
empty string will be used `""`.

```  
println("Enter user input")
val userInput = readLine()?:"" // if empty then use "" (empty string)
println("Your input times 5 is: ${userInput.toInt()*5}")  
```  

Output:

```  
Enter user input
5
Your input times 5 is: 25
```  

Example: Welcome

```
println("What is your name?")
val name =  readLine()
println("Welcome, $name")
```

Output:

```
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
```

Output:

```
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
```

Output:

```
Enter your birth year: 1996
Estimated age of the user is: 26 or 27
```

<a href="numbersAndVariableTypes"></a>

### <a href="#numbersAndVariableTypes">Numbers And Variable Types</a>

Different types are stored in memory in different ways.  
Number types have limits.

| type  | size | min value                    | max value                    |
|-------|------|------------------------------|------------------------------|
| byte  | 8    | -128                         | 127                          |
| short | 16   | -32768                       | 32767                        |
| int   | 32   | -2147483648 (-2^31)          | 2147483647    (2^31-1)       |
| long  | 64   | -9223372036854775808 (-2^64) | 9223372036854775807 (2^64-1) |

-> Know the type of variable.

```
var pi = 3.141592
println("Type of pi: ${pi::class.java}")

var name = "Tommy"
println("Type of name: ${name::class.java}")

var population = 75000000000
println("Type of population: ${population::class.java}")
```

Output:

```
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
```

Output:

```
Enter a Number: 44
The output variable (1319.56) type is: double
```

#### Implicit vs Explicit variable types

Implicit variable types are decided by Kotlin.  
Example: `val cat = 3 // Int`

Explicit variable types are decided by us. We can instruct kotlin to assign a different type to our variable.  
Example: `val cat:Byte = 5`  
`val floatVal: Float = 29.99F` Or `val floatValue = 29.99F`  
`val longVal: Float = 29` Or `val longVal = 29L`

<a href="operatorsAndBooleans"></a>

### <a href="#operatorsAndBooleans">Operators And Booleans</a>

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
| >=       | Greater than or equal to | x >= y  |
| <=       | Less than or equal to    | x <= y  |

##### Logical Operators

| Operator     | Name        | Description                                             | Example                  |
|--------------|-------------|---------------------------------------------------------|--------------------------|
| &&           | Logical and | Returns true if both statements are true                | x < 5 && x < 10          |
| &#124;&#124; | Logical or  | Returns true if one of the statements is true           | x < 5 &#124;&#124; x < 4 |
| !            | Logical not | Reverse the result, returns false if the result is true |

Remainder: See all the section objectives to create a table of content 

Exercise:

```
var a =76.254
var b = 3.867
println("Addition of $a and $b: ${a+b}")
println("Subtraction of $a and $b: ${a-b}")
println("Multiplication of $a and $b: ${a*b}")
println("Division of $a and $b: ${a/b}")
println("Remainder of $a and $b: ${a%b}")
```
Output:
```
Addition of 76.254 and 3.867: 80.12100000000001
Subtraction of 76.254 and 3.867: 72.387
Multiplication of 76.254 and 3.867: 294.87421800000004
Division of 76.254 and 3.867: 19.719162141194726
Remainder of 76.254 and 3.867: 2.781000000000005
```
Exercise: Read from the console the amount the user has in their bank account. The interest on that account is 5.5% per year. How much would that user have in 5 years?

```
print("Please enter your current bank balance: ")
var principal = readLine()?:"1"
print("Please enter rate of interest per annum: ")
val rateOfInterest = readLine()?:""
print("Please enter number of years: ")
val years = readLine()?:"0"

var balanceWithInterest = principal.toDouble() * ((1 + (rateOfInterest.toDouble()/100/1)).pow(years.toDouble()))  // P(1+(r/n)^years)
println("Your bank balance with interest of $rateOfInterest per year for the period of $years years is: $balanceWithInterest")
```

Output:
```
Please enter your current bank balance: 1000
Please enter rate of interest per annum: 5.5
Please enter number of years: 5
Your bank balance with interest of 5.5 per year for the period of 5 years is: 1306.9600064093747
```

#### Booleans:  
 It can only have True/False value.  
 Is very memory efficient, enables Logical Operators, enables program Flow Control.  

Exercise: A farmer has 3 cows, of which only one produces milk. He has two children. He is trying to apply for funding. The requirements are  
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
```
Output:
```
Farmer gets funding
```

### <a href="#nullability">Nullability</a>

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

- Null operator - Elvis Operator(?:)  
  Guarantees a result returned  
  Either the actual result for a nun-null variable, or a default value
  ```
    var catName: String? = null
    println(catName?:"This cat has no name")
    catName = "Fluffy"
    println(catName?:"This cat has no name")
  ```
  Output:
    ```  
    This cat has no name
    Fluffy
     ```
  
- Non-null assertions
  !!. -> A developer guarantee that the variable is not null.  
  **Warning:** : This bypasses all the language checks for the null-safety. Can trigger a program to crash.  

  ```
  val catName: String? = null
  println(catName!!.length)
  // If the value is null then the program will crash.
  ```

Practice: Elvis and assertions
Print input message or default message  
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

// Exercise: A product costs 29.99. Ask a user at the console how many products they want to buy. If the read value is null, use the default of one. Print the total of the purchase.
 ```
    val cost = 29.99
    val items: Int? = readLine()?.toIntOrNull()?:1 // When value is null, items= 1
    println("The cost of $items items is: ${items?.times(cost)}")

// The cost of 4 items is: 119.96
// The cost of 1 items is: 29.99
 ```

### <a href="#handlingExceptions">Handling Exceptions</a>


#### 1. What is an Exception?
An unexpected event in a program. A System cannot recover from an exception, we need to mitigate it ourselves. 
Execution is stopped and data is lost.  
Exceptions always have a message, by default, and it is good practice having a message when creating custom Exception.

#### 2. try-catch
A way to manage exception.
```
    print("Enter input:")
    var test = readLine()
    try {
        println(test?.toInt())
    } catch (e: Exception) {
        println("An exception has occurred ${e.localizedMessage}")
    }
    
    // Enter input:test
       An exception has occurred For input string: "test"
```

#### 3. finally
A 'finally' block will be executed whether or not an exception occurs. 
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
    
    // Output
    Enter a number:4
    4
    Finally block, the input was 4

```
#### 4. throw
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
    // Output:
    Enter an Integer: 
    Input was not an integer, input  was class java.lang.String
    Finish.
```

### <a href="#collections">Collections</a>

A way to group of elements together.  
Zero or more elements.  
Same type of elements.  
Eg. [1,2,3,4,555,6,4], ["Dogs", "Cats", "Cow"]  

<img src="https://kotlinlang.org/docs/images/collections-diagram.png" alt="isolated" width="500"/>

Note: Mutable means, they can be changed.  

#### List
Ordered collection.  
Elements can be accessed by the position(index[0,1,2,3....n])  
Can contain duplicate elements. 

#### Set
Is a group of UNIQUE elements.  
The order has no significance  
We can go through the elements one by one(iterate over them), but the order is not defined  

#### Map

A set of key-value pair.  (keys are sets, as the keys are always unique)  
Keys are unique(set)  
Each key maps to exactly one value  
Values can have duplicates.  
Eg. {1=one,2-two,5=five} OR a Dictionary

#### Iterator

An iterator is an object that loops through elements of a collection.  
They are used when applying a same operation to all the elements.  

### List and ArrayList




