package Class28;

import java.util.ArrayList;
import java.util.Iterator;

public class ClassTask2 {
    public static void main(String[] args) {
        //Create an arrayList of words. Remove every word that ends with “e”.
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("love");
        arrayList.add("lahore");
        arrayList.add("cake");


        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().toLowerCase().endsWith("e")) {
                iterator.remove();
            }

        }
        System.out.println(arrayList);
    }
}