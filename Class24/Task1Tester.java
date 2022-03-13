package Class24;

public class Task1Tester {
    public static void main(String[] args) {
        Student syntaxStudent = new SyntaxStudent();
        Student schoolStudent = new SchoolStudent();
 /*
 as we can store the object of a child class in a parent class
 we can also create an array of these students as show below
  */
        Student[] students = {new SyntaxStudent(), new SchoolStudent(),
                new CollegeStudent()};
        // int[] arr={1,2,3};
        //for(int number:arr){
        // }
        //System.out.println(number);
        //}
        students[0].practice();// calling 1 index
        // calling the method form all the children classes
        for (Student student: students){
            student.study();
            student.doHomeWork();
            student.practice();

        }
    }
}