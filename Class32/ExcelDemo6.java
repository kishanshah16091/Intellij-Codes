package Class32;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelDemo6 {

    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\kshah\\Desktop\\Syntax Class file\\Batch 12\\Book.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = xssfWorkbook.getSheet("Sheet1");
        // A list a maps to store, store the dat from excel each map will store the dat from each row
        List<Map<String, String>> excelData = new ArrayList<>();
        // getting header from the Excel file so that we can use the data from this header row as keys for the maps like firstName lastName etc.
        Row headerRow = sheet.getRow(0);
        for (int j = 0; j < sheet.getPhysicalNumberOfRows(); j++) {
            //getting all the rows starting from row number 2 skipping the first one because it contains headers
            Row row = sheet.getRow(j);
            //for each row we create a new map that we don't override the data for all rows
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
            // once we have got the row we fetch all the dat from all the cells with the help of a loop
            for (int i = 0; i < row.getPhysicalNumberOfCells(); i++) {
                // System.out.print(row.getCell(i) + " ");
                // we use the header roe to get the keys and the row to get the value for the data
                linkedHashMap.put(headerRow.getCell(i).toString(), row.getCell(i).toString());

            }
            // once we are done storing all the data from a row inside a map we put that map inside the list that we created
            excelData.add(linkedHashMap);

        }
        System.out.println(excelData);
    }
}