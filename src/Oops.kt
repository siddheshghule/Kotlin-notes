package src

fun main(args: Array<String>) {

//                                                             Practice

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


//    Exercise:
//    Create a calculator class. It should have
//    - A variable that stores the total
//    - A function that adds a number to the total
//    - A function that subtracts a number from the total
//    - A function that multiplies the total by an amount
//    - A function that divides the total by an amount
//    - A function that resets the total to 0
//    Create an object, test out the functions and print out some results.

//    val calculator = Calculator()
//    calculator.add(47.0)
//    calculator.multiplies(15.0)
//    calculator.divides(23.0)
//    calculator.subtracts(135.746)
//    calculator.reset()
//    calculator.add(23.0)

//                                                      The "Object as construct"

//    if(DatabaseAccess.connected){
//        DatabaseAccess.disconnect()
//    }
//    else {
//        DatabaseAccess.connect()
//    }
//    println("Database connection status:" +DatabaseAccess.connected)


//                                                                    Inheritance

//    val myDog = Corgi()
//    myDog.size = 10
//    println("Dog's size: " + myDog.size)
//    myDog.bark()
//    myDog.play()


//                                                                    Inheritance: Practice #1
//    A class Laptop has characteristics like screenSize and speed, and a function run that prints out a message which includes its characteristics.
//    A class Apple is a Laptop, so it inherits the laptop characteristics.
//    However it has a smaller screen size.
//    Implement this in a program, call the method run in both Laptop and Apple, and observe the different values.

//    val myLaptop = Laptop()
//    val myAppleLaptop = Apple()
//     myAppleLaptop.screenSize = 13
//    myAppleLaptop.name = "Apple Macbook"
//
//    myLaptop.run()
//    myAppleLaptop.run()

//                                                              Inheritance: Practice #2
//    An Airplane has speed and altitude. It also two methods, ascend which increases altitude, and descend, which decreases altitude.
//    Create two classes that inherit from Airplane, Boeing and Airbus. They have different speeds.
//    Create objects, call methods and print out messages for both child classes.

//    var boeing737 = Boeing()
//    var a320 = Airbus()
//
//    boeing737.name = "Boeing 737"
//    a320.name = "Airbus A320"
//
//    boeing737.ascend()
//    a320.descend()
//    boeing737.ascend()
//    boeing737.descend()
//    a320.descend()
//

//                                                                          Inheritance: Exercise
//                          A class Job has three variables, name, revenue and salary, and two methods, work - which increases revenue
//                          by the amount in salary study - which increases salary
//                          Two classes, Engineer and Doctor inherit from the Job class, but have different values for salary.
//                          Create objects and call the functions a few times, printing out messages to see the result of the functions.

    var engineer = Engineer()
    var doctor = Doctor()
    engineer.name = "Engineer #1"
    doctor.name = "Doctor #1"
    engineer.salary = 15000
    doctor.salary = 25000

    doctor.work()
    engineer.work()
    doctor.study()
    engineer.study()
    doctor.work()
    engineer.work()
    doctor.study()
    engineer.study()
}

open class Job {
    var name = "Generic Name"
    var revenue = 0
    var salary = 1000
    fun work() {
        revenue += salary
        println("$name has revenue: $revenue")
    }
    fun study() {
        salary += 100
        println("$name has salary: $salary")
    }
}

class Doctor : Job() {
    // Inherits everything from Job as nothing is private
}
class Engineer : Job() {
    // Inherits everything from Job as nothing is private
}

//
//open class Airplane {
//    var speed = 1000
//    var altitude = 20000
//    var name = "Generic Airplane"
//    fun ascend() {
//        altitude += 1000
//        println("$name has an altitude of $altitude and speed $speed")
//    }
//
//    fun descend() {
//        altitude -= 1000
//        println("$name has an altitude of $altitude and speed $speed")
//    }
//}
//
//class Boeing : Airplane() {
//  // Inherits everything from Airplane as nothing is private
//}
//
//class Airbus : Airplane() {
//// Inherits everything from Airplane as nothing is private
//}

//open class Laptop {
//    var screenSize = 15
//    var speed = 1200
//    var name = "Generic Laptop"
//    fun run() {
//        println("Running laptop $name with screen size $screenSize and speed $speed")
//    }
//}
//
//class Apple: Laptop() {
//    // Inherits everything from Laptop as nothing is private
//}


//open class Dog {
//    var size = 10
//    fun bark() {
//        println("Bark")
//    }
//
//    fun play() {
//        println("Play")
//    }
//}
//
//class Corgi : Dog() {
//    // Inherits everything from Dog as nothing is private
//}


//
//object DatabaseAccess {
//    var connected = false
//    fun connect() {
//        connected = true
//        println("Connected to Database")
//    }
//
//    fun disconnect() {
//        connected = false
//        println("Disconnected to Database")
//    }
//}

//class Calculator {
//    var total = 0.0;
//    fun add(number: Double) {
//        println("Adding to Total with $number")
//        total += number
//        println("Total=${total}")
//    }
//
//    fun subtracts(number: Double) {
//        println("Subtracting from Total by $number")
//        total -= number
//        println("Total=${total}")
//    }
//
//    fun multiplies(number: Double) {
//        println("Multiplying to Total with $number")
//        total *= number
//        println("Total=${total}")
//    }
//
//    fun divides(number: Double) {
//        println("Dividing from Total by $number")
//        total /= number
//        println("Total=${total}")
//    }
//
//    fun reset() {
//        println("Resetting Total")
//        total = 0.0
//        println("Total=${total}")
//    }
//}

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
