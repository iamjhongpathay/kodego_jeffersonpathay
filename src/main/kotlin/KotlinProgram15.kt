fun main(){
    var num = arrayOf(
        arrayOf<String>("Peter", "Paul", "Mary"),
        arrayOf<String>("John", "Mark", "Matthew"),
        arrayOf<String>("James", "Luke", "Zachary"),
    )

    var row : Int = 0;
    while (row <3){

        var column : Int = 0
        while (column <3){
            print(" ${num[row][column]}")
            column++
        }
        println()
        row++
    }
}