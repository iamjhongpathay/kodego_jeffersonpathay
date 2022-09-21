fun main(){

    /*Create an application that will accept 2 string inputs.
    Your application will print all unique characters in both Strings.
    */

    var sameChars : String = ""

    print("Enter First String: ")
    var firstString : String = readln()
    print("Enter Second String")
    var secondString : String = readln()

    //it will find the same characters of input1 with input2
    for(a in 0 until firstString.length){
        for(b in 0 until secondString.length){
            if (firstString[a] == secondString[b]){
                sameChars += firstString[a]
            }
        }
    }
    print(sameChars)
}