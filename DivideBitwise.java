import java.util.Scanner;

public class DivideBitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dividend and divisor: ");
        int dividend = sc.nextInt();
        int divisor = sc.nextInt();

        boolean negative = (dividend < 0) ^ (divisor < 0);
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        int quotient = 0;

        for (int i = 31; i >= 0; i--) {
            if ((dividend >> i) >= divisor) {
                dividend -= (divisor << i);
                quotient |= (1 << i);
            }
        }

        if (negative) quotient = -quotient;

        System.out.println("Quotient: " + quotient);
    }
}
