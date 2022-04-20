package Class33;

public class ExceptionDemo4 {
    public static void main(String[] args) {
        try {
            System.out.println("1");
            System.out.println("10/0");
            System.out.println("2");
        } catch (ArithmeticException e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
        }
        System.out.println("0");
    }
}