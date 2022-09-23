fun main(){
    var numComparator = NumberComparator()
    println(numComparator.getMaxNumber(10, 15, 6))
//    println("Enter Number1: ")
//    var enterNum1 = numComparator.getMaxNumber(readln().toInt(),  0, 0)
//    println("Enter Number2: ")
//    var enterNum2 = numComparator.getMaxNumber(0,  readln().toInt(), 0)
//    println("Enter Number3: ")
//    var enterNum3 = numComparator.getMaxNumber(0,  0, readln().toInt())
//
//    println(numComparator.getMaxNumber(enterNum1, enterNum2, enterNum3))
}

class NumberComparator(){
    fun getMaxNumber(num1: Int, num2: Int, num3: Int ): Int{
        var maxValue : Int

        if((num1 >= num2) && (num1 >= num3)){
            maxValue = num1
        }else if((num2 >= num1) && (num2 >= num3)){
            maxValue = num2
        }else if((num3 >= num1) && (num3 >= num2)){
            maxValue =num3
        }else{
            maxValue = 0
        }
        return maxValue
    }
}