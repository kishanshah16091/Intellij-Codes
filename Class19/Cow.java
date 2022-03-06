package Class19;

public class Cow {
    //The constructor that is provided automatically when we don't create any constructors in a
    //class is called default constructors

    Static int normalNumberOfLegs = 4;
    //When we don't assign values to the instance fields java assigns default value to these fileds.
    //int=0
    //double=0.0
    //class object with Null
    //boolean with = false
    //char\u0000
    private String name;
    int age;
    double weight;
    String bread;
    char gender;

    //below is Zero argument or no argument constructor

    Cow() {
// you might want to execute some code to setup the resources for your class like opening the
// connections to database checking it internet is available or not etc
    }
    void printName(){
        System.out.println(gender);
    }
}
