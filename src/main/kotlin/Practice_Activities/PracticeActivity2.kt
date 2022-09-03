import java.math.RoundingMode
import java.text.DecimalFormat
import kotlin.math.roundToInt

fun main(){

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