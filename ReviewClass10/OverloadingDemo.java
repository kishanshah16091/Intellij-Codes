package ReviewClass10;

public class OverloadingDemo {
    void add(int a, int b) {
        System.out.println(a + b);
        System.out.println("1");
    }

    static void add(double a, int b) {
        System.out.println(a + b);
        System.out.println("2");

    }

    static void add(double a, double b) {
        System.out.println(a + b);
        System.out.println("3");
    }

    public static void main(String[] args) {
        add(10.1,10);
    }
}