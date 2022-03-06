package Class20;

public class HumanTester {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "kishan";
        System.out.println(student.name);
        student.printName();
        Teacher teacher = new Teacher();
        teacher.name = "Asghar";
        System.out.println(teacher.name);
        Principle principle=new Principle();
        principle.specialParkingSlot=false;
        System.out.println(false);
        principle.name="Gulden";
        System.out.println(principle.name);

    }
}
