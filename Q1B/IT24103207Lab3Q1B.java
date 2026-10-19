import java.util.Scanner;

public class IT24103207Lab3Q1B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the price of 1kg of rice: ");
        double price = sc.nextDouble();
        System.out.print("Enter the number of kilograms: ");
        double kg = sc.nextDouble();
        double total = price * kg;
        double discount = total * 10 / 100;
        double amount = total - discount;
        System.out.println("Total bill: Rs. " + total);
        System.out.println("Discount (10%): Rs. " + discount);
        System.out.println("Amount to pay: Rs. " + amount);
    }
}
