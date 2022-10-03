package com.oop

class Student(name: String, age: Int) : Person(name, age){

    var studentID : Int = 0

    fun displayStudentID(){
        println(studentID)
    }


    //overriding - polymorphism
    override fun displayName() {
        super.displayName() //displaying the function from Person class = Implementation
        println("This is from the student class")
    }
}