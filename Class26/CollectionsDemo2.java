package Class26;

import java.util.ArrayList;

public class CollectionsDemo2 {
    public static void main(String[] args) {
        ArrayList<String> countries = new ArrayList<>();
        countries.add("Nepal");
        countries.add("Turkey");
        countries.add("USA");
        countries.add("Eritea");
        countries.add("GANA");
        System.out.println(countries.get(3));
        //System.out.println(countries.get(-1));
        //System.out.println(countries.get(7)); out of bound
        System.out.println(countries);
        countries.add(3, "Pakistan");// insert the elements at this specified
        System.out.println(countries);
        System.out.println(countries.size());
        countries.remove("Pakistan");
        System.out.println(countries);
        countries.clear();
        System.out.println(countries);
        System.out.println(countries.size());
    }

}
