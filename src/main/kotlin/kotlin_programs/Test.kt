
fun main(){

    var id = mutableMapOf<Int, Int>(123 to 123, 321 to 321)
    var password = mutableMapOf<Int, String>(123 to "pass1", 321 to "pass2")

    println("Enter id: ")
    var enterID: Int = readln().toInt()
    println("Enter password")
    var enterPassword : String = readln()

    for(key in id.keys){
        if((enterID == key) == (enterPassword == password[key])){
            println("logged in")
        }else if((enterID == key) != (enterPassword == password[key])){
            println("Id and password didn't match")
        }else if(enterID != key){
            println("No id found on database")
        }
    }
}