//Practice Activity 6 - Activity 01_F improvement (Palindrome Problem)
fun main(){
    print("Enter a String: ")
    var inputWord : String = readln()

    palindromeChecker(inputWord) //calling palindromeChecker function

}

fun palindromeChecker(inputWord: String){
    var reverseString : String = ""
    var ctr : Int = inputWord.length-1

    //checking the string by reversed
    while(ctr != -1){
        reverseString += inputWord[ctr--]
    }
    //condition if the inputWord and reverse word(reverseString) is palindrome or NOT
    if(inputWord == reverseString){
        println("The $inputWord is a Palindrome String")
    }else
        println("The $inputWord is NOT a Palindrome String")
}