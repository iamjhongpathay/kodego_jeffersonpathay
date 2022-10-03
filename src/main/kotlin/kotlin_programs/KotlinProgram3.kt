fun main() {
//    var number1: Double = 21.0
//    var number2: Double = 9.0
//
//    var answer: Double = number1 + number2
//
//    println("The answer is $answer")

    var number1: Int = 21
    var number2: Int = 9

    var answer: Int = number1 % number2

    println("The answer is $answer")

    //complex operations
    var complexFormula: Int = (2*10)+(10/2)
    println(complexFormula)

    //comparison operators
    //< > == <= >= !=
    //var expression: Boolean = number1 <= number2
    //println(expression)

    var expression: Boolean = (number1 <= number2) && (number1 == number2)
    println(expression)

    //increment operator
    var incrementNum : Int = ++number1
    println(incrementNum)
}