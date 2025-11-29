import java.util.Scanner;

public class JavaOverview_Ex3_ProductTax {
    static void main() {
        String productName;
        int quantity;
        double price;
        final double tax = 0.1;

        Scanner sc = new Scanner(System.in);


        System.out.print("Please enter the product name: ");
        productName = sc.nextLine();

        System.out.print("Please enter the product quantity: ");
        quantity = sc.nextInt();

        System.out.print("Please enter the product price: ");
        price = sc.nextDouble();

        double totalAmount = quantity * price;
        System.out.println("Product Name: " + productName);
        System.out.println("Product total amount: " + totalAmount);
        System.out.println("VAT: " + (totalAmount * tax));

    }
}
