package exercises
fun main(){
    /*
    Activity 03 - C
    Use Activity 02 - E identify scenarios when borrowing a book and create unit tests for each
     */
    /*
    JUnit Test File =  .\src\test\kotlin\Exercises\BookTest.kt
    */

    var books = Books()


    //Book variables for inputs
    var iISBN: Int = 0
    var iName: String = ""
    var iAuthor: String = ""
    var iPubDate: String = ""
    var iPublisher: String = ""
    var iAvailability: Boolean = true
    var iBorrowedDate: String = ""
    var iReturnDate: String = ""
    var iBorrowerID: Int = 0
    var iBorrowerName: String = ""
    var iLibrarianID: Int = 0
    var iLibrarianName: String = ""

    var mainLoop: Boolean = true
    while(mainLoop){
        try{
            //Main User Interface
            println()
            println("[-------Library Management System-------]")
            println()
            println("[1] List of all Books")
            println("[2] Borrow")
            println("[3] Return")
            println("[0] EXIT")
            print("Choose 1-3 or 0 to proceed: ")
            var userChose : Int = readln().toInt()

            if(userChose == 1){                                                                     //[1] List of all Books
                println()
                println("[-----------List of all Books-----------]\n")
                books.listBooks()   //fun listBooks()
                println("[----------------------------------------]")

                //dDetails to loop the book details
                var bDetailsLoop : Boolean = true
                while (bDetailsLoop){
                    println()
                    println("(!)Enter ISBN to see all details. ")
                    println("(!)To Exit enter Zero(0).")
                    print("Input Here: ")

                    iISBN = readln().toInt()
                    if(iISBN == 0){
                        bDetailsLoop = false
                    }else if(iISBN != books.bISBN[iISBN]){
                        println("(!)No available data! Check the ISBN you entered if its correct.")
                    } else{
                        books.bookDetails(iISBN)    //fun bookDetails()
                    }
                }
            }else if(userChose == 2){                                                                     //[2] Borrow
                println()
                println("[-----------Borrow a Book-----------]\n")
                println("Enter ISBN: ")
                iISBN = readln().toInt()

                if(iISBN == books.bISBN[iISBN]){
                    books.bookDetails(iISBN)    //fun bookDetails()

                    if(books.bAvailability[iISBN] == true){

                        var borrowLoop : Boolean = true
                        while(borrowLoop){

                            println("(?)Are you sure do you want to borrow this book?[Y/N]")
                            var questionToUser : String = readln().lowercase()

                            if(questionToUser == "y"){

                                print("Enter Borrower ID: ")
                                iBorrowerID = readln().toInt()
                                print("Enter Borrower Name: ")
                                iBorrowerName = readln()
                                println("(!)Follow the date format 'dd/mm/year'")
                                print("Enter today's date: ")
                                iBorrowedDate = readln()
                                print("Enter return date: \n")
                                iReturnDate = readln()
                                println("Approved by the Librarian: ")
                                print("Librarian ID: ")
                                iLibrarianID = readln().toInt()
                                print("Librarian Name: ")
                                iLibrarianName = readln()

                                books.borrowBook(iISBN, iBorrowedDate, iReturnDate,
                                    iBorrowerID, iBorrowerName, iLibrarianID, iLibrarianName)  //fun borrowBook()

                                borrowLoop = false

                            }else if(questionToUser == "n"){
                                borrowLoop = false

                            }else{
                                println("(!)Invalid Input! Please choose between [Y/N].")
                            }
                        }
                    }else if(books.bAvailability[iISBN] == false){
                        println("(!)Sorry! This book is not available to borrow.")
                    }
                }else{
                    println("(!)No book found! The ISBN you entered is not in our book list!")
                }

            }else if(userChose == 3) {                                                                     //[3] Return
                println()
                println("[-----------Return a Book-----------]\n")
                println("Enter ISBN: ")
                iISBN = readln().toInt()

                if(iISBN == books.bISBN[iISBN]){
                    books.bookDetails(iISBN)    //fun bookDetails()

                    if(books.bAvailability[iISBN] == false){

                        var returnLoop : Boolean = true
                        while(returnLoop){

                            println("(?)Are you sure do you want to return this book?[Y/N]")
                            var questionToUser : String = readln().lowercase()

                            if(questionToUser == "y"){
                                books.returnBook(iISBN)  //fun borrowBook()
                                returnLoop = false

                            }else if(questionToUser == "n"){
                                returnLoop = false

                            }else{
                                println("(!)Invalid Input! Please choose between [Y/N].")
                            }
                        }
                    }else if(books.bAvailability[iISBN] == true){
                        println("(!)Sorry! This book is available to borrow. \n" +
                                "To borrow this book please proceed to [2] Barrow in main menu.")
                    }
                }else{
                    println("(!)No book found! The ISBN you entered is not in our list!")
                }
            }

        }catch (e: NumberFormatException){
            println("(!)Invalid! Enter a digits only.")
        }
    }
}

