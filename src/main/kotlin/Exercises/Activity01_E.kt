fun main(){
    /*Create an application that will accept 2 string inputs.
    Your application will print all unique characters in both Strings.
    */


    var sameChars : String = ""

    //user input two different string
    print("Enter 1st String: ")
    var input1 : String = readln()
    print("Enter 2nd String: ")
    var input2 : String = readln()

    //it will find the same characters of input1 with input2
    for(a in 0 until input1.length){
        for(b in 0 until input2.length){
            if (input1[a] == input2[b]){
                sameChars += input1[a]
            }
        }
    }
    //the same characters of input1 and input2 will replaced by a white spaces
    for (c in 0 until  sameChars.length){
        val charToRemove = sameChars[c] + ""
        input1 = input1.replace(charToRemove, "")
        input2 = input2.replace(charToRemove, "")
    }
    //displaying the final result of unique characters
    print("The unique characters are: $input1 $input2")
}