fun main (){
    /*Create an application that will accept monetary amounts.
    The application will continue to accept values until a “No” is set as input for the question “Do you want to add another amount?”.

    After the input is done, the user will be asked “Divide the value by how many?”. It will only accept an Integer as input.

    The total of the first input will be divided by the second input.

    Note: Error checking must be done.
    */

    var totalAmount : Int = 0
    var condition : Boolean = true
    var totalDividedBy : Int = 0

    //The user will enter the Amount
    while(condition){
        print("Enter an Amount:")
        var inputAmount : Int = readln().toInt()
        totalAmount = totalAmount + inputAmount

        //It will ask the user to continue to add another amount
        println("Do you want to add another amount?[Yes/No]")
        var question : String = readln().toString()
        //If the user entered a "No" answer, it will ask the user to enter the desire value to divide the total amount
        if (question == "No"){
            println("Divide the value by how many?")
            var dividedBy : Int = readln().toInt()
            totalDividedBy = totalAmount / dividedBy

            //This will show the final answer including the sum of amount
            println("The Sum of the amount you entered is: $totalAmount")
            println("$totalAmount is Divided by $dividedBy: $totalDividedBy")
            condition = false

        //Error Handling! If user enter a wrong answer between [Yes/No]
        }else if((question != "No") && (question != "Yes")){
            println("Invalid! Please choose [Yes/No]")
        }
    }

}