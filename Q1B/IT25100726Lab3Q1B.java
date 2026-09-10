import java.util.Scanner;

public class IT25100726Lab3Q1B {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // Input: Price of 1kg of rice
        System.out.print("Enter the price of 1kg of rice: ");
        double pricePerKg = input.nextDouble();

        // Input: Number of kilograms
        System.out.print("Enter the number of kilograms you want to buy: ");
        double quantity = input.nextDouble();

        // Calculate the total amount
        double totalAmount = pricePerKg * quantity;

        // Calculate the discount
        double discount = totalAmount * 0.10;

        // Calculate final amount to pay
        double finalAmount = totalAmount - discount;

        // Display the result
        System.out.println("\nThe total amount with 10% discount is: " + finalAmount);
        
        
      
    }
}