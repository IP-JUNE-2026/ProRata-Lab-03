import java.util.Scanner;

public class IT25101389Lab3Q1B{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the price of 1kg of rice: ");
		double price = input.nextDouble();
		
		System.out.println("Enter the nubmer of kilograms you want to buy: ");
		double kg = input.nextDouble();
		
		double total = price * kg;
		double discounted = total * 0.9;
		
		System.out.println("The total amount with 10% discount is: " + discounted);
		
	}
}