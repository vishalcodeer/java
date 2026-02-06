import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correctUser = "admin";
        String correctPass = "1234";

        int attempts = 0;
        boolean success = false;

        while (attempts < 3) {
            System.out.print("Enter username: ");
            String user = sc.next();

            System.out.print("Enter password: ");
            String pass = sc.next();

            if (user.equals(correctUser) && pass.equals(correctPass)) {
                System.out.println("Login Successful!");
                success = true;
                break;
            } else {
                attempts++;
                System.out.println("Wrong credentials. Attempts left: " + (3 - attempts));
            }
        }

        if (!success) {
            System.out.println("Account Locked! Too many failed attempts.");
        }
    }
}
