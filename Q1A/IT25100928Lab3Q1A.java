import java.util.Scanner;
public class IT25100928Lab3Q1A {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double price, kg, total;
		
		System.out.print("Enter price of 1kg of rice: ");
		price = input.nextDouble();
		
		System.out.print("Enter number of kilograms: ");
		kg = input.nextDouble();
		
		total = price * kg;
		
		System.out.println("Total amount = " + total);
		
		input.close();
	}
}