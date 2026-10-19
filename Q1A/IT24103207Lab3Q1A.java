import java.util.Scanner;

public class IT24103207Lab3Q1A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the price of 1kg of rice: ");
        double price = sc.nextDouble();
        System.out.print("Enter the number of kilograms: ");
        double kg = sc.nextDouble();
        double amount = price * kg;
        System.out.println("Amount to pay: Rs. " + amount);
    }
}
