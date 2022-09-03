fun main() {
    var string1 : String = "this is my String"
    var string2 : String = "this is my String too!"
    var string3 : String = "this is my String number three!"

    //string character
    println(string1[11])
    //string length
    println(string1.length)
    println(string2.length)
    //String equality
    println(string1 == string3)
    //string uppercase/lowecase
    println(string1.uppercase())
    println(string2.lowercase())
    //starts with
    println(string2.startsWith(prefix = "that"))
    //ends with
    println(string2.endsWith(suffix = "too!"))
    //concatenate
    println(string1+" "+string2)
    //substring
    println(string1.substring(4, 8))
    //replace
    println(string1.replace(oldValue = "this", newValue = "that"))

}