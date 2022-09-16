fun main(){
    /*
        Create a MobilePhone class

        give atleast 5 attributes
        give atleast 5 behaviors

        //create 1 primary constructors
        //2 secondary constructors
     */

    //var mobilePhone = MobilePhone("Xiaomi", 64, 18, 6200, 7500.00)
    //var vivo = MobilePhone("Vivo")
    var price = MobilePhone(8000.00)
}

class MobilePhone(var brand : String, var ram : Int, var camera : Int, var battery : Int, var price : Double){

    init{
        println("Mobile Phone Specification")
        println("The brand is $brand")
        println("The internal memory is ${ram}GB")
        println("The main camera is $camera MP")
        println("The battery capacity is Li-Po $battery mAh")
        println("The display size is $price Php")
    }

    constructor(brand : String):this(brand, 64, 18, 6200, 7500.00){}
    constructor(price : Double):this("Xiaomi", 64, 18, 6200, price){}

    fun call(){
        print("The Mobile Phone can call")
    }
    fun text(){
        print("The Mobile Phone can create a cellular text")
    }
    fun capturePhotoVideos(){
        print("The Mobile Phone can capture a photo and videos")
    }
    fun calculate(){
        print("The Mobile Phone can calculate")
    }
    fun alarmClock(){
        print("The Mobile Phone can set an alarm clock")
    }
}