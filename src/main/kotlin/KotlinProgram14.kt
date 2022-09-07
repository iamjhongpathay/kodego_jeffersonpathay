fun main(){

    var names = arrayOf<String>("John", "Mark", "Paul", "Ringo", "George")
    var ctr : Int = 0
    //change array values
    while(ctr < names.size){
        println("Enter new value for index $ctr")
        names[ctr] = readln()

        ctr++
    }
println("*************")
    //display new array values
    var ctr2 : Int = 0
    while (ctr2 < names.size){
        println(names[ctr2])

        ctr2++
    }
}