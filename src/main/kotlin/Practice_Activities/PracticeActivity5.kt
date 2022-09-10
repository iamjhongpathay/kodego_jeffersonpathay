import java.util.*

fun main(){

    //Enter 5 digits, store in array, display in correct sequence, display in reverse

    var numbers = arrayOf<Int>(1, 2, 3, 4, 5)
    var ctr : Int = 0
    while (ctr < numbers.size) {
        print("Enter Number ${ctr+1}: ")
        numbers[ctr] = readln().toInt()

        ctr++
    }
    var ctr2 : Int = 0
    while (ctr2 < numbers.size){
        print(numbers[ctr2])    //displaying all input number

        ctr2++
    }
    println()
    println(numbers.reversed()) //displaying all input number in REVERSED


}