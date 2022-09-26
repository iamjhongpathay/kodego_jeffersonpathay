fun main(){

    /*Activity 03 - A
    Add try-catch to Activity 01 - E
    */

    var sameChars : String = ""
    var firstString : String = ""
    var secondString : String = ""

    var mainLoop : Boolean = true
    while(mainLoop){
        try{
            println()
            print("Enter First String: ")
            firstString = readln()
            print("Enter Second String: ")
            secondString = readln()

            if((firstString.checkIfString() == "true") && (secondString.checkIfString() == "true")){
                mainLoop = false

                //finding the same characters of firstString with secondString
                for(a in 0 until firstString.length){
                    for(b in 0 until secondString.length){
                        if (firstString[a] == secondString[b]){
                            sameChars  += firstString[a]
                        }
                    }
                }

                for (ctr in 0 until sameChars.length) {
                    var replace = sameChars[ctr] + ""

                    //the characters that same between firstString and secondString are replaced to empty character
                    firstString = firstString.replace(replace, "")
                    secondString = secondString.replace(replace, "")
                }

                println("The unique characters between 1st String and 2nd String are: $firstString$secondString")
            }else {
                mainLoop = true
                println("[!]Error: Enter a String!")
            }
        }catch(e : Exception){
            println(e)
        }
    }
}

//Checker if the user input an integer in firstString and secondString
fun String.intOrString() : Any{
    var v = toIntOrNull()
    return when(v){
        null -> this
        else -> (v)
    }
}