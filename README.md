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
- Raw string is declared within triple quote (""" """) and may contain multiple lines of text without any escape characters.  

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
Names can contain letters, numbers and underscores '_'. Cannot use space or kotlin keywords(println, var, val, etc.). Names can start with letters or underscores, I personally prefer letters and use underscores to separate words.
For example, first name can be written as  
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
The `readLine()` command can return nothing(null), then we can use `?:""`, asif the `readLine()` returns null, then empty string will be used `""`.  
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