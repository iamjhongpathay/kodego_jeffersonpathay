package exercises

import Products_A03D
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Products_A03DTest{

    //All the parameters is not empty return True
    @Test
    fun allTheParametersAreNotEmptyReturnTrue(){
        var productsA03d = Products_A03D()
        assertTrue(productsA03d.addProduct("userChose", "pCategory", "pCode", "pName",
            "pDescription", 0, 0.0)); true
    }

    //Product Details is empty or Quantities and Price is less than 0 return false
    @Test fun ProductDetailsIsEmptyOrQuantityAndPriceIsLessThanZeroReturnFalse(){
    var productsA03d = Products_A03D()
    assertFalse(productsA03d.addProduct("userChose", "", "", "",
        "", -1, -1.0)); false
    }
 }