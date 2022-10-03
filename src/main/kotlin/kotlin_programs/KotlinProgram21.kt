/* Class -> objects
objects -> variables
           functions
 */

fun main (){

    //instantiation - process of creating an object
    var myObject = MyClass("Hello Wortld")
    var myObjectInt= MyClassInteger(2151)

    var myGenericObject = MyGenericsClass("Hello generic")
}
//Non-Generics
class MyClass(value: String){
    init{
        println(value)
    }
}
class MyClassInteger(value: Int){
    init{
        println(value.toString().length)
    }
}

//Generics
class MyGenericsClass<T>(value: T){
    init {
        println(value.toString().length)
    }
}

