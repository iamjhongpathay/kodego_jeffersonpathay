fun main() {
/*Practice Activity 3

Design program AgeGroup that will determine if age belongs to underage, young adult, adult, senior. Under age is 1-17;
young adult is from 18-30; adult is from 31-59; senior is from 60 or more. Display “Invalid age” for negative numbers.

Sample Input/Output:

Enter age: 24

Young adult

 */
    print("Enter Age: ")
    var ageGroup : Int = readln().toInt()

    if((ageGroup >= 1) && (ageGroup <= 17)){
        println("Under age")
    } else if((ageGroup >= 18) && (ageGroup <= 30)){
        println("Young Adult")
    }else if ((ageGroup >= 31) && (ageGroup <= 59)){
        println("Adult")
    }else if(ageGroup >60){
        println("Senior")
    }


}