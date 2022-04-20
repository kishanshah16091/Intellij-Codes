package Class33;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ClassTask1 {
    /*
     //How would handle InputMismatchException?
    // Input Mismatch Exception when user enters
     */
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println(scan.nextInt());
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Please enter the correct type of data");
        }
    }
}