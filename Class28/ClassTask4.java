package Class28;

import java.util.ArrayList;

public class ClassTask4 {
    public static void main(String[] args) {
//Create an arrayList of even numbers from 1 to 500. Remove any number that is divisible by 5 from that arrayList

        ArrayList<Integer> number = new ArrayList<>();
        for (int i = 2; i < 500; i += 2) {
            number.add(i);
        }
        number.removeIf(integer -> integer % 5 == 0);
        System.out.println(number);
    }
}