package tests;

import base.BaseTest;
import com.companynames.Utils.ExcellUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExcelUtilTest extends BaseTest{


    @Test
    public void readExcelData() throws IOException {

        log("Creating an instance of List of String...");

      List<List<String>> excelData=  ExcellUtils.readExcelFile("user-data.xlsx");

        log("List is initialized to an arrayList");

        Assertions.assertNotNull(excelData,"Excel data con not be null");

        log("List is not null.All good");

        //VALIDATION

        assertEquals(4,excelData.size(),"Excel file should contain rows");
        log("Excel file does have 4 row.All good");

        assertEquals("ID",excelData.get(0).get(0),"First cell header should be ID");
        log("First cell header should is ID");

        assertEquals("John Doe",excelData.get(1).get(1),"Second row should have John Doe name");
        log("Second row have John Doe name");





    }


//    public static void main(String[] args) throws IOException {
//        List<List<String>> excelData=  ExcellUtils.readExcelFile("user-data.xlsx");
//        System.out.println(excelData);
//        System.out.println(excelData.get(0));
//        System.out.println(excelData.get(1));
//        System.out.println(excelData.get(3).get(2));
//
//    }


    

   }

