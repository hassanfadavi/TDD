package tests;

import com.companynames.core.Calculators;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testAdition(){

       Assertions.assertEquals(8,Calculators.sum(5,3),"not match");

    }

    @Test
    public   void  testAdditionWithThreeNumber(){

        Assertions.assertEquals(10,Calculators.sum(5,3,2),"not match");

    }

    @Test
    public void testMultipilication(){

        Assertions.assertEquals(8,Calculators.multiply(2,3),     "Expected output and current result does not match.");

    }

    @Test
    public void testMultipilicationWithThree(){

        Assertions.assertEquals(24,Calculators.multiply(2,3,4),     "Expected output and current result does not match.");

    }

    @Test
    public void testSubtraction(){

        Assertions.assertEquals(0,Calculators.subtract(2,3),     "Expected output and current result does not match.");

    }

    @Test
    public void testSubtractionWithThreeNumbers(){

        Assertions.assertEquals(0,Calculators.subtract(2,3,6),     "Expected output and current result does not match.");

    }

    @Test
    public void division(){

        Assertions.assertEquals(5,Calculators.division(4,0));

    }




}


