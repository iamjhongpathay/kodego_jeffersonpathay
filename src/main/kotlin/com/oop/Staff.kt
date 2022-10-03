package com.oop

class Staff : Employee(){
    override fun computeBonus(){
        var total : Double = bonus + salary

        println("Salary is $salary")
        println("Bonus is $bonus")
        println("Total Salary is $total")
    }
}