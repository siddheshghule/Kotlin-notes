package src

fun main(args: Array<String>) {

//                                                  Practice

//    1.
//    Create a class called Animal. It has a variable topSpeed and a function `run()` that prints out a message which states the animal's top speed.
//    Create an object from that class, and run the function.
//    Update the variable and run the function again.

//    val cat = Animal();
//    cat.name = "Cat"
//    cat.topSpeed = 40
//    cat.run()
//
//    cat.topSpeed = 45
//    cat.run()

//    2.  Create a class Math. It has 4 functions(Add, Sub, Mul, Div),
//    each consuming 2 parameters and returning corresponding values.
//    Create an object and try out these functions.

//    val math = Math();
//    val addition = math.add(1, 2);
//    val subtraction = math.sub(1, 2);
//    val division = math.div(1, 2);
//    val multiplication = math.mul(1, 2);
//
//    println("Addition is: $addition");
//    println("Subtraction is: $subtraction");
//    println("Division is: $division");
//    println("Multiplication is: $multiplication");

//    3. A Jetpack can make a user fly. It achieves this with 2 operations:
//    - _burn_(number of seconds) - which elevates the user.
//    - _stop_(number of seconds) - which descends the user.
//    Assume burn will elevate the user by 1 meter per second.
//    Assume stop will descend the user by 3 meter per second.
//    Create a class jetpack that stores a variable userHeight, and 2 functions, _burn_ and _stop_, that alter the height.
//    Create an object, call its methods and printout some results.
//    Enforce that the user cannot go below 0 in height.

//    val jetpack = Jetpack();
//    jetpack.burn(10)
//    println("jetpack height: ${jetpack.userHeight}")
//    jetpack.stop(2)
//    println("jetpack height: ${jetpack.userHeight}")
//    jetpack.burn(30)
//    println("jetpack height: ${jetpack.userHeight}")
//    jetpack.stop(5)
//    println("jetpack height: ${jetpack.userHeight}")


}

//class Jetpack {
//    var userHeight = 0
//
//    fun burn(seconds: Int) {
//        println("burning for $seconds seconds")
//        userHeight += seconds
//    }
//
//    fun stop(seconds: Int) {
//        userHeight -= (3 * seconds);
//        println("stopping for $seconds seconds")
//        if (userHeight < 0) {
//            println("height less than 0, so userHeight = 0")
//            userHeight = 0
//        }
//    }
//
//}

//class Animal {
//    var name = ""
//    var topSpeed = 0
//    fun run() {
//        println("$name's top speed is $topSpeed")
//    }
//}

//class Math {
//    fun add(num1: Int, num2: Int): Int = (num1 + num2)
//    fun sub(num1: Int, num2: Int): Int = (num1 - num2)
//    fun div(num1: Int, num2: Int): Int = (num1 / num2)
//    fun mul(num1: Int, num2: Int): Int = (num1 * num2)
//}
