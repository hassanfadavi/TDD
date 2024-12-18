package tests;

import com.companynames.core.Calculators;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testAdition(){
        Calculators calculators=new Calculators();
       Assertions.assertEquals(8,calculators.sum(5,3),"not match");

    }

    @Test
    public void  testAdditionWithThreeNumber(){
        Calculators calculators=new Calculators();
        Assertions.assertEquals(10,calculators.sum(5,3,2),"not match");

    }

    @Test
    public void testMultipilication(){
        Calculators calculators=new Calculators();
        Assertions.assertEquals(8,calculators.multiply(2,3),"not match");

    }

    @Test
    public void testMultipilicationWithThree(){
        Calculators calculators=new Calculators();
        Assertions.assertEquals(24,calculators.multiply(2,3,4),"not match");

    }




}


