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
| > =      | Greater than or equal to | x >= y  |
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