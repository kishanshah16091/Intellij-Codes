package Class28;

import java.util.LinkedList;
import java.util.List;

public class IteratorDemo1 {
    public static void main(String[] args) {
        List<String> courses = new LinkedList<>();
        courses.add("SDLC");
        courses.add("Manual Testing");
        courses.add("JAVA");
        courses.add("JAVA");
        courses.add("Selenium");
       /* for (int i = 0; i < 5; i++) {
            if (courses.get(i).equals("JAVA")) {
                courses.remove("JAVA");
            }
        }*/
/*        for (String course : courses) {
            if (course.equals("JAVA")) {
                courses.remove(course);

            }
            System.out.println(courses);

        }*/
    }
}