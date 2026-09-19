import java.util.Scanner;

public class IT25101389Lab3Q1A{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the price of 1kg rice: ");
		double price = input.nextDouble();
		
		System.out.println("Enter the number of kilograms you want to buy: ");
		double kg = input.nextDouble();
		
		double total = price * kg;
		System.out.println("THe total amount is: " + total);
	}
}