class Books{

    var bISBN = mutableMapOf<Int, Int>(123 to 123, 321 to 321)
    var bName = mutableMapOf<Int, String>(123 to "Harry Potter", 321 to "To Kill a Mockingbird")
    var bAuthor = mutableMapOf<Int, String>(123 to "J.k Rowlings", 321 to "Harper Lee")
    var bPubDate = mutableMapOf<Int, String>(123 to "Oct 2, 2000", 321 to "July 11, 1960")
    var bPublisher = mutableMapOf<Int, String>(123 to "Bloomsbury", 321 to "J. B. Lippincott & Co.")
    var bAvailability = mutableMapOf<Int, Boolean>(123 to false, 321 to true)
    var bBorrowedDate = mutableMapOf<Int, String>(123 to "01/10/2022")
    var bReturnDate = mutableMapOf<Int, String>(123 to "06/10/2022")
    var bBorrowerID = mutableMapOf<Int, Int>(123 to 456)
    var bBorrowerName = mutableMapOf<Int, String>(123 to "jhong")
    var bLibrarianID = mutableMapOf<Int, Int>(123 to 654)
    var bLibrarianName = mutableMapOf<Int, String>(123 to "Jeff")

    fun listBooks(){
        for(key in bISBN.keys){
            println("ISBN: $key\n " +
                    "Name: ${bName[key]}\n " +
                    "Author: ${bAuthor[key]}\n " +
                    "Availability: ${bAvailability[key]}\n")
        }
    }

    fun bookDetails(iISBN : Int ){

        if(bAvailability[iISBN] == true){
            println("[-------------Available Data-------------]")
            println("ISBN: ${bISBN[iISBN]}")
            println("Name: ${bName[iISBN]}")
            println("Author: ${bAuthor[iISBN]}")
            println("Published: ${bPubDate[iISBN]}")
            println("Publisher: ${bPublisher[iISBN]}")
            println("Availability: ${bAvailability[iISBN]}")
            println("[----------------------------------------]")
        }else if(bAvailability[iISBN] == false){
            println("[-------------Available Data-------------]")
            println("ISBN: ${bISBN[iISBN]}")
            println("Name: ${bName[iISBN]}")
            println("Author: ${bAuthor[iISBN]}")
            println("Published: ${bPubDate[iISBN]}")
            println("Publisher: ${bPublisher[iISBN]}")
            println("Availability: ${bAvailability[iISBN]}\n")
            println("Approved by: ${bLibrarianName[iISBN]} - ${bLibrarianID[iISBN]}")
            println("Borrowed by: ${bBorrowerName[iISBN]} - ${bBorrowerID[iISBN]}")
            println("Date Borrowed: ${bBorrowedDate[iISBN]} ")
            println("Return Date: ${bReturnDate[iISBN]} ")
            println("[----------------------------------------]")
        }
    }

    fun borrowBook(iSBN: Int, borrowedDate: String,
                   returnDate: String, borrowerID: Int,
                   borrowerName: String, librarianID: Int,
                   librarianName: String): Boolean{

        if((borrowedDate.isEmpty()) || (returnDate.isEmpty()) || (borrowerID < 1)
            || (borrowerName.isEmpty()) || (librarianID < 1) || (librarianName.isEmpty())){
            println("(!)Empty Fields! Borrowed Date and Return Date should NOT EMPTY. Please follow the date format 'dd/mm/year'")
            return false

        }else {
            bBorrowedDate.put(iSBN, borrowedDate)
            bReturnDate.put(iSBN, returnDate)
            bAvailability.put(iSBN, false)
            bBorrowerID.put(iSBN, borrowerID)
            bBorrowerName.put(iSBN, borrowerName)
            bLibrarianID.put(iSBN, librarianID)
            bLibrarianName.put(iSBN, librarianName)

            println("(!)Successful! You borrowed ${bName[iSBN]} by ${bAuthor[iSBN]}.\n" +
                    "You should return the book on or before $returnDate.")
            return true
        }
        return true
    }

    fun returnBook(iSBN: Int){

        bBorrowedDate.remove(iSBN)
        bReturnDate.remove(iSBN)
        bAvailability.replace(iSBN, true)

        println("(!)Successful! You returned ${bName[iSBN]} by ${bAuthor[iSBN]}.")
    }
}
