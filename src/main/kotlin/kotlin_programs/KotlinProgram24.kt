fun main() {

    //println(total(2, 3,5,6))

    println(total2(2, 3, 4, 5, 6))
}


fun total(num1: Int, num2: Int, num3: Int, num4: Int): Int{

    println("This is total function")
    return num1 + num2 + num3 + num4
}

fun total2(vararg numbers: Int):Int{
    var sumOfAllNumber: Int = 0;
    for(num in numbers){
        sumOfAllNumber = sumOfAllNumber + num
    }
    return sumOfAllNumber
}