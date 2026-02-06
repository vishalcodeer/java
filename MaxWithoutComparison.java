import java.util.Scanner;

public class MaxWithoutComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int diff = a - b;
        int k = (diff >> 31) & 1; // 0 if a>=b, 1 if a<b

        int max = a - k * diff;

        System.out.println("Maximum: " + max);
    }
}
