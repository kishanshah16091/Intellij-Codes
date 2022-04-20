package Class33;

public class ExceptionDemoPartOf3 {
    public static void main(String[] args) {
        System.out.println("0");
        try {
            System.out.println(10 / 0);
            System.out.println("1");
            //throw new RuntimeException();
        } catch (ArithmeticException arithmeticException) {
            System.out.println("2 " + arithmeticException.getMessage());
        } catch (Exception exception) {
            System.out.println("Something went wrong");
        } finally {
            System.out.println("6");
        }
        System.out.println("7");

        System.out.println("===================================================================");

        System.out.println("0");
        // System.out.println(10/0);
        try {
            System.out.println(10 / 0);
            System.out.println("1");
            //throw new RuntimeException();
        } catch (ArithmeticException arithmeticException) {
            System.out.println("2");
            try {
                System.out.println(10 / 0);
            } catch (ArithmeticException ae) {

            }

        } catch (Exception exception) {
            System.out.println("Something went wrong");

        } finally {
            System.out.println("6");
        }
        System.out.println("7");
    }
}