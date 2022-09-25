import com.sun.tools.javac.Main

fun main(){
    /*Activity 03 - B
    Create JUnit test for Activity 01 - D
    */

    var activityOneD = ActivityOneD(0)

    var mainLoop : Boolean = true
    while (mainLoop){
        try{
            print("[#]Enter an Amount: ")
            activityOneD.addAmount(readln().toInt())

            var secondLoop : Boolean = true
            while (secondLoop){
                println("[?]Do you want to add another amount?[Yes/No] ")
                var addAntoher : String = readln().lowercase()
                println()

                if (addAntoher == "no"){
                    print("[#]Divide by how many? ")
                    activityOneD.dividedBy(readln().toInt())

                    mainLoop = false
                    secondLoop = false
                }else if((addAntoher != "no") && (addAntoher != "yes")){
                    println("[!]Invalid! Please choose between Yes or No.")
                }else{
                    secondLoop = false
                }
            }

        }catch(e : NumberFormatException){
            println("[!]Error: Input Digits Only!")
            println()
        }
    }
}

class ActivityOneD(var amount: Int){

    fun addAmount(amount: Int):Int{
        this.amount = this.amount + amount
        return this.amount
    }

    fun dividedBy(dividedBy: Int): Int {

        var quotient: Int = 0
        quotient = this.amount / dividedBy
        println()
        println("The Sum of the amount you entered is: ${this.amount}")
        println("The Total of ${this.amount} is Divided by $dividedBy = $quotient")

        return quotient
    }
}

//JUnit Test = ./src/test/kotlin/Exercises/ActivityOneDTest.kt