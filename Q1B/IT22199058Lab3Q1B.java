import java.util.Scanner;

public class IT22199058Lab3Q1B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the price of 1kg of rice: ");
        double pricePerKg = input.nextDouble();

        System.out.print("Enter the number of kilograms you want to buy: ");
        double kilograms = input.nextDouble();

        double totalAmount = pricePerKg * kilograms;
        double discountedAmount = totalAmount - (totalAmount * 0.10);

        System.out.println();
        System.out.println("The total amount with 10% discount is: " + discountedAmount);

    }
}