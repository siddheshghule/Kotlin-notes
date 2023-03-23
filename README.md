# kotlin-notes
 Notes for kotlin

## String and Variables 

### String 

String is surrounded by double-quotes or triple-quotes.  
There are 2 types of string: **Escaped String** and **Raw String**
- Escaped string is declared within double quote (" ") and may contain escape characters like '\n'.
- Raw string is declared within triple quote (""" """) and may contain multiple lines of text without any escape characters.

```
fun main(args: Array<String>) { 
println("Hello")
println("String with escape character backslash \\, and quotes \".")
}
```