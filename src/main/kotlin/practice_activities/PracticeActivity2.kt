import java.math.RoundingMode
import java.text.DecimalFormat
import kotlin.math.roundToInt

fun main(){

    /*
    Practice Activity 2
    Create a Kotlin program that will accept grades, then calculates and display their average grade.

    Sample Output
    Enter Grade in Math:
    78
    Enter  Grade in English:
    81
    Enter  Grade in Filipino:
    98
    Average Grade is: 85.66
     */

    val df = DecimalFormat("#.##")
    df.roundingMode = RoundingMode.DOWN

    print("Enter Grade in Math:")
    var mathGrade : Float = readln().toFloat()
    print("Enter Grade in English:")
    var englishGrade : Float = readln().toFloat()
    print("Enter Grade in Filipino:")
    var filipinoGrade : Float = readln().toFloat()

    var averageGrade : Float = (mathGrade + englishGrade + filipinoGrade) / 3
    val final = df.format(averageGrade)

    println("Average Grade is: $final")



}