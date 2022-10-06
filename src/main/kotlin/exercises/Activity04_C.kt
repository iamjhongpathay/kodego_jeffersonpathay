package exercises

fun main(){
    /*Activity 04 - C
    Implement add, subtract, divide, multiply, modulo, average, using overloading.
     */

    var arithmeticOperators = ArithmeticOperators()

    arithmeticOperators.computation(10, "5")
    arithmeticOperators.computation(25, 10)
    arithmeticOperators.computation(30.0,3.0)
    arithmeticOperators.computation(50.0, 5)
    arithmeticOperators.computation(10, 15.0)
    arithmeticOperators.computation("25", 30.0)

}

class ArithmeticOperators(){

    init{
        println("Operator Overloading!\n")
    }

    //Add
    fun computation(num1: Int, num2: String): Int{
        var add = num1 + num2.toInt()
        println("Addition: $num1 + $num2 = $add")

        return add
    }
    //Subtract
    fun computation(num1: Int, num2: Int): Int{
        var sub = num1 - num2
        println("Subtraction: $num1 - $num2 = $sub")

        return sub
    }
    //Divide
    fun computation(num1: Double, num2: Double): Double{
        var div = num1 / num2.toDouble()
        println("Division: $num1 / $num2 = $div")

        return  div
    }
    //Multiply
    fun computation(num1: Double, num2: Int): Double {
        var mul = num1 * num2
        println("Multiply: $num1 * $num2 = $mul")

        return  mul
    }
    //Modulo
    fun computation(num1: Int, num2: Double): Int{
        var mod = num1 % num2.toInt()
        println("Modulo: $num1 % $num2 = $mod")

        return mod
    }
    //Average
    fun computation(num1: String, num2: Double): Double{
        var ave = (num1.toInt()+num2)/2
        println("Average: $num1 + $num2 /2 = $ave")

        return ave
    }
}