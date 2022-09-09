fun main(){
    //Mutable set
    var mySet = mutableSetOf<Int>()
    mySet.add(5)
    mySet.add(7)
    mySet.add(8)
    mySet.remove(7)
    for (data in mySet){
        print(data)
    }

//    var mySet2 = setOf(2,3,5,6,2)
//
//    println(mySet2.count())
//    println(mySet2.sum())
//    println(mySet2.average())
//    println("******************")
//    for(data in mySet2){
//        println(data)
//    }

//    var setA = setOf(2, 5, 7, 8)
//    var setB = setOf(1, 3, 5, 7)
//
//    //union
//    println(setA.union(setB))
//    //intersection
//    println(setA.intersect(setB))
//    //difference
//    println(setA.minus(setB))
//    println(setB.minus(setA))
}