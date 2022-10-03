fun main(){
    //implicit declaration
    //                     0       1       2
    var names = arrayOf("John", "Paul", "Mark")
    println(names[1])

    println(names[0])
    println(names[1])
    println(names[2])
    println("********************")
    names.set(1, "Matthew")
    println(names[0])
    println(names[1])
    println(names[2])

    println("********************")
    //explicit
    var number = arrayOf<Int>(2, 4, 6, 23, 100)
    println(number[4])

    //array size
    println(number.size)

}