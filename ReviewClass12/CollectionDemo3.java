package ReviewClass12;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionDemo3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("z");
        arrayList.add("c");
        arrayList.add("b");
        System.out.println(arrayList.size());
        System.out.println(arrayList.contains("Medina"));
        Collections.sort(arrayList);
        System.out.println(arrayList);
        Collections.reverse(arrayList);
        System.out.println(arrayList);
        Collections.shuffle(arrayList);
        System.out.println(arrayList);
        char[] arr = "Maha".toCharArray();
        System.out.println(arr[2]);
        System.out.println(Character.isAlphabetic('1'));

        for(char c:arr){
            System.out.println(Character.isAlphabetic(c));
            System.out.println(Character.isDigit(c));
            System.out.println(Character.isLetter(c));
            System.out.println(Character.isLowerCase(c));
        }

    }
}
