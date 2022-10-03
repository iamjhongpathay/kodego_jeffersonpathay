fun main (){
    var names = ArrayList<String>()
    names.add("John") //index 0
    names.add("Peter") //index 1
    //add elements
    println(names[0])
    println(names[1])
    //remove elements
    names.removeAt(1) //Peter -> 0
    //display name[0]
    println(names[0])
}