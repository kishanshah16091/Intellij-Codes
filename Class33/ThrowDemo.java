package Class33;

public class ThrowDemo {
    public static void main(String[] args) {
        Account account = new Account();
        try {
            account.setBalance(-15);

        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}