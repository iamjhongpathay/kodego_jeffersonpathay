fun main(){
    /*built-in/standard functions in Kotlin

    println()
    toInt()
    readLn()
    main()
    arrayOf()
    listOf()
     */

    println("Enter number 1:")
    var number : Int = readln().toInt()
    println("The cube is ${number * number * number}")


    //calling the displayName function
    displayName()
    //calling the displayMessage function
    displayMessage(msg = "Hello")
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