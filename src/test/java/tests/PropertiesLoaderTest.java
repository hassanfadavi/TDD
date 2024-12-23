package tests;

import com.companynames.config.PropertiesLoader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PropertiesLoaderTest {


    //check the loading is working

    //positive test
    @Test
    public void testGetProperties(){

        String actualAppName=PropertiesLoader.get("app.name","TDD Frameworks");
        System.out.println(actualAppName);
        String expectedAppName="TDD Framework";
        Assertions.assertEquals(expectedAppName,actualAppName,"the app name should match the value in app properties");

    }

    //negative test
    @Test
    public void testGetPropertiesWithDeafaultValue() {
        //negative test
        String nonAppName = PropertiesLoader.get("non", "default value");
        Assertions.assertEquals("default value", nonAppName, "should return default value");
    }






}
