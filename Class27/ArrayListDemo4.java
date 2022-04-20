package Class27;

import java.util.ArrayList;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        ArrayList<String> vegetable = new ArrayList<>();
        vegetable.add("Potato");
        vegetable.add("Tomato");
        vegetable.add("Carrot");
        ArrayList<String> groceries=new ArrayList<>();
        groceries.addAll(fruits);
        groceries.addAll(vegetable);
        System.out.println(groceries);


    }
}
