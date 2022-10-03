fun main () {

}

//Empty Class / PlaceHolder
class Empty{}

//Outer Class
class Outer{
    val name = "Outer"
    fun show() = "the name: $name"

    //Nested Class = CAN'T access the Outer class
    class Nested {
        val name = "Nested"
        fun show() = "the name: $name"
    }
}

class Outer2(){
    val name1 = "Outer2"
    fun show() = "the name: $name1"

    //Inner Class = CAN access the Outer2 Class
    inner class Inner{
        val name2 = "Inner"
        fun show() = ("data: $name2 and $name1")
    }
}

//sealed class
//open class
//abstract class
//data class





//fun main(){
//
//    var john = Person2()
//    var joe = Person2()
//    println("John's Memory address is $john")
//    println("John's Memory address is $joe")
//    println()
//
//    println(john == joe)
//    println()
//
//    john.name = "Ludwig"
//    println(john.name)
//    println()
//
//    println(joe.name)
//}
//
//class Person2 {
//
//    var name : String = "Default Name"
//    init {
//        println("Hello $name")
//    }
//    fun walk(){
//        println("Walking. . . ")
//    }
//}