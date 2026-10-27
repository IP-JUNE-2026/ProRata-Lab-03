import java.util.Scanner;

public class IT22908124Lab3Q1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the price of 1kg of rice: ");
        double price = scanner.nextDouble();

        System.out.print("Enter the number of kilograms you want to buy: ");
        double kilograms = scanner.nextDouble();

        double total = price * kilograms;
        double discountedTotal = total * 0.90;

        System.out.println();
        System.out.println("The total amount with 10% discount is: " + discountedTotal);

        scanner.close();
    }
}
