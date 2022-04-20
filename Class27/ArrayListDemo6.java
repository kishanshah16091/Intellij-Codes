package Class27;

import java.util.ArrayList;

public class ArrayListDemo6 {
    public static void main(String[] args) {
        ArrayList<String> groceries = new ArrayList<>();
        //Lis<String>groceries=Arrays.asList("Apple","Orange","Banana");// creating list in single line
        groceries.add("Apple");
        groceries.add("Orange");
        groceries.add("Banana");
        groceries.add("Potato");
        groceries.add("Tomato");
        groceries.add("Carrot");
        System.out.println(groceries);
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Apple");
        list2.add("Carrot");
        //list2.add("Pillow");

        System.out.println(groceries.containsAll(list2));
    }
}

