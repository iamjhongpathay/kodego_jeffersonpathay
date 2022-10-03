fun main(){
    /*
        Create a MobilePhone class

        give atleast 5 attributes
        give atleast 5 behaviors

        //create 1 primary constructors
        //2 secondary constructors
     */


    var mobilePhone = MobilePhone("Xiaomi", 64, 18, 6200, 7500.00)
//    var vivo = MobilePhone("Vivo")
//    var price = MobilePhone(8000.00)

    println()
    mobilePhone.call()
    mobilePhone.text()
    mobilePhone.capturePhotoVideos()
    mobilePhone.calculate()
    mobilePhone.alarmClock()
}

    //5 attributes
    //Primary Constructor
class MobilePhone(var brand : String, var ram : Int, var camera : Int, var battery : Int, var price : Double){
    init{
        println("Mobile Phone Specification")
        println("The brand is $brand")
        println("The internal memory is ${ram}GB")
        println("The main camera is $camera MP")
        println("The battery capacity is Li-Po $battery mAh")
        println("The display size is $price Php")
    }

    //2 Secondary Constructor
    constructor(brand : String):this(brand, 64, 18, 6200, 7500.00){}
    constructor(price : Double):this("Xiaomi", 64, 18, 6200, price){}

    //5 Behaviours
    fun call(){
        println("The $brand Phone can call")
    }
    fun text(){
        println("The $brand Phone can create a cellular text")
    }
    fun capturePhotoVideos(){
        println("The $brand Phone can capture a photo and videos")
    }
    fun calculate(){
        println("The $brand Phone can calculate")
    }
    fun alarmClock(){
        println("The $brand Phone can set an alarm clock")
    }
}