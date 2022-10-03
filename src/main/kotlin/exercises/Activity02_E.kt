
fun main(){

    /*Activity 02 - E
    Implement Activity 02 - B using Classes.
     */

    //Calling Class BookData()
    var bookData = BookData()

    //user interface of School Library System
    var condition : Boolean = true
    while (condition){
        println()
        println("[School Library System]")
        println()
        bookData.displayBooks()
        println("[----------------------------------]")
        println()

        println("Enter [1] To Borrow")
        println("Enter [2] To Return")
        println("Enter [3] To Exit")
        print("Enter a Number from the available choices: ")
        var chooseNum : Int = readln().toInt()

        //user chose [1] to BORROW a book
        if(chooseNum == 1){
            println()
            println("[-----------Borrow a Book-----------]")
            println()
            bookData.borrowBooks()

            //user chose [2] to RETURN a book
        }else if(chooseNum == 2){
            println()
            println("[-----------Return a Book-----------]")
            println()
            bookData.returnBooks()

        }else if( chooseNum == 3){
            condition = false
        }
    }


}

class BookData(){

    var book1 = arrayOf<Any>("TG1925", "The Great Gatsby", "F. Scott Fitzgerald", 1925, true)
    var book2 = arrayOf<Any>("L1955", "Lolita", "Vladimir Nabokov", 1955, false)
    var book3 = arrayOf<Any>("NEF1949", "Nineteen Eighty-Four", "George Orwell", 1949, false)
    var book4 = arrayOf<Any>("AK1878", "Anna Karenina", "Leo Tolsto", 1878, false)

    fun displayBooks(){
        println("Book Code: ${book1[0]}")
        println("Title: ${book1[1]}")
        println("Author: ${book1[2]}")
        println("Edition: ${book1[3]}")
        println("Availability: ${book1[4]}")
        println()
        println("***********************")
        println()
        println("Book Code: ${book2[0]}")
        println("Title: ${book2[1]}")
        println("Author: ${book2[2]}")
        println("Edition: ${book2[3]}")
        println("Availability: ${book2[4]}")
        println()
        println("***********************")
        println()
        println("Book Code: ${book3[0]}")
        println("Title: ${book3[1]}")
        println("Author: ${book3[2]}")
        println("Edition: ${book3[3]}")
        println("Availability: ${book3[4]}")
        println()
        println("***********************")
        println()
        println("Book Code: ${book4[0]}")
        println("Title: ${book4[1]}")
        println("Author: ${book4[2]}")
        println("Edition: ${book4[3]}")
        println("Availability: ${book4[4]}")
        println()
    }

    fun borrowBooks(){
        print("Do you want to borrow a book?[Yes/No]: ")
        var condition : String = readln()

        if(condition == "Yes"){
            print("Enter the CODE of the book: ")   //determine if the book is existing by using bookCode to BORROW
            var bookCode : String = readln()

            //book1
            if(bookCode == book1[0]){

                println("Title: ${book1[1]}")
                println("Author: ${book1[2]}")
                println("Edition: ${book1[3]}")
                println("Availability: ${book1[4]}")

                //index 4 of book1 is equal to TRUE "Available to borrow"
                if(book1[4] == true){
                    println()
                    print("Do you want to borrow this book?[Yes/No]: ")
                    var borrowThis1 : String = readln()

                    if(borrowThis1 == "Yes"){
                        book1.set(4, false) //the 4th index of the book1 will change into FAlSE

                        println()
                        println("[-----------You borrowed the book successfully! Thank you!-----------]")
                        println()

                        displayBooks()
                    }
                    //book1 is not available
                }else if(book1[4] == false){
                    println("[-----------Sorry this book is not available!-----------]")
                }
                //book2
            }else if(bookCode == book2[0]){

                println("Title: ${book2[1]}")
                println("Author: ${book2[2]}")
                println("Edition: ${book2[3]}")
                println("Availability: ${book2[4]}")

                //index 4 of book2 is equal to TRUE "Available to borrow"
                if(book2[4] == true){
                    println()
                    print("Do you want to borrow this book?[Yes/No]: ")
                    var borrowThis2 : String = readln()

                    if(borrowThis2 == "Yes"){
                        book2.set(4, false) //the 4th index of the book2 will change into FAlSE

                        println()
                        println("[-----------You borrowed the book successfully! Thank you!-----------]")
                        println()
                        displayBooks()
                    }
                    //book2 is not available
                }else if(book2[4] == false){
                    println("[-----------Sorry this book is not available!-----------]")
                }
                //No existing book
            }else if(bookCode == book3[0]){
                println("Title: ${book3[1]}")
                println("Author: ${book3[2]}")
                println("Edition: ${book3[3]}")
                println("Availability: ${book3[4]}")

                //index 4 of book3 is equal to TRUE "Available to borrow"
                if(book3[4] == true){
                    println()
                    print("Do you want to borrow this book?[Yes/No]: ")
                    var borrowThis2 : String = readln()

                    if(borrowThis2 == "Yes"){
                        book3.set(4, false) //the 4th index of the book2 will change into FAlSE

                        println()
                        println("[-----------You borrowed the book successfully! Thank you!-----------]")
                        println()
                        displayBooks()

                    }
                    //book3 is not available
                }else if(book3[4] == false){
                    println("[-----------Sorry this book is not available!-----------]")
                }

            }else if(bookCode == book4[0]){
                println("Title: ${book4[1]}")
                println("Author: ${book4[2]}")
                println("Edition: ${book4[3]}")
                println("Availability: ${book4[4]}")

                //index 4 of book4 is equal to TRUE "Available to borrow"
                if(book4[4] == true){
                    println()
                    print("Do you want to borrow this book?[Yes/No]: ")
                    var borrowThis2 : String = readln()

                    if(borrowThis2 == "Yes"){
                        book4.set(4, false) //the 4th index of the book2 will change into FAlSE

                        println()
                        println("[-----------You borrowed the book successfully! Thank you!-----------]")
                        println()
                        displayBooks()
                    }
                    //book4 is not available
                }else if(book4[4] == false){
                    println("[-----------Sorry this book is not available!-----------]")
                }

            }else if((bookCode != book1[0]) && (bookCode != book2[0])){
                println("No book found!")
            }
        }
    }

