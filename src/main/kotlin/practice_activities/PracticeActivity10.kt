import ch.qos.logback.core.net.SocketConnector.ExceptionHandler
import java.beans.ExceptionListener

fun main(){
    /*
        Practice Activity 10

        Create a class called SmartPhone

        attribute(use proper data types):
        load
        batteryPercentage
        (you add your own)

        function:
        buyLoad(amount) // does not accept 0 or negative values
        chargeBattery(percent) //does not accept 0 or negative values
        sendText(message) //display message sent
        checkBalance() //display current load, if zero, display "Check operator service!"
        call(minutes) //8 load per minute, will not push tru if no sufficient load
     */

    //Calling class SmartPhone
    var durianProMax = SmartPhone(35, 65)

    var condition : Boolean = true
    while (condition){
        //Main Menu UI
        println("[-----Durian Pro Max Smart Phone-----]")
        println("[1] Buy a Load")
        println("[2] Charge the Battery")
        println("[3] Send a Text Messages")
        println("[4] Check the Load Balance")
        println("[5] Make a Call")
        println("[6] Power Off")
        println()
        print("[#]Choose a number to interact: ")
        var userChoices : Int = readln().toInt()
        if(userChoices == 1){
            try{
                println()
                println("[-----Buy a Load-----]")
                print("[#]Enter the Amount of load you want to buy: ")
                durianProMax.buyLoad(readln().toInt())
            }catch (e: NumberFormatException){
                println("[!]Error: Input Digits Only!")
                println()
            }

        }else if(userChoices == 2){
            try {
                println()
                println("[-----Charge the Battery-----]")
                println("The battery of Durian Pro Max is ${durianProMax.batteryPercentage}%")
                print("[?]How much of battery percent do you want to add? ")
                durianProMax.chargeBattery(readln().toInt())
            }catch (e: NumberFormatException){
                println("[!]Error: Input Digits Only!")
                println()
            }
        }else if(userChoices == 3) {
            try {
                println("[-----Send a Text Messages-----]")
                println()
                print("Contact Number of Recipient: ")
                var recipientNum : Long = readln().toLong()
                print("Text Message: ")
                var message: String = readln()
                durianProMax.sendText(recipientNum, message)
                println()
            } catch (e: NumberFormatException){
                println("[!]Error: Input Digits Only! The contact number of recipient is invalid.")
                println()
            }
        }else if(userChoices == 4){
            println("[-----Check the Load Balance-----]")
            println()
            durianProMax.checkBalance()
        }else if(userChoices == 5){
            try{
                println("[-----Make a Call-----]")
                println()
                print("[#]Contact Number of Recipient: ")
                var recipientNum : Long = readln().toLong()
                print("[?]Do you want to call this number $recipientNum?[Yes/No]: ")
                var userOption : String = readln().lowercase()
                if (userOption == "yes"){
                    print("[?]How long do you want to make a call per minute? ")
                    var minutes : Int = readln().toInt()
                    durianProMax.call(recipientNum, minutes)
                }else if(userOption == "no"){
                    println("[!]Call Cancelled!")
                    println()
                }
            }catch (e: NumberFormatException){
                println("[!]Error: Input Digits Only!")
            }
        }else if(userChoices == 6){
            println()
            println("Thank You! Goodbye!")
            println("")
            condition = false
        }
    }
}

class SmartPhone(var load : Int, var batteryPercentage : Int){

    init{
        println("Initial value of your load is $load Pesos and the batteryPercentage is $batteryPercentage %")
        println()
    }

    fun buyLoad(amount: Int){                                                                       //[1] Buy a Load
            if(amount < 0){
                println("[!]Error: Invalid Amount! The amount should be greater than zero(0).")
                println()
            }else{
                load += amount
                println("[!]Message: Successful! You bought a load in a amount of $amount Pesos.")
                println()
            }
    }

    fun chargeBattery(percent: Int){                                                                 //[2] Charge the Battery
        var batteryTotal : Int = 0
        batteryTotal = percent + batteryPercentage
            if(percent < 0){
                println("[!]Error: The amount of battery percentage should be greater than zero(0).")
                println()
            }else if(batteryTotal > 100){
                println("[!]Error: The battery is OVER CHARGED!")
                println()
            }else{
                batteryPercentage += percent
                println("[!]Message: Successful! The battery is increased by $percent%")
                println()
            }
    }

    fun sendText(recipientNum: Long, message : String){                                              //[3] Send a Text Messages
        if(load == 0){
            println("[!]Error: Your load is INSUFFICIENT! Check Operator Service")
            println()
        }else{

            println("[!]Message Sent Successfully!")
            println()
            println("Sent to: $recipientNum")
            println("Message: $message")
            println("[!]Load Balance: ${--load} Pesos")
        }
    }

    fun checkBalance(){                                                                              //[4] Check the Load Balance
        if (load == 0){
            println("[!]Error: Your load is INSUFFICIENT! Check Operator Service")
            println()
        }
        println("[!]Message Received! Your current load balance is $load Pesos")
        println()
    }

    fun call(recipientNum: Long, minutes: Int){                                                     //[5] Make a Call
        var sumCalls : Int = minutes * 8
        if(sumCalls > load){
            println("[!]Sorry: Your load is INSUFFICIENT! Check Operator Service")
            println()
        }else{
            load -= (minutes * 8)
            println()
            println("[!]You Make a Call Successfully!")
            println("The call is lasted $minutes minutes with $recipientNum.")
            println()
        }
    }

}