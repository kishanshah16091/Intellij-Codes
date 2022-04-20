package Class26;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionsDemo1 {
    public static void main(String[] args) {
        String name="Kishan";
        String name1= "Yazgul";
        //not scalable if we have to store large amount of data
        //Arrays can be good option to tackle this problem
        String [] names={"Yazgul","Andrew"};
        //names[3]="kishan";
        String[] names1=new String[1000];
        names1[0]="Elena";
        names1[2]="Shawn";
        System.out.println(Arrays.toString(names1));
        ArrayList<String> syntaxStudents=new ArrayList<>();
        //ArrayList=> name of the class
        //<> diamond operator
        // String datatype
        syntaxStudents.add("Dmitriy");
        syntaxStudents.add("Mike");
        syntaxStudents.add("Sreejana");

        System.out.println(syntaxStudents);
    }
}
