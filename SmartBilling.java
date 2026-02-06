import java.util.Scanner;

public class SmartBilling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter item price: ");
        double price = sc.nextDouble();

        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();

        double total = price * qty;
        double discount = 0;

        if (total >= 5000) {
            discount = total * 0.10;
        } else if (total >= 2000) {
            discount = total * 0.05;
        }

        double discountedAmount = total - discount;
        double gst = discountedAmount * 0.18;
        double finalAmount = discountedAmount + gst;

        System.out.println("Total Bill: " + total);
        System.out.println("Discount: " + discount);
        System.out.println("GST (18%): " + gst);
        System.out.println("Final Payable Amount: " + finalAmount);
    }
}
