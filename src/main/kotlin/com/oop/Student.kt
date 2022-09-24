package com.oop

class Student(var _studentId : Int) : Person(){

    var studentId: Int = _studentId

    fun displatStudentId(){
        println(studentId)
    }

    override fun displayName() {
        super.displayName()
        println("display function displayName from student class")
    }
}