fun main(){
    /*You are tasked to automate a school’s library. Identify the items that can be borrowed in a Library.
     After listing the different items, identify the characteristics of the items. Use the proper data types.

     */

    println("School Library System")
    println()
    print("Enter Book Number:")
    var bookNumber : String = readln()
    print("Enter Title: ")
    var bookTitle : String = readln()
    print("Enter Author: ")
    var bookAuthor : String = readln()
    print("Enter Edition: ")
    var bookEdition : Int = readln().toInt()
    var availability : Boolean = true


    var bookNumber1 : String = "TG1925"
    var bookTitle1 : String = "The Great Gatsby"
    var bookAuthor1 : String = "F. Scott Fitzgerald"
    var bookEdition1 : Int = 1925
    var availability1 : String = "No"

    var bookNumber2 : String = "L1955"
    var bookTitle2 : String = "Lolita"
    var bookAuthor2 : String = "Vladimir Nabokov"
    var bookEdition2 : Int = 1955
    var availability2 : String = "Yes"



    println()
    println("Successful")
    println()

    println("Book Number: $bookNumber2 ")
    println("Title: $bookTitle2")
    println("Author: $bookAuthor2")
    println("Edition: $bookEdition2")
    println("Available:$availability2")

    println()

    println("Book Number: $bookNumber1 ")
    println("Title: $bookTitle1")
    println("Author: $bookAuthor1")
    println("Edition: $bookEdition1")
    println("Available:$availability1")

    println()

    println("Book Number: $bookNumber ")
    println("Title: $bookTitle")
    println("Author: $bookAuthor")
    println("Edition: $bookEdition")
    println("Available:$availability")
}