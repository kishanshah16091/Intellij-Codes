package Class20;

public class Task9 {
    /*
Write a Java program called Teacher.
Identify features and behaviour of that Class.
Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher
that would have it their own features and behaviour. Test all 4 classes
 */
    public static void main(String[] args) {
        MathTeacher mathTeacher = new MathTeacher();
        mathTeacher.name = "Teyfur";
        mathTeacher.teachCalculus();
    }
}

class TeacherA {
    String name;
    int age;
    double weight;

    void printName() {
        System.out.println(name);
    }
}

class MathTeacher extends TeacherA {
    boolean canTeachTrigonometry = true;

    void teachCalculus() {
        System.out.println(name + "Teaching Calculus");
    }
}

class ChemistryTeacher extends TeacherA {
    boolean canTeachChemicals = true;

    void teachOrganicChemistry() {
        System.out.println("Teaching OrganicChemistry");
    }
}

class PianoTeacher extends TeacherA {
    boolean canRideBike = true;

    void teachPiano() {
        System.out.println("Teaching Piano");
    }
}