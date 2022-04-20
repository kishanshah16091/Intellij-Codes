package ProjectTask;

import java.util.Scanner;

public class Registration {


    /*
         Create Registration Class in which you would have variables as
          email, userName and password that have an access scope only within its own class.
          After creating an object of the class
          user should be able to call methods
          and in each method separately pass values to set users email, username and password.
     Valid email consider to be only yahoo
     Valid userName and password cannot be empty and should be of length larger than 6 characters.
      Also, valid password cannot contain userName.
          */
    public static void main(String[] args) {
        UserData myPassword = new UserData();
        myPassword.getInfo();
    }
}

class UserData {
    private static String userName;
    private static String email;
    private static String password;
    private static char c;
    private static boolean num = false;
    private static boolean hasUpper = false;
    private static boolean hasLower = false;
    private static boolean hasEmail = false;
    private static boolean hasLength = false;

    public static void getInfo() {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter User Name: ");
        userName = x.nextLine();
        System.out.print("Enter your Email:  ");
        email = x.nextLine();
        System.out.print("Enter your valid password:  ");
        password = x.nextLine();
        System.out.print(myPassword(password));
    }

    public static String myPassword(String password) {
        for (int i = 0; i < password.length(); i++) {
            c = password.charAt(i);
            if (password.length() > 8) {
                hasLength = true;
            }
            if (Character.isUpperCase(c)) {
                hasUpper = true;
            }
            if (Character.isLowerCase(c)) {
                hasLower = true;
            }
            if (Character.isDigit(c)) {
                num = true;
            }
            if (email.charAt(0) != '@' && email.contains("@") && email.endsWith(".com")) {
                hasEmail = true;
            }
        }
        if (hasLength && hasUpper && hasLower && hasEmail && num) {
            return "You have Strong User";
        }
        return "Your password must contain at least 8 characters\n at least 1 upper and Lower case Character\n your have valid email entered ";
    }

}

