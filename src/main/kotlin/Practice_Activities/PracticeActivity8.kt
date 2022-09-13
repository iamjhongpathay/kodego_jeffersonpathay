fun main (){

    println(maxNumber(2 ,8, 10))
}

fun maxNumber(num1: Int, num2: Int, num3: Int):Int{
    var maxValue: Int = 0

    if ((num2 < num1) && (num2 < num3)){
        maxValue = num1
    } else if ((num1 < num3) && (num3 < num2)){
        maxValue = num2
    } else if((num1 < num2) && (num2 < num3)){
        maxValue = num3
    }


    return maxValue

}