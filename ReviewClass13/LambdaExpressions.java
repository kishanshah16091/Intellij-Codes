package ReviewClass13;

import java.util.ArrayList;

public class LambdaExpressions {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Kishan");
        names.add("Sreejana");
        names.add("Shawn");
        names.add("Sushan");
       long k= names.parallelStream().filter(x->x.contains("K")).count();
        System.out.println(k);

    }
}
