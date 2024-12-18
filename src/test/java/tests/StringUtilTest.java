package tests;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import utils.StringUtils;

import static utils.StringUtils.text;

public class StringUtilTest {


    @Test
    public void upperCse(){


        Assertions.assertEquals(text("hassan"),text("hassan"),"is lower");
    }



}
