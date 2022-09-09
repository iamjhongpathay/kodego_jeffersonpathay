fun main (){
    //declaring maps
    var map = mapOf(1 to "Peter", 2 to "Paul", 3 to "Mary")
    //gettin value from map
    println(map)
    println(map[2])
    println(map.get(3))

    //traversing keys
    for(key in map.keys){
        println(key)
    }
    //traversing values
    for(key in map.values){
        println(key)
    }

    //Mutable maps
    var map2 = mutableMapOf<Int, String>()
    map2.put(2, "John")
    //map2.remove(2)
    println(map2)
}