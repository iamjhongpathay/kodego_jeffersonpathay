package com.oop
//Abstraction //encapsulation
open class Person(name: String, age: Int) {
   var name : String = name
   var age : Int = age
   init{
       println("Object Created!")
       println("Name is $name, age is $age")
   }

    //polymorphism
    //1) overriding - same name, same parameters,
    //different implementation, one is in the superclass,
    //one is in the subclass
    open fun displayName(){
        println("name is $name")
    }

    //2) overloading - same name, different parameters, same class
    fun displayName(name: String){
        println("Name is $name")
    }

    fun displayName(numberofTimes : Int){
        var ctr = numberofTimes - 1
        while(ctr >=0){
            println("Name is $name")
            ctr--
        }
    }

}