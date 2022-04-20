package Class33;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FinallyDemo {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        try {
            String path = "C:\\Users\\kshah\\Desktop\\Syntax Class file\\Batch 12\\Book.xlsx";
            fileInputStream = new FileInputStream(path);
            XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
            Sheet sheet = xssfWorkbook.getSheet("Sheet1");

        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("the file that you are trying to read is not present on the provided path please check your path again");

        } catch (IOException e) {
            System.out.println("something with hard drive went wrong");
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                System.out.println("Error while closing the file");
            }

        }
        System.out.println("Now you should not able to perform other operations");
    }

}