    fun returnBooks(){
        print("Do you want to return a book?[Yes/No]: ")
        var condition: String = readln()
        if (condition == "Yes") {
            print("Enter the CODE of the book: ")   //determine if the book is existing by using bookCode to RETURN
            var bookCode: String = readln()

            //book1
            if (bookCode == book1[0]) {
                println("Title: ${book1[1]}")
                println("Author: ${book1[2]}")
                println("Edition: ${book1[3]}")
                println("Availability: ${book1[4]}")

                //if index 4 of book1 is equal to FALSE
                if (book1[4] == false) {
                    println()
                    print("Do you want to return this book?[Yes/No]: ")
                    var borrowThis1: String = readln()

                    if (borrowThis1 == "Yes") {
                        book1.set(4, true)  //the 4th index of the book1 will turn into TRUE

                        println()
                        println("[-----------You returned the book successfully! Thank you!-----------]")
                        println()
                        displayBooks()
                    }

                } else if (book1[4] == true) {
                    println("[-----------This book is already returned!-----------]")
                }
                //book2
            } else if (bookCode == book2[0]) {
                println("Title: ${book2[1]}")
                println("Author: ${book2[2]}")
                println("Edition: ${book2[3]}")
                println("Availability: ${book2[4]}")

                //if index 4 of book2 is equal to FALSE
                if (book2[4] == false) {
                    println()
                    print("Do you want to return this book?[Yes/No]: ")
                    var borrowThis2: String = readln()

                    if (borrowThis2 == "Yes") {
                        book2.set(4, true)  //the 4th index of the book2 will change into TRUE

                        println()
                        println("[-----------You returned the book successfully! Thank you!-----------]")
                        println()
                        displayBooks()
                    }
                    //book2 is already returned
                } else if (book1[4] == true) {
                    println("[-----------This book is already returned!-----------]")
                }
                //No existing book
            }else if(bookCode == book3[0]){
                println("Title: ${book3[1]}")
                println("Author: ${book3[2]}")
                println("Edition: ${book3[3]}")
                println("Availability: ${book3[4]}")

                //if index 4 of book2 is equal to FALSE
                if (book3[4] == false) {
                    println()
                    print("Do you want to return this book?[Yes/No]: ")
                    var borrowThis2: String = readln()

                    if (borrowThis2 == "Yes") {
                        book3.set(4, true)  //the 4th index of the book2 will change into TRUE

                        println()
                        println("[-----------You returned the book successfully! Thank you!-----------]")
                        println()
                        displayBooks()
                    }
                    //book3 is already returned
                } else if (book3[4] == true) {
                    println("[-----------This book is already returned!-----------]")
                }
            }else if(bookCode == book4[0]){
                println("Title: ${book4[1]}")
                println("Author: ${book4[2]}")
                println("Edition: ${book4[3]}")
                println("Availability: ${book4[4]}")

                //if index 4 of book2 is equal to FALSE
                if (book4[4] == false) {
                    println()
                    print("Do you want to return this book?[Yes/No]: ")
                    var borrowThis2: String = readln()

                    if (borrowThis2 == "Yes") {
                        book4.set(4, true)  //the 4th index of the book2 will change into TRUE

                        println()
                        println("[-----------You returned the book successfully! Thank you!-----------]")
                        println()
                        displayBooks()
                    }
                    //book4 is already returned
                } else if (book4[4] == true) {
                    println("[-----------This book is already returned!-----------]")
                }
            } else {
                println("No book found!")
            }
        }
    }
}