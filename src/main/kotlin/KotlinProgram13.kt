fun main(){
    //implicit declaration
    //                     0       1       2
//    var names = arrayOf("John", "Paul", "Mark")
//    println(names[1])


    //explicit
    var number = arrayOf<Int>(2, 4, 6, 23, 100)
    println(number[4])

    //array size
    println(number.size)
}