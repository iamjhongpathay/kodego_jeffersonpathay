package Exercises

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class BooksTest(){

    //details to borrow a book is empty return false
    @Test
    fun detailsToBorrowABookIsEmptyReturnFalse(){
        var books = Books()
        assertFalse(books.borrowBook(0,"", "", 0,
            "", 0, "")); false
    }

    //details to borrow a book have value return true
    @Test
    fun detailsToBorrowABookHaveValueReturnFalse(){
        var books = Books()
        assertTrue(books.borrowBook(123,"02/10/2022", "02/15/2022", 321,
            "Angel", 456, "Pedro")); true
    }
}
