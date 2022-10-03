package com.oop3

class Dog:Mammal(), Animal, Pet {


    override fun feed() {
        println("Dog walks")
    }

    override fun walk() {
        println("Aw aw")
    }

    override fun makeSound() {
        println("Dog can be groomed")
    }

    override fun groom() {
        println("Dog feeds")
    }

}