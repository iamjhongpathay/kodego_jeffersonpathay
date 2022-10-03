import java.lang.NumberFormatException

fun main(){
    print("Enter number 1: ")
    var num1 : Int = readln().toInt()

    print("Enter number 2: ")
    var num2 : Int = readln().toInt()

    print("Enter number 3: ")
    var num3 : Int = readln().toInt()

    var total : Int = num1 + num2 + num3
    try{
        print("Divide by how many? ")
        var divisor : Int = readln().toInt()
        println("The anser is ${total / divisor}")

        var myArray = arrayOf(1, 2, 3, 4)
        println(myArray[5])
    }catch(e: ArithmeticException){
        println(e)
        println("Division by o is not allowed!")
    }catch(e : NumberFormatException){
        println(e)
        println("Input digits only!")
    }catch (e : ArrayIndexOutOfBoundsException){
        println(e)
        println("Invalid Index")
    }finally {
        println("Code is finished!")
    }
}