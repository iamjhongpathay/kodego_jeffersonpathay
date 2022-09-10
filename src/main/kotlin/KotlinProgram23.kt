fun main(){

    //calling the cube function
    var result : Int = cube(2)
    println(result)

    //calling the add function
    println(add(5, 2))
}

//with return, 1 parameter
fun cube(number: Int):Int{
    return number * number * number
}

//with return, 2 parameter
fun add(number1: Int, number2: Int):Int{

    return number1 + number2
}