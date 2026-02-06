import java.util.Scanner;

public class ATMSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account balance: ");
        double balance = sc.nextDouble();

        System.out.print("Enter withdrawal amount: ");
        double withdraw = sc.nextDouble();

        if (withdraw % 100 == 0 && (balance - withdraw) >= 1000) {
            balance -= withdraw;
            System.out.println("Withdrawal Successful!");
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println("Transaction Failed! Check conditions.");
        }
    }
}
