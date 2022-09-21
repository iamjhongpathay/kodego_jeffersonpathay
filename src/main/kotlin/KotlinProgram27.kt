fun main (){
    var anne = Person("James")
    anne.age = 25
    anne.displayAge()
}

class Person(var name: String, var age: Int){ //constructor -> primary constructor

    init{
        println("Object Created!")
        println("name is $name")
        println("age is $age")
    }
    //secondary constructor
    constructor(name: String):this(name,0){}
    constructor(age: Int):this("default_name", age){}
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