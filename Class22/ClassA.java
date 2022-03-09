package Class22;

public class ClassA {
    void method() {
        System.out.println("method from ClassA");
    }
}

class ClassB extends ClassA {
    void method() {
        System.out.println("method from ClassB");
    }

    void test() {
        method();// call the same class method
        this.method();// calls the same class method
        super.method();// calls the parents class method
    }
}

class ClassTester {
    public static void main(String[] args) {
        ClassB classB = new ClassB();
        classB.test();
    }
}