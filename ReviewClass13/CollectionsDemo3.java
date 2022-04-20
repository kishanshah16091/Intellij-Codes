package ReviewClass13;

import java.util.ArrayList;

public class CollectionsDemo3 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            names.add("sdksadksadoisadisakdsakdisajdksaji");
        }
        long starTime = System.currentTimeMillis();
        long count = names.stream().filter(x -> x.length() > 5).count();
        long endTime = System.currentTimeMillis();

        System.out.println(endTime-starTime);
        long starTime1 = System.currentTimeMillis();
        long count1 = names.parallelStream().filter(x -> x.length() > 5).count();
        long endTime1 = System.currentTimeMillis();
        System.out.println(endTime-starTime);

    }
}


