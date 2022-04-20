package Class28;

import java.util.LinkedList;
import java.util.List;
import java.util.function.UnaryOperator;

public class ListDemo3 {
    public static void main(String[] args) {
        List<String> courses = new LinkedList<>();
        courses.add("SDLC");
        courses.add("Manual Testing");
        courses.add("JAVA");
        courses.add("Git");
        courses.add("TestNg");
        courses.add("Cucumber");
        System.out.println(courses);
        for (int i = 0; i <courses.size() ; i++) {
            if(courses.get(i).equals("JAVA")){
                courses.set(i,"Happy");//replace
            }

        }
/*            @Override
            public String apply(String s) {
                if (s.equals("JAVA")) {
                    return "Happy";
                } else {
                    return s;
                }

            }
        });*/
        System.out.println(courses);
    }
}
