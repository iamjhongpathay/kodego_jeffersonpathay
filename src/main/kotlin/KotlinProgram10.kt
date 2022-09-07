fun main(){

//    var ctr1 : Int = 1
//    while(ctr1 <= 5){
//     var ctr2 : Int = 1
//        while(ctr2 <=5){
//            print("@")
//            ctr2++
//        }
//        println()
//        ctr1++
//    }
   // //output
    //@@@@@
    //@@@@@
    //@@@@@
    //@@@@@
    //@@@@@

//    var condition : Boolean = true
//
//    while (condition){
//
//        if (){
//            condition = false
//        }
//    }

    var num1 : Int = 0
    var condition : Boolean = true


    while(condition){
        print("Enter a number:")
        var inputNumber : Int = readln().toInt()
        num1 = num1 + inputNumber


        println("Do you want to continue?[Yes/No]")
        var question : String = readln().toString()
        if (question == "No"){
            println(num1)
            condition = false
        }
    }

}

