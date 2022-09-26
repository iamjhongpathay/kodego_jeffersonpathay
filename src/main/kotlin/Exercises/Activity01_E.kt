fun main(){

    /*Create an application that will accept 2 string inputs.
    Your application will print all unique characters in both Strings.
    */

    var sameChars : String = ""

    print("Enter First String: ")
    var firstString : String = readln()
    print("Enter Second String: ")
    var secondString : String = readln()

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
}