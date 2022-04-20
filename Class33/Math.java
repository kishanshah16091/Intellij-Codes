package Class33;

public class Math {
    void add(int a, int b) {
        System.out.println(a + b);
    }

    void divide(int a, int b) {
       /* if (b != 0) {
            System.out.println(a / b);
        } else {
            System.out.println("you are trying to divide by zero which is not possible")
    }*/

        try {
            System.out.println(a / b);
        } catch (ArithmeticException are) {
            System.out.println("you are trying to divide by zero which is not possible "+ are.getMessage());
        } catch (NullPointerException npe) {
            System.out.println("Please initialize the object to avoid this exception");
        }

    }

}