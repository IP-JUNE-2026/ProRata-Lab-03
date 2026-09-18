import java.util.Scanner;

public class IT24104018Lab3Q1B {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the price of 1kg of rice: ");
        double price = input.nextDouble();

        System.out.print("Enter the number of kilograms: ");
        double kilograms = input.nextDouble();

        // Calculate total bill
        double total = price * kilograms;

        // Calculate 10% discount
        double discount = total * 0.10;

        // Calculate final amount
        double amountToPay = total - discount;

        System.out.println("Total bill = Rs. " + total);
        System.out.println("Discount = Rs. " + discount);
        System.out.println("Amount to pay = Rs. " + amountToPay);

        input.close();
    }
}