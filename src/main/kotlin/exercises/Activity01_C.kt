fun main(){
    /*You are tasked to automate an inventory system for a grocery
     Identify the items that can be bought in a grocery store. After listing the different items,
     identify the characteristics of the items.You are also tasked to group the items in categories to help manage the grocery.
     Use the proper data types.
     */

    println("Inventory Management")
    println()

    //User Chooses to enter
    println("[1] List of all Items")
    println("[2] Search Item")
    println("[3] EXIT")
    print("Choose 1, 2 or 3 to proceed: ")
    var userChoices : Int = readln().toInt()
    println()

    //Characteristic of Items that will display
    val itemCategory1 : String = "Canned Foods"
    var productName1 : String = "Corned Beef"
    var productDescription1 : String = "Argentina, 260g"
    var productSN1 : String = "ACB260G"
    var productStock1 : Long = 36
    var productPrice1 : Float = 56.00.toFloat()

    var productName2 : String = "Pork & Beans"
    var productDescription2 : String = "Hunt's, 100g"
    var productSN2 : String = "PB100G"
    var productStock2 : Long = 22
    var productPrice2 : Float = 26.00.toFloat()

    val itemCategory2 : String = "Drinks"
    var productName3 : String = "Red Horse"
    var productDescription3 : String = "San Miguel, BIncan, 330ml"
    var productSN3 : String = "RD330ML"
    var productStock3 : Long = 2
    var productPrice3 : Float = 68.00.toFloat()

    var productName4 : String = "Gatorade"
    var productDescription4 : String = "Gatorade, Blue Bolt, 500ml"
    var productSN4 : String = "GBB500ML"
    var productStock4 : Long = 105
    var productPrice4 : Float = 51.00.toFloat()

    val itemCategory3 : String = "Frozen Foods"
    var productName5 : String = "Pork"
    var productDescription5 : String = "Monterey, 1kg"
    var productSN5 : String = "PM1KG"
    var productStock5 : Int = 50
    var productPrice5 : Float = 220.00.toFloat()

    var productName6 : String = "Footlong Hot Dog"
    var productDescription6 : String = "Holiday,Jumbo, 1kg"
    var productSN6 : String = "FHDHJ1KG"
    var productStock6 : Int = 42
    var productPrice6 : Float = 110.00.toFloat()


    //Conditions when user choose of any number available in the choices
    //If user choose [1] it will display all items
    if(userChoices == 1){
        println("**********")
        println("All Available Items")
        println("**********")
        println()

        //Canned Foods
        println("**Canned Foods")
        println("Name: $productName1")
        println("Item Descrption: $productDescription1")
        println("Serial Number: $productSN1")
        println("Stock: $productStock1")
        println("Price: $productPrice1")
        println()
        println("Name: $productName2")
        println("Item Descrption: $productDescription2")
        println("Serial Number: $productSN2")
        println("Stock: $productStock2")
        println("Price: $productPrice2")
        println()
        //Drinks
        println("**Drinks")
        println("Name: $productName3")
        println("Item Descrption: $productDescription3")
        println("Serial Number: $productSN3")
        println("Stock: $productStock3")
        println("Price: $productPrice3")
        println()
        println("Name: $productName4")
        println("Item Descrption: $productDescription4")
        println("Serial Number: $productSN4")
        println("Stock: $productStock4")
        println("Price: $productPrice4")
        println()
        //Frozen Foods
        println("**Frozen Foods")
        println("Name: $productName5")
        println("Item Descrption: $productDescription5")
        println("Serial Number: $productSN5")
        println("Stock: $productStock5")
        println("Price: $productPrice5")
        println()
        println("Name: $productName6")
        println("Item Descrption: $productDescription6")
        println("Serial Number: $productSN6")
        println("Stock: $productStock6")
        println("Price: $productPrice6")
        println()

        //If user choose [2] the user can search all available items at once
    } else if (userChoices == 2){
        println("**********")
        println("Search Item")
        println("**********")
        println()
        print("Enter Product Name: ")
        var search : String = readln()

        if(search == "Corned Beef"){
            println("Name: $productName1")
            println("Item Descrption: $productDescription1")
            println("Serial Number: $productSN1")
            println("Stock: $productStock1")
            println("Price: $productPrice1")
            println()
        }else if(search == "Pork & Beans"){
            println("Name: $productName2")
            println("Item Descrption: $productDescription2")
            println("Serial Number: $productSN2")
            println("Stock: $productStock2")
            println("Price: $productPrice2")
            println()
        }else if(search == "Red Horse"){
            println("Name: $productName3")
            println("Item Descrption: $productDescription3")
            println("Serial Number: $productSN3")
            println("Stock: $productStock3")
            println("Price: $productPrice3")
            println()
        }else if(search == "Gatorade"){
            println("Name: $productName4")
            println("Item Descrption: $productDescription4")
            println("Serial Number: $productSN4")
            println("Stock: $productStock4")
            println("Price: $productPrice4")
            println()
        }else if(search == "Pork"){
            println("Name: $productName5")
            println("Item Descrption: $productDescription5")
            println("Serial Number: $productSN5")
            println("Stock: $productStock5")
            println("Price: $productPrice5")
            println()
        }else if(search == "Footlong Hot Dog"){
            println("Name: $productName6")
            println("Item Descrption: $productDescription6")
            println("Serial Number: $productSN6")
            println("Stock: $productStock6")
            println("Price: $productPrice6")
            println()
        }else{
            println("No item found!")
        }
    }else if(userChoices == 3){
        System.exit(0)
    }else{
        println("Not on the list!")
    }
}