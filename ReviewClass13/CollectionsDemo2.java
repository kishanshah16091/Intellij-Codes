package ReviewClass13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class CollectionsDemo2 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Kishan");
        names.add("Sreejana");
        names.add("Shawn");
        names.add("Sushan");
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().length() > 5) {
                iterator.remove();

            }
        }
        System.out.println(names);

        ListIterator<String> stringListIterator = names.listIterator();
        while (stringListIterator.hasNext()) {
            String name = stringListIterator.next();
stringListIterator.add("Rajkumar");

        }

        System.out.println(names);
    }
}
