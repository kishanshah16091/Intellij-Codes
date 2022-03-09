package Class22;

public class Parent1 {
    String name = "Parent";

    void printName() {
        System.out.println(name);
    }
}

class Child1 extends Parent1 {
    String name = "Child";

    void printName() {
        String name="kishan";// first priority is given to local variables
        System.out.println(name);
        //when we use the "this" keyword even though we have a local variable java will only bring the values from
        // instance variable
        System.out.println(this.name);
        //when we use the "super" keyword even though we have a local variable and instance variable inside the same
        // class java will only bring the values from parent class instance variable
        System.out.println(super.name);
    }
}

class ParentTester {
    public static void main(String[] args) {
        Child1 child1 = new Child1();
        child1.printName();

    }

}