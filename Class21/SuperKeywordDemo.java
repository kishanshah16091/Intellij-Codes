package Class21;

public class SuperKeywordDemo {
    public static void main(String[] args) {
        Child child = new Child();
        child.printColor();
    }
}

class GrandParent {
    String color = "Blue";
}

class Parent {
    String color = "Black";
}

class Child extends Parent {
    String color = "Red";

    void printColor() {
        String color = "Green";
        // refers to local variable
        System.out.println(color);
        // refers to instance variable
        System.out.println(this.color);
        // refers to parent variable
        System.out.println(super.color);
    }
}