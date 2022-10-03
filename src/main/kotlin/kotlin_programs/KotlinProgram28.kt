package kotlin_programs

fun main(){
    var myCar = Car()

    myCar.fuelVolume = -100
    println(myCar.fuelVolume)
}

class Car{
    var modelName: String = ""
        get() = field
        set(value){
            field = value
        }

    var fuelVolume: Int = 0
        get() = field
        set(value){
            if(value < 0){
                println("Invalid value")
            }else{
                field = value
            }
        }

    init{
        println("Object Created!")
        println("modelName is $modelName")
        println("fuelVolume is $fuelVolume")
    }

    fun accelerate(fuelVolume: Int){
        this.fuelVolume = this.fuelVolume - fuelVolume
    }
    fun checkFuel(){
        println("Current fuel volume is $fuelVolume")
    }
}