package Class28;

import java.util.ArrayList;

public class ListDemo1 {
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList();
        arrayList.add("10");
        arrayList.add("Name");
        arrayList.add(12.5);
        arrayList.add(true);

        for (int i =0; i<arrayList.size(); i++){
            System.out.println(((String) arrayList.get(i)).length());

        }
        System.out.println(arrayList);
    }
}
