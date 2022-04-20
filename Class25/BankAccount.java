package Class25;

public class BankAccount {
    private double balance= 1235;
    private String userName="Habib";
    private String password="Habib123";
    void printBalance (String userName, String password) {
        if (userName.equals(this.userName) && password.equals(this.password))
        {
            System.out.println("91");
        }
        else {
            System.out.println("error wrong username/password incorrect");
        }
    }

}