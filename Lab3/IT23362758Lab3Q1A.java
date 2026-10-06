import java.util.Scanner;

public class IT23362758Lab3Q1A {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double price, kilos, total;
		
		System.out.print("Enter the price of 1kg of rice: " );
		price = input.nextDouble();
		
		System.out.print("Enter the number of kilograms you want to buy: ");
		kilos = input.nextDouble();
		
		total = price *kilos;
		
		System.out.println(" The total Amount is : " + total);
	}
}