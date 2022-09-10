fun main(){

    /*Create a kotlin program called PracticeActivity7.kt that computes the perimeter and area of a rectangle.
    Designate functions calculatePerimeter() and calculateArea() that will facilitate the computation of values.
    No println() or display of output should be seen inside these functions.

    Sample Input/Method
    Enter length: 4.5
    Enter width: 2.0

    Perimeter is 13.00 meters
    Area is 9.00 meters
     */

    print("Enter lenght:")
    var length : Double = readln().toDouble()
    print("Enter width:")
    var width : Double = readln().toDouble()



    println("Perimeter is: ${perimeter(length, width)} meters") //calling the Perimeter function
    println("Area is: ${areaOfRectangle(length, width)} meters") //calling the Area of Rectangle function

}

fun perimeter(length: Double, width: Double):Double{
    var resultPerimeter : Double = 2 * (length + width)
    return resultPerimeter
}
fun areaOfRectangle(length: Double, width: Double):Double{
    var resultAreaofRec : Double = length.toDouble() * width
    return resultAreaofRec
}