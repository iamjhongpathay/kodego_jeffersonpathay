package Practice_Activities

import SalesDiscount
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SalesDiscountTest{
    //Test Cases

//    @Test
//    fun LessThanZero(){
//        var salesDiscount = SalesDiscount()
//
//    }

    //(1) >=0 and <=10,000 - return 0%
    @Test
    fun greaterThanZeroAndLessThanTenThousand(){
        var salesDiscount = SalesDiscount()
        assertEquals(0.0.toFloat(), salesDiscount.discountAmount(5000.toFloat()))
    }

    //(2) >=10,001 and <=20,000 - return 5%
    @Test
    fun graterThanTenThousandAndLessThanTwentyThousand(){
        var salesDiscount = SalesDiscount()
        assertEquals(750.0.toFloat(), salesDiscount.discountAmount(15000.toFloat()))
    }

    //(3) >=20,001 and <=50,000 - return 10%
    @Test
    fun graterThanTwentyThousandOneAndLessThanFiftyThousand(){
        var salesDiscount = SalesDiscount()
        assertEquals(3000.0.toFloat(), salesDiscount.discountAmount(30000.toFloat()))
    }

    //(4) >=50,001 and <=100,000 - return 15%
    @Test
    fun graterThanFiftyThousandOneAndLessOneHundredThousand(){
        var salesDiscount = SalesDiscount()
        assertEquals(12000.0.toFloat(), salesDiscount.discountAmount(80000.toFloat()))
    }

    //(5) >100,001 - return 20%
    @Test
    fun graterThanOneHundredThousandOne(){
        var salesDiscount = SalesDiscount()
        assertEquals(100000.0.toFloat(), salesDiscount.discountAmount(500000.toFloat()))
    }

}