fun main (){
    /*
    Implement Activity 02 - C using Classes.
    */

    //class Products()
    var products = Products()

    var category : String = ""
    var code : String = ""
    var name : String = ""
    var description : String = ""
    var quantities : Int = 0
    var price : Double = 0.0

    var mainLoop : Boolean = true
    while (mainLoop) {

        try{
            //Main User Interface
            println()
            println("[-------Inventory Management-------]")
            println()
            println("[1] List of all Products")
            println("[2] Search Products")
            println("[3] Add")
            println("[4] Edit")
            println("[5] Delete")
            println("[0] EXIT")
            print("Choose 1-5 or 0 to proceed: ")
            var userChoices: Int = readln().toInt()

            if(userChoices == 1){                                                                                       //[1] List of all Products
                println()
                println("[-----------List of All Products-----------]")
                products.listOfProducts()   //fun listOfProducts()

            }else if(userChoices == 2){                                                                                 //[2] Search Products
                println()
                println("[-----------Search Product-----------]")
                println()
                print("Product Code: ")
                code = readln()
                if(code == products.productCode[code]){
                    println("[-------------Available Data-------------]")
                    println()
                    products.searchOfProduct(code)  //fun searchOfProducts()
                }else{
                    println("(!)No Product Found!")
                }

            }else if(userChoices == 3){                                                                                 //[3] Add Products
                println()
                println("[-----------Add Products-----------]")
                println()
                println("Category:")
                println("[1] Canned Foods")
                println("[2] Drinks")
                println("[3] Frozen Goods")
                println("[0] Cancel")
                print("(?)Which category do you want to add an item? ")

                var chooseCategory : Int = readln().toInt()
                if(chooseCategory == 1){
                    println()
                    println("[-----------Add Product to Canned Foods-----------]")
                    println("Category: Canned Foods")
                    category = "Canned Foods"
                    print("Product Code: ")
                    code = readln()
                    print("Name: ")
                    name = readln()
                    println("Description:")
                    description = readln()
                    print("Quantities: ")
                    quantities = readln().toInt()
                    print("Price: ")
                    price = readln().toDouble()

                    products.addProduct(category,code,name,description,quantities,price)    //fun addProducts

                    println("(!)Successful! Code: $code , Name: $name is added to Canned Foods.")
                }else if(chooseCategory == 2){
                    println()
                    println("[-----------Add Product to Drinks-----------]")
                    println("Category: Drinks")
                    category = "Drinks"
                    print("Product Code: ")
                    code = readln()
                    print("Name: ")
                    name = readln()
                    println("Description:")
                    description = readln()
                    print("Quantities: ")
                    quantities = readln().toInt()
                    print("Price: ")
                    price = readln().toDouble()

                    products.addProduct(category,code,name,description,quantities,price)    //fun addProducts

                    println("(!)Successful! Code: $code , Name: $name is added to Drinks.")
                }else if(chooseCategory == 3){
                    println()
                    println("[-----------Add Product to Frozen Goods-----------]")
                    println("Category: Frozen Goods")
                    category = "Frozen Goods"
                    print("Product Code: ")
                    code = readln()
                    print("Name: ")
                    name = readln()
                    println("Description:")
                    description = readln()
                    print("Quantities: ")
                    quantities = readln().toInt()
                    print("Price: ")
                    price = readln().toDouble()

                    products.addProduct(category,code,name,description,quantities,price)    //fun addProducts

                    println("(!)Successful! Code: $code , Name: $name is added to Frozen Goods.")
                }else if(chooseCategory == 0){
                    mainLoop = continue
                } else{
                    println("(!)Invalid! You entered a number that not in the choices.")
                }

            }else if(userChoices == 4){                                                                                 //[4] Edit Products
                println()
                println("[-----------Edit Product Details-----------]")
                println()
                print("Enter product Code: ")
                code = readln()

                if(code == products.productCode[code]){
                    products.searchToEdit(code)     //fun searchToEdit()
                    println()
                    println("(!)Note! The Product Code CANNOT be modify.")
                    println("Choose a Letter from above to modify the data of $code.")
                    print("Enter the Letter here: ")
                    var letterChoices : String = readln().lowercase()
                    println()

                    if(letterChoices == "a"){
                        println("(!)You chose to modify the [A]NAME of the $code.")
                        print("Enter a New product name: ")
                        name = readln()
                        products.editProducts(letterChoices, code, name, "", 0, 0.0, "")

                    }else if(letterChoices == "b"){
                        println("(!)You chose to modify the [B]Category of the $code.")
                        println("[1] Canned Foods")
                        println("[2] Drinks")
                        println("[3] Frozen Foods")
                        println("(!)Choose a Number with available category from above to change the category of $code")
                        print("Enter the Number here: ")
                        var categoryOption : Int = readln().toInt()
                        when(categoryOption){
                            1 -> category = "Canned Foods"
                            2 -> category = "Drinks"
                            3 -> category = "Frozen Foods"
                            else -> println("(!)Invalid! You entered a number that not in the choices.")
                        }
                        products.editProducts(letterChoices, code, "", category, 0, 0.0, "")

                    }else if(letterChoices == "c"){
                        println("(!)You chose to modify the [C]Quantities of the $code.")
                        print("Enter a New quantities: ")
                        quantities = readln().toInt()
                        products.editProducts(letterChoices, code, "name", "", quantities, 0.0, "")

                    }else if(letterChoices == "d"){
                        println("(!)You chose to modify the [D]Price of the $code.")
                        print("Enter a New price: ")
                        price = readln().toDouble()
                        products.editProducts(letterChoices, code, "name", "", 0, price, "")

                    }else if(letterChoices == "e"){
                        println("(!)You chose to modify the [E]Description of the $code.")
                        print("Enter a New Description: ")
                        description = readln()
                        products.editProducts(letterChoices, code, "name", "", 0, 0.0, description)

                    }else{
                        println("(!)Invalid! You entered a letter that not in the choices to modify.")
                    }
                }else{
                    println("(!)No Product Found!")
                }

            }else if(userChoices == 5){                                                                                 // [5] Delete Products
                println()
                println("[-----------Delete Product-----------]")
                println()
                print("Enter product Code: ")
                code = readln()

                if(code == products.productCode[code]){
                    println("[-------------Data of the Product to Delete-------------]")
                    println()
                    products.searchOfProduct(code)
                    println()

                    var deletionLoop : Boolean = true
                    while(deletionLoop){
                        println("(!)Do you want to DELETE this Product?[Yes/No]: ")
                        var deleteThis : String = readln().lowercase()
                        if(deleteThis == "yes"){
                            products.deleteProduct(code)    //fun deleteProduct()
                            deletionLoop = false
                        }else if(deleteThis == "no"){
                            println()
                            println("(!)Cancelled! Product deletion cancelled.")
                            deletionLoop = false
                        }else{
                            println()
                            println("(!)Choose between Yes or No")
                        }
                    }
                }else{
                    println("(!)No Product Found!")
                }
            } else if(userChoices == 0){                                                                                //[0] EXIT
                println()
                println("(!)The Inventory Management is exiting. . .")
                println("Thank you!")
                mainLoop = false

            }else{
                println("(!)Invalid! You entered a number that not in the choices.")
            }
        }catch (e : NumberFormatException){
            println("(!)Invalid! Enter a digits only.")
        }
    }
}



