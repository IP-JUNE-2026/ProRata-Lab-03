import java.util.Scanner;

public class IT25102116Lab3Q1A {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter price of 1kg rice: ");
        double price = input.nextDouble();

        System.out.print("Enter number of kilograms: ");
        double kilograms = input.nextDouble();

        double amount = price * kilograms;

        System.out.println("Amount to pay = " + amount);
    }
}