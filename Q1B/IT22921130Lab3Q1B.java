import java.util.Scanner;
public class IT22921130Lab3Q1B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("1kg rice price: ");
        double price = input.nextDouble();
        System.out.print("Number of kilograms: ");
        double kg = input.nextDouble();
        double total = price * kg;
        double discount = total * 0.10;
        double finalAmount = total - discount;
        System.out.println("Total after 10% discount = " + finalAmount);
		input.close();
    }
}