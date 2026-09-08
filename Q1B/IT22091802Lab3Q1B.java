import java.util.Scanner;

public class IT22091802Lab3Q1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the price of 1kg of rice: ");
        double price = scanner.nextDouble();
        System.out.print("Enter the number of kilograms you want to buy: ");
        double kg = scanner.nextDouble();
        double total = price * kg;
        double finalAmount = total - (total * 0.10);
        System.out.println("The total amount with 10% discount is: " + finalAmount);
    }
}