package ReviewClass8;

import java.util.Locale;

public class StringClass2 {
    public static void main(String[] args) {
        String student ="Teyfur";
        System.out.println(student.startsWith("T"));
        System.out.println(student.toLowerCase().startsWith("T"));// method chaining - when you call multiple methods
                                                                 // in a single line to perform a particular operation
        String namOfSudent= "Kishan Raj Shah";
        System.out.println(namOfSudent.toLowerCase());
        System.out.println(namOfSudent.toUpperCase());
        System.out.println(student.endsWith("r"));


        String name ="Kishan";
        char output=name.charAt(2);
        System.out.println(output);
    }
}
