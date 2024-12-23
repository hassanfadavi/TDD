package tests;


import com.companynames.Utils.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilTest {



    @Test
     public void testUpperCse(){

        String input="HELLO";
        String expect="HELLO";

        Assertions.assertEquals(expect, StringUtils.toUpperCase(input),"not working");

    }


    @Test
    public void testLowerCse(){

        String input="HELLO";
        String expect="HELLO";
        Assertions.assertEquals(expect, StringUtils.toLowerCase(input),"not working");

    }




}
