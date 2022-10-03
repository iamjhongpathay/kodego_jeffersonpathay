fun main() {

//    for(number in 1 .. 5){
//        println(number)
//    }

//    for(letter in 'B' .. 'P'){
//        println(letter)
//    }

    var num1 : Int = 0
    for(number in 1 .. 5){
        print("Enter a number:")
        var inputNumber : Int = readln().toInt()
        num1 = num1 + inputNumber
    }
    println(num1)
}