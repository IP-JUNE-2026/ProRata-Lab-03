import java.util.Scanner;

public class IT24100150Lab3Q1B{
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the price of 1kg of rice: ");
		double price = scanner.nextDouble();
		
		System.out.print("Enter the number of kilograms you want to buy: ");
		double kilograms = scanner.nextDouble();
		
		System.out.println();
		
		double totalAmount = (price * kilograms);
		
		double discount = totalAmount * 0.1;
		
		double totalAmountWithDiscount = totalAmount - discount;
		
		System.out.println("The total amount with 10% discount is: " + totalAmountWithDiscount);
		
	}
}