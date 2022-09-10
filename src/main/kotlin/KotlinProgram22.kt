    /*built-in/standard functions in Kotlin
    println(), toInt(), readLn(), main(), arrayOf(), listOf()
     */
fun main(){

    //calling the displayName function
    displayName()

    //calling the displayMessage function
    displayMessage(msg = "Hello")

    //calling the displayNameAndAge function with user Input
    print("Enter your name:")
    var name: String = readln()
    print("Enter your age:")
    var age: Int = readln().toInt()

    displayNameAndAge(name, age)
}

    /* user-define function
     */

//no return, no parameters
fun displayName():Unit {
    println("Peter")
}

//no return, 1 parameter
fun displayMessage(msg: String){
    println("The message is \"$msg\"")
}

//no return, 2 parameter
fun displayNameAndAge(name: String, age: Int){
    println("Your name is $name")
    println("Your age is $age")
}