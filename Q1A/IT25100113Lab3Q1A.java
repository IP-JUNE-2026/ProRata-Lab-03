import java.util.Scanner;

public class IT25100113Lab3Q1A {
	public static void main(String[] args) {
		
		//Create a scanner object called scanner
		Scanner scanner = new Scanner(System.in);
		
		//Declare variables
		double price_of_1kg, no_of_kg, total_amount; 
		
		//Take first user input
		System.out.print("Enter the price of 1kg of rice: ");
		price_of_1kg = scanner.nextDouble();
		
		//Take other user input
		System.out.print("Enter the number of kilograms you want to buy: ");
		no_of_kg = scanner.nextDouble();
		
		total_amount = price_of_1kg * no_of_kg;
		
		System.out.print("The total amount is: " + total_amount);
		
	}
}
