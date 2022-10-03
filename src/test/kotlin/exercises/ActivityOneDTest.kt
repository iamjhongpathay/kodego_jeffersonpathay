package exercises

import ActivityOneD
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

//This Test is for Activity03_B.kt

class ActivityOneDTest{

    @Test
    fun twoPlusTwoEqualsFour(){
        var activityOneD = ActivityOneD(2)
        assertEquals(4, activityOneD.addAmount(2))
    }

    //35 divided by 5 = 7
    @Test
    fun ThirtyFiveDividedByFiveEqualsSeven(){
        var activityOneD = ActivityOneD(35)
        assertEquals(7, activityOneD.dividedBy(5))
    }

}