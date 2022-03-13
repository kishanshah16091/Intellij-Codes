package Class23;

public class Task3 {
//Create 1 class with a private method that has 3 overloaded forms. Then call each overloaded method with
// specific arguments and observe result.
private static void method(String name) {
    System.out.println("1");
}

    private static void method(boolean bo) {
        System.out.println("2");
    }

    private static void method(int number) {
        System.out.println("3");

    }

    public static void main(String[] args) {
        method(true);
        method(7);
        method("Kishan");
    }
}

