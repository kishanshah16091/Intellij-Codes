package Class24;
class Student{
    void study(){
        System.out.println("Student must study to pass");
    }
    void doHomeWork(){
        System.out.println("Student must study do homeworks");
    }
    void practice(){
        System.out.println("Student must practice");
    }
}
class SyntaxStudent extends Student {
    void study() {
        System.out.println("Syntax Students must study 25 hours a week");
    }

    void doHomeWork() {
        System.out.println("Syntax Student must solve Repls");
    }

    @Override
    void practice() {
        System.out.println("Syntax Student must do their own research");
    }
}
class CollegeStudent extends Student {
    @Override
    void doHomeWork() {
        System.out.println("College Student can skip some of the homework");
    }
}
class SchoolStudent extends Student{

}
    public class Task1 {
        //Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
        //Define common behavior within parent class and override some of the methods in child classes
        //Define some methods specific to child classes
        //Write example of achieving run time polymorphism
    }
