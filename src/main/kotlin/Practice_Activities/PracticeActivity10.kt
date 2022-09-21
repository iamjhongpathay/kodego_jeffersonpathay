fun main(){

    var phone = SmartPhone(15.00, 35)

    phone.buyLoad(25.00)
    phone.chargeBattery(40)
    phone.checkBalance()
}

class SmartPhone(var spLoad: Double, var spBatteryPercentage : Int){

    //buyLoad
    var load = spLoad
        get() = field
        set(value){
            if(value < 0){
                println("There is no load below 0.00")
            }else{
                field = value
                println("Hi! You have successfully buy a regular load. Your current load is $load Pesos Load.")
            }
        }

    //chargeBattery
    var batteryPercent = spBatteryPercentage
        get() = field
        set(value){
            if(value < 0){
                println("Invalid value! The Battery Percentage should not subceed from 1%")
            }else if (value > 100){
                println("Invalid value! The total percentage of the Battery should not exceed to 100%. Are you Taguro?")
            }else{
                field = value
                println("Battery Charging with $batteryPercent%")
            }
        }

    //instantiation
    init{
        println("Smart Phone Object Created!")
        println("Initial value of load is $spLoad Pesos and batteryPercentage is $spBatteryPercentage%")
        println()
    }

    //functions
    //sum of load
    fun buyLoad(amount: Double){
        this.load = this.load + amount
    }
    //sum of charge battery percentage
    fun chargeBattery(chargingPercent: Int){
        this.batteryPercent = this.batteryPercent + chargingPercent
    }
    //Balance Checking
    fun checkBalance(){
        if(this.load < 1){
            println("0.00 Peso Balance. Check Operator Services")
        }else{
            println("Your current load balance is $load Pesos")
        }
    }

}