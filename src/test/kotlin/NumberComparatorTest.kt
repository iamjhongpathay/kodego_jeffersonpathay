import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class NumberComparatorTest{
    //test cases
    //(1) If 5,3,1 is entered, it will return 5
    @Test
    fun fiveThreeOneIsEnteredReturnFive(){
        var numComparator = NumberComparator()
        assertEquals(5, numComparator.getMaxNumber(5, 3, 1))
    }

    //(2) If 1,5,2 is entered, it will return 5
    @Test
    fun oneFiveTwoEnteredReturnFive(){
        var numComparator = NumberComparator()
        assertEquals(5, numComparator.getMaxNumber(1, 5, 2))
    }

    //(3) If 2,5,7 is entered, it will return 7
    @Test
    fun twoFiveSevenEnteredReturnSeven(){
        var numComparator = NumberComparator()
        assertEquals(7, numComparator.getMaxNumber(2, 5, 7))
    }

//    //(4) all numbers are the same
//    @Test
//    fun allNumbersAreEqual(){
//        var numComparator = NumberComparator()
//        assertEquals(2, numComparator.getMaxNumber(1, 5, 2))
//    }
}