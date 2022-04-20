package Class28;

import java.util.LinkedList;
import java.util.List;

public class SetMethodDemo {
    public static void main(String[] args) {
        List<String> courses = new LinkedList<>();
        courses.add("SDLC");
        courses.add("Manual Testing");
        courses.add("JAVA");
        courses.add("Git");
        courses.add("TestNg");
        courses.add("Cucumber");
        courses.add("SQL");
        courses.add("API");
        courses.add("Jenkins");
        courses.add("Interview");
        courses.add("AWS");
        courses.add("APM");
        courses.add("Docker");
        courses.add("Dead");
        System.out.println(courses);
        courses.set(courses.size() - 1, "Happy"); //replace
        System.out.println(courses);
        courses.set(courses.size()-1,"$" );
        courses.set(4,"Very Happy");
        System.out.println(courses);
    }
}
