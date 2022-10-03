fun main(){

    /*
    Practice Activity 1
    Create a Kotlin program that will accept your first name, middle initial/name,
    and last name then display them together in a single on the screen

    Sample Output
    Enter Your FirstName: John
    Enter Your Middle Name/Initial: C.
    Enter Your Last Name: Smith
    Your Name is John C. Smith
     */

    print("Enter your First name: ")
    var firstname: String = readln()
    print("Enter you Middle initial: ")
    var middleInitial: String = readln()
    print("Enter you Last Name: ")
    var lastName: String = readln()

    println()
    println("Your name is $firstname " + "$middleInitial " + "$lastName")

}