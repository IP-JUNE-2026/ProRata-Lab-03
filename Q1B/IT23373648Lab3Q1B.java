import java.util.Scanner;

public class IT23373648Lab3Q1B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double price;
        double kilograms;
        double amount;
        double discount;
        double finalAmount;

        System.out.print("Enter price of 1kg of rice: ");
        price = input.nextDouble();

        System.out.print("Enter number of kilograms: ");
        kilograms = input.nextDouble();

        amount = price * kilograms;

        discount = amount * 10 / 100;

        finalAmount = amount - discount;

        System.out.println("Amount to pay after 10% discount = " + finalAmount);
    }
}