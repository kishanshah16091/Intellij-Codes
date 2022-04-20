package Class28;

import java.util.ArrayList;

public class ClassTask3 {
    public static void main(String[] args) {
        //Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.

        ArrayList<String> drinkList = new ArrayList<>();
        drinkList.add("Coke");
        drinkList.add("Tea");
        drinkList.add("coffee");
        drinkList.add("aloevera");
        drinkList.add("Milk");

        for (int i = 0; i < drinkList.size(); i++) {
            if (drinkList.get(i).contains("a") || drinkList.get(i).contains("e")) {
                drinkList.set(i, "water");
            }
        }
        System.out.println(drinkList);
    }

}

