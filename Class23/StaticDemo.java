package Class23;

public class StaticDemo {

}
class Cat {
static int noOfLegs=4;
    String name;
    Cat(String name){
        this.name=name;
    }

    public void printInfo(){
        System.out.println(name+noOfLegs);
    }
    public static void Print(){
        //we can't access the instance fields directly inside static methods
        // System.out.println(name+noOfLegs);
        // we can't use instance fields with static methods
        //System.out.println(noOfLegs);
    }

    public static void main(String [] args){
        Cat cat=new Cat("Stella");

        Cat.Print();
        Cat cat2=new Cat("Nella");
        Cat.Print();
    }
}