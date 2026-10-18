import java.util.Scanner;

public class IT25100928Lab3Q1B {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double price, kg, total, discount, amount;
		
		System.out.print("Enter price of 1kg of rice: ");
		price = input.nextDouble();
		
		System.out.print("Enter number of kilograms you want to buy: ");
		kg = input.nextDouble();
		
		total = price * kg * 0.9;
		
		
		System.out.println();
		System.out.println("The total amount with 10% discount is: " + total);
		
		input.close();
	}

}