fun main (){
    /*
    Implement Activity 02 - C using Classes.
    */

//    var cannedFoods = arrayListOf<Any>(
//        arrayOf("Corned Beef", "Argentina, 260g", "ACB260G", "36", "56.00"),
//        arrayOf("Pork & Beans", "Hunt's, 100g", "PB100G", 22, 26.00)
//    )
//    var drinks = arrayListOf<Any>(
//        arrayOf("Red Horse", "San Miguel, BIncan, 330ml", "RD330ML", 2, 68.00),
//        arrayOf("Gatorade", "Gatorade, Blue Bolt, 500ml", "GBB500ML", 105, 51.00)
//    )
//    var frozenGoods = arrayListOf<Any>(
//        arrayOf("Footlong Hot Dog", "Holiday,Jumbo, 1kg", "FHDHJ1KG", 42, 110.00),
//        arrayOf("Pork Ribs", "Monterey, 1kg", "PM1KG", 50, 220.00)
//    )

    //Calling Classes
    var cannedFoods = CannedFoods()
    var drinks = Drinks()
    var frozenGoods = FrozenGoods()

    //Main While Loop of entire Inventory Management
    var condition : Boolean = true
    while(condition){

        //Main User Interface
        println()
        println("[Inventory Management]")
        println()
        println("[1] List of all Items")
        println("[2] Search Item")
        println("[3] Add Items")
        println("[4] EXIT")
        print("Choose 1, 2, 3 or 4 to proceed: ")
        var userChoices : String = readln()

        if(userChoices.toInt() == 1){                          //User Choose the "[1] List of All Items"
            println()
            println("[-----------List of All Items-----------]")
            println("[--------Canned Foods--------]")
            //Class CannedFoods -> Function displayCannedFoods()
            cannedFoods.displayCannedFoods()

            println("[-----------Drinks-----------]")
            //Class Drinks -> Function displayDrinks()
            drinks.displayDrinks()

            println("[--------Frozen Goods--------]")
            //Class FrozenFoods -> Function displayFrozenFoods()
            frozenGoods.displayFrozenGoods()
            println("[---------------------------------------]")

        } else if(userChoices.toInt() == 2){                    //User Choose the "[2] Search Item"
            println("Sorry! The [2] Search List is under construction.")
        } else if(userChoices.toInt() == 3){                    //User Choose the "[3] Add Items"

            //While Loop of Add Items
            var condition2 : Boolean = true
            while (condition2){

                //Add Items User Interface
                println()
                println("[-----------Add Items-----------]")
                println()
                println("Categories:")
                println("[1] Canned Foods")
                println("[2] Drinks")
                println("[3] Frozen Goods")
                print("Which category do you want to add an item? ")
                var chooseCategory : Int = readln().toInt()

                //[1] Canned Foods Category to Add an Item
                if(chooseCategory == 1){
                    println()
                    println("[-----------Add Canned Foods-----------]")
                    println()
                    print("Item Name: ")
                    cannedFoods.addCannedFoods() //Class CanFoods -> Function addCannedFoods

                    //Display all Canned Foods items
                    println("[-----------Canned Foods-----------]")
                    //Class CannedFoods -> Function displayCannedFoods()
                    cannedFoods.displayCannedFoods()

                //[2] Drinks Category to Add an Item
                }else if(chooseCategory == 2){
                    println()
                    println("[-----------Add Drinks-----------]")
                    println()
                    print("Item Name: ")
                    drinks.addDrinks() //Class Drinks -> Function addDrinks

                    //Display all Drinks items
                    println("[-----------Drinks-----------]")
                    //Class Drinks -> Function displayDrinks()
                    drinks.displayDrinks()

                //[3] Frozen Goods Category to Add an Item
                }else if(chooseCategory == 3){
                    println()
                    println("[-----------Add Frozen Goods-----------]")
                    println()
                    print("Item Name: ")
                    frozenGoods.addFrozenGoods() //Class FrozenFoods -> Function addCFrozenFoods

                    //Display all Frozen Goods items
                    println("[-----------Frozen Goods-----------]")
                    //Class FrozenFoods -> Function displayFrozenFoods()
                    frozenGoods.displayFrozenGoods()
                }else{
                    println("Invalid! The number you enter is not one of the any choices.")
                    break
                }

                //Asking the User if want to Add another Items.
                println("Do you want to add another items? [Yes/No]")
                var addAnother : String = readln().lowercase()
                if (addAnother == "no"){ //Exit from [2] Add Items
                    condition2 = false
                }else if(addAnother == "yes"){ //Continue to [2] Add Items
                    condition2 = true
                }
            }
        }else if (userChoices.toInt() == 4){                   //User Choose the "[4] Exit"
            condition = false
        }else {
            println("Invalid! The number you enter is not one of the any choices.")
        }

    }


}

class CannedFoods{
    var cannedFoods = arrayListOf("Corned Beef", "Pork & Beans")

    fun displayCannedFoods(){
        for (i in cannedFoods)
            println(i)
        println()
    }
    fun addCannedFoods(){
        var itemName : String = readln()
        cannedFoods.add(itemName) //New Item(Data) Added on cannedFoods Variable
        println()
        println("The $itemName was added to Canned Foods Category.")
    }
}

class Drinks{
    var drinks = arrayListOf("Red Horse", "Gatorade")

    fun displayDrinks(){
        for (i in drinks)
            println(i)
        println()
    }
    fun addDrinks(){
        var itemName : String = readln()
        drinks.add(itemName) //New Item(Data) Added on drinks Variable
        println()
        println("The $itemName was added to Drinks Category.")
    }
}

class FrozenGoods{
    var frozenGoods = arrayListOf("Footlong Hot Dog", "Pork Ribs")

    fun displayFrozenGoods(){
        for (i in frozenGoods)
            println(i)
        println()
    }
    fun addFrozenGoods(){
        var itemName : String = readln()
        frozenGoods.add(itemName) //New Item(Data) Added on frozenGoods Variable
        println()
        println("The $itemName was added to Frozen Goods Category.")
    }
}
