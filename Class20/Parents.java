package Class20;

public class Parents {
    private String name; // don't participate in inheritance
    int age;
    protected double weight;
    public String color;

}

class Child extends Parents {
    void printInfo() {
        // System.out.println(name);
        System.out.println(age);
        System.out.println(weight);
        System.out.println(color);
    }

}