import java.util.Scanner;

public class MultiplyBySeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int x = sc.nextInt();

        int result = (x << 3) - x;

        System.out.println("Result: " + result);
    }
}
