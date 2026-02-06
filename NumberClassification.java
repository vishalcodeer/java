import java.util.Scanner;

public class NumberClassification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        if (num >= 0)
            System.out.println("Positive Number");
        else
            System.out.println("Negative Number");

        if (num % 2 == 0)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");

        if (num % 5 == 0 && num % 7 == 0)
            System.out.println("Divisible by both 5 and 7");
        else
            System.out.println("Not divisible by both 5 and 7");
    }
}
