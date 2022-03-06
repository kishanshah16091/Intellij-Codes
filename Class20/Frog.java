package Class20;

public class Frog {
    String name;
    String color;
    int age;
    double weight;

    public Frog(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
        //double weight=20;
        weight=10;
    }

    public Frog(String name, String color, int age, double weight) {
        this(name,color,age);
       // this.name = name;
       // this.color = color;
       // this.age = age;
        this.weight = weight;
    }
    void printInfo(){
        //this()not allowed inside the methods
        //tis(name,color,age);
        System.out.println(name+" "+color+" "+age+" "+weight);

    }

}
