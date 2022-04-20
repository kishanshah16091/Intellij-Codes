package Class32;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelDemo5 {

    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\kshah\\Desktop\\Syntax Class file\\Batch 12\\Book2.xlsx";
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook();
        Sheet sheet = xssfWorkbook.createSheet("Sheet1");
        for (int i = 0; i < 10; i++) {
            Row row=sheet.createRow(i);
            for (int j = 0; j < 5; j++) {
                Cell cell=row.createCell(j);
                cell.setCellValue(i+" "+j);
            }
        }
        xssfWorkbook.write(fileOutputStream);

    }
}