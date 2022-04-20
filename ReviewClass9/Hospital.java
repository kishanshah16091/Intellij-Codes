package ReviewClass9;

public class Hospital {
    public static void main(String[] args) {
        Doctor doc = new Doctor("Kishan", "Shah", "Surgeon");
        Doctor doc1 = new Doctor("Jane", "Smith");
        doc.printInfo();

        doc1.speciality = "Dermatologist";
        doc1.printInfo();
        System.out.println("Changing value of static variables");
        //static variable should access in static way -- > by class name where variable is defined
        Doctor.hospital="Inova";
        doc.printInfo();
        doc1.printInfo();
        doc1.hospital="Best Hospital";
        doc.printInfo();
        doc1.printInfo();
    }
}
//variables
// optional           optional         Must      Must
//  accessModifier nonAccessModifier  datatype  name;

// methods
// optional          optional          Must       Must
// accessModifier non access modifier returnType  name()