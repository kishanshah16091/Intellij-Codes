package Class16;

public class Hw1 {
    public static void main(String[] args) {

        String s = "Sunday is great";
        Hw1 hw1 = new Hw1();
        //System.out.println(Hw1.reverseString(s));
        String[] strArray = s.split(" ");

        for (int i = 0; i < strArray.length; i++) {
            System.out.print(reverseString(strArray[i] + " "));

        }
    }

    static String reverseString(String inputString) {
        StringBuilder StringBuilder = new StringBuilder(inputString);
        StringBuilder.reverse();
        return StringBuilder.toString();


    }
}