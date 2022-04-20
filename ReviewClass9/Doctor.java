package ReviewClass9;

public class Doctor {
    //instance variables - declared inside the class but outside any method, constructor
    String firstName, lastName, speciality;
    //static variable - declared inside the class but outside any method, constructor or
    static String hospital = "Jorge Washington";

    //static method can access only static variables
    void work() {
        System.out.println("All doctor work at " + hospital);
    }

    //Constructor - initializing instance variables
    public Doctor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //We can have multiple construction by overloading them
    public Doctor(String firstName, String lastName, String speciality) {
        this(firstName, lastName);
        this.speciality = speciality;
    }

    //static method cannot access non-static variable
    void printInfo() {
        this.hello();//we need to put this (compiler adds it)
        System.out.println("Doctor " + firstName + " " + lastName + " is a " + speciality + " at " + hospital);

    }

    void hello() {
        System.out.println("Hello");
    }

    // non-static methods can access static members
    void work1() {
        System.out.println("All doctors work at " + hospital);
    }
}
