package Class27;

import java.util.ArrayList;


public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<Double> number = new ArrayList<>();
        number.add(10.5);
        number.add(100.5);
        number.add(12.9);
        number.add(1.5);
        System.out.println(number.get(2));
        number.remove(02);
        System.out.println(number);
        System.out.println(number.size());
        for (Double numbers : number) {
            System.out.println(numbers);
        }
    }
}