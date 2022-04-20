package Class28;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListDemo4 {
    public static void main(String[] args) {

        Student teyfur=new Student("Tefur",20,"Memes");
        Student gulden=new Student("Flower pot",21,"Study");
        Student emilia=new Student("Emilia",21,"Coding");

        LinkedList<Student> studentLinkedList=new LinkedList<>();
        studentLinkedList.add(teyfur);
        studentLinkedList.add(gulden);
        studentLinkedList.add(emilia);
        System.out.println(studentLinkedList);

    }


}
class Student{
    public Student(String name, int age, String hobbies) {
        this.name = name;
        this.age = age;
        this.hobbies = hobbies;
    }

    String name;
    int age;
    String hobbies;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobbies='" + hobbies + '\'' +
                '}';
    }
}