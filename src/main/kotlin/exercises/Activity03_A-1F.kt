fun main(){

    /*Activity 03 - A
    Add try-catch to Activity 01 - F
     */

    var inputWord : String = ""

    println("[----------------------------Welcome---------------------------]")
    println("[--------------------Palindrome Checker--------------------]")
    println()

    var mainLoop : Boolean = true
    while(mainLoop){
        try{
            print("Enter a Word: ")
            inputWord = readln()

            if(inputWord == ""){
                println()
                mainLoop = true
                println("[!]Error: Enter a Word!")
            }else{

                if(inputWord.checkIntOrString() == "true"){
                    mainLoop = false

                    var reverseString : String = ""
                    var ctr : Int = inputWord.length - 1

                    //checking the string by reversed
                    while(ctr != -1){
                        reverseString += inputWord[ctr--]
                    }
                    //condition to know the inputWord and reverseString are equal to Palindrome or NOT
                    if(inputWord.uppercase() == reverseString.uppercase()){
                        println("The $inputWord is a Palindrome Word")
                    }else
                        println("The $inputWord is NOT a Palindrome Word")

                } else{
                    println()
                    mainLoop = true
                    println("[!]Error: Enter a Word!")
                }
            }
        }catch(e : Exception){
            println(e)
        }
    }
}

fun String.checkIntOrString() : Any{
    var v = toIntOrNull()
    return when(v){
        null -> "true"
        else -> (v)
    }
}