import java.util.Scanner;

public class IT22921130Lab3Q1A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("1kg rice price: ");
        double price = input.nextDouble();

        System.out.print("Number of kilograms: ");
        double kg = input.nextDouble();

        double total = price * kg;

        System.out.println("Total amount = " + total);
		input.close();
    }
}