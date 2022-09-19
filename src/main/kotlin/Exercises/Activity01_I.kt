fun main (){

    /*Using Activity 01 - C and implement a process where items are added to the grocery.
     */

//    var cannedFoods = arrayListOf<Any>(
//        arrayOf("Corned Beef", "Argentina, 260g", "ACB260G", "36", "56.00"),
//        arrayOf("Pork & Beans", "Hunt's, 100g", "PB100G", 22, 26.00)
//    )
//    var drinks = arrayOf(
//        arrayOf("Red Horse", "San Miguel, BIncan, 330ml", "RD330ML", 2, 68.00),
//        arrayOf("Gatorade", "Gatorade, Blue Bolt, 500ml", "GBB500ML", 105, 51.00)
//    )
//    var frozenGoods = arrayOf(
//        arrayOf("Footlong Hot Dog", "Holiday,Jumbo, 1kg", "FHDHJ1KG", 42, 110.00),
//        arrayOf("Pork Ribs", "Monterey, 1kg", "PM1KG", 50, 220.00)
//    )

    var cannedFoods = arrayListOf("Corned Beef", "Pork & Beans")
    var drinks = arrayListOf("Red Horse", "Gatorade")
    var frozenGoods = arrayListOf("Footlong Hot Dog", "Pork Ribs")

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

            //Display all Canned Foods items
            for (i in cannedFoods)
                println(i)
            println()

            //Display all Drinks items
            println("[-----------Drinks-----------]")
            for (i in drinks)
                println(i)
            println()
            //Display all Frozen Goods items
            println("[--------Frozen Goods--------]")
            for (i in frozenGoods)
                println(i)
            println("[---------------------------------------]")

        } else if(userChoices.toInt() == 2){                    //User Choose the "[2] Search Item"
            println("Sorry! The [2] Search List is not available.")
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

                //User Choose [1] Canned Foods Category to Add an Item
                if(chooseCategory == 1){
                    println()
                    println("[-----------Add Canned Foods-----------]")
                    println()
                    print("Item Name: ")
                    var itemName : String = readln()
                    cannedFoods.add(itemName) //New Item(Data) Added on cannedFoods Variable
                    println()
                    println("The $itemName was added to Canned Foods Category.")

                    //Display all Canned Foods items
                    println("[-----------Canned Foods-----------]")
                    for (i in cannedFoods)
                        println(i)
                    println()

                //User Choose [2] Drinks Category to Add an Item
                }else if(chooseCategory == 2){
                    println()
                    println("[-----------Add Drinks-----------]")
                    println()
                    print("Item Name: ")
                    var itemName : String = readln()
                    drinks.add(itemName) //New Item(Data) Added on drinks Variable
                    println()
                    println("The $itemName was added to Drinks Category.")

                    //Display all Drinks items
                    println("[-----------Drinks-----------]")
                    for (i in drinks)
                        println(i)
                    println()

                //User Choose [3] Frozen Goods Category to Add an Item
                }else if(chooseCategory == 3){
                    println()
                    println("[-----------Add Frozen Goods-----------]")
                    println()
                    print("Item Name: ")
                    var itemName : String = readln()
                    frozenGoods.add(itemName) //New Item(Data) Added on frozenGoods Variable
                    println()
                    println("The $itemName was added to Frozen Goods Category.")

                    //Display all Frozen Goods items
                    println("[-----------Frozen Goods-----------]")
                    for (i in frozenGoods)
                        println(i)
                    println()
                }else{
                    println("The Number you input is not on the list!")
                    break
                }

                //Asking the User if want to Add another Items.
                println("Do you want to add another items? [Yes/No]")
                var addAnother : String = readln()
                if (addAnother == "No"){ //Exit from [2] Add Items
                    condition2 = false
                }else if(addAnother == "Yes"){ //Continued to [2] Add Items
                    condition2 = true
                }
            }
        }else if (userChoices.toInt() == 4){                   //User Choose the "[4] Exit"
            condition = false
        }else {
            println("The Number you input is not on the list!")
        }

    }


}