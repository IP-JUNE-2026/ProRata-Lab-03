import java.util.Scanner;

public class IT23240506Lab3Q1B {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the price of 1kg of rice: ");
        double price = sc.nextDouble();

        System.out.print("Enter the number of kilograms you want to buy: ");
        double qty = sc.nextDouble();

        double total = price * qty;
        double finalAmount = total * 0.9;

        System.out.println("");
        System.out.println("The total amount with 10% discount is: " + finalAmount);

    }
}