package ReviewClass12;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionsDemo {
    public static void main(String[] args) {


        String[] names = new String[100];
        names[0] = "Maha";
        System.out.println(Arrays.toString(names));

        ArrayList<String>arrayList=new ArrayList<>(Arrays.asList(names));

        //ArrayList<String>arrayList= ArrayUtil.toArrayList(names);



        arrayList.add("Kishan");
        System.out.println(arrayList);


    }
}