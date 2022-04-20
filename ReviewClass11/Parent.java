package ReviewClass11;

public class Parent {
    public void method1() {
        System.out.println("I like mangoes");
    }

    public void method2() {
        System.out.println("Hello world");
    }
}

class Child extends Parent {
    public void method1() {
        System.out.println("I like apples");
    }

}

class Test {
    public static void main(String[] args) {
        Child child = new Child();
        child.method1();
        child.method2();
    }
}

