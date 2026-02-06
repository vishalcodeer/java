import java.util.Scanner;

public class SubtractWithoutMinus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers (a b): ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int negB = ~b + 1;

        while (negB != 0) {
            int carry = (a & negB) << 1;
            a = a ^ negB;
            negB = carry;
        }

        System.out.println("Result: " + a);
    }
}
