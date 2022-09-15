fun main (){
    var joe = Person( "Joe", 21) //instantiation
    println("**************")
    println("${joe.name}'s current age is ${joe.age}")
    println("After 1 year . . . ")
    joe.ageUp()
    println("${joe.name}'s current age is ${joe.age}")
}

class Person(var name: String, var age: Int){

    init{
        println("Object Created!")
        println("name is $name")
        println("age is $age")
    }
    fun walk(){
        println("A person walks")
    }
    fun eat(){
        println("A person eat")
    }
    fun displayAge(){
        println(age)
    }
    fun ageUp(){

        age++
    }
}