package com.companynames.Utils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ExcellUtils {

    /**
     * Reads data from an Excel file and returns it as a List of rows, where each row is a List of Strings.
     *
     * @param fileName Name of the Excel file to read, located in the resources directory.
     * @return List of rows, where each row is represented as a List of cell values (Strings).
     * @throws IOException if there is an error reading the file.
     */
    public static List<List<String>> readExcelFile(String fileName) throws IOException {
        List<List<String>> excelData = new ArrayList<>(); // List to store all rows of Excel data

        // Load the Excel file from the resources directory
        FileInputStream fis = new FileInputStream(new File(
                Objects.requireNonNull(ExcellUtils.class // Get the file using the class loader
                                .getClassLoader()
                                .getResource(fileName))
                        .getFile()
        ));

        // Create a Workbook instance to read the Excel file
        Workbook workbook = new XSSFWorkbook(fis);
        // Get the first sheet of the Excel file
        Sheet sheet = workbook.getSheetAt(0);

        // Iterate through each row in the sheet
        for (Row row : sheet) {
            List<String> rowData = new ArrayList<>(); // List to store data of the current row

            // Iterate through each cell in the current row
            for (Cell cell : row) {
                rowData.add(cell.toString()); // Convert the cell value to String and add to row data
            }

            excelData.add(rowData); // Add the current row's data to the overall Excel data list
        }

        // Close the workbook and file input stream to release resources
        workbook.close();
        fis.close();

        // Return the list of data read from the Excel file
        return excelData;
    }
}
