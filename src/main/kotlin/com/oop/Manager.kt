package com.oop

class Manager : Employee() {
    override fun computeBonus(){
        var totalBonus : Double = 0.0
        totalBonus = bonus + (bonus * 0.10)

        var total : Double = totalBonus + salary

        println("Salary is $salary")
        println("Bonus is $totalBonus")
        println("Total Salary is $total")
    }
}