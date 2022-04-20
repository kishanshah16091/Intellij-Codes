package Class32;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelDemo2 {

        public static void main(String[] args) throws IOException {
            String path = "C:\\Users\\kshah\\Desktop\\Syntax Class file\\Batch 12\\Book1.xlsx";
            FileInputStream fileInputStream = new FileInputStream(path);

            XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
//Sheet sheet =xlsx.getSheet("Sheet1");
//System.out.println(xlsx.getSheetIndex("Sheet1"));
 //System.out.println(sheet.getRow(0).getCell(0));


        }
    }