class Products(){

    var productCategory = mutableMapOf<String, String>("PNB123" to "Canned Foods")
    var productName = mutableMapOf<String, String>("PNB123" to "Pork & Beans")
    var productDescription = mutableMapOf<String, String>("PNB123" to "Hunt's Pork & Beans")
    var productQuantities = mutableMapOf<String, Int>("PNB123" to 611)
    var productPrice = mutableMapOf<String, Double>("PNB123" to 56.4)
    var productCode = mutableMapOf<String, String>("PNB123" to "PNB123")

    fun listOfProducts(){
        for(key in productCategory.keys){
            println("[$key]     -       ${productName[key]}")
        }
    }

    fun searchOfProduct(productCode : String){
        println("${productName[productCode]} - [${this.productCode[productCode]}]")
        println("Category: ${productCategory[productCode]}")
        println("Quantities: ${productQuantities[productCode]} Pieces")
        println("Price: ${productPrice[productCode]} PHP")
        println("Description: ${productDescription[productCode]}")
    }

    fun addProduct(pCategory: String, pCode: String, pName: String,  pDescription: String, pQuantities: Int, pPrice: Double){
        productCategory.put(pCode, pCategory)
        productCode.put(pCode, pCode)
        productName.put(pCode, pName)
        productDescription.put(pCode, pDescription)
        productQuantities.put(pCode, pQuantities)
        productPrice.put(pCode, pPrice)
    }

    fun searchToEdit(productCode : String){
        println("[-------------Available Data to Modify-------------]")
        println()
        println("[A]: ${productName[productCode]} - [${this.productCode[productCode]}]")
        println("[B]: Category: ${productCategory[productCode]}")
        println("[C]: Quantities: ${productQuantities[productCode]} Pieces")
        println("[D]: Price: ${productPrice[productCode]} PHP")
        println("[E]: Description: ${productDescription[productCode]}")

    }

    fun editProducts(userChose: String, code: String, name: String, category: String, quantities: Int, price: Double, description: String ): String{
        if(userChose == "a"){
            productName.replace(code, name)
            println("(!)Successful! The Name of [$code] is modified.")
        }else if(userChose == "b"){
            productCategory.replace(code, category)
            println("(!)Successful! The Category of [$code] is modified.")
        }else if(userChose == "c"){
            productQuantities.replace(code, quantities)
            println("(!)Successful! The Quantities of [$code] is modified.")
        }else if(userChose == "d"){
            productPrice.replace(code, price)
            println("(!)Successful! The Price of [$code] is modified.")
        }else if(userChose == "e"){
            productDescription.replace(code, description)
            println("(!)Successful! The Description of [$code] is modified.")
        }

        return  userChose
    }

    fun deleteProduct(code: String){
        println("(!)Deleting. . .")
        productName.remove(code)
        productCode.remove(code)
        productCategory.remove(code)
        productQuantities.remove(code)
        productPrice.remove(code)
        productDescription.remove(code)
        println("(!)Successful! The Product $code is deleted successfully")
    }
}