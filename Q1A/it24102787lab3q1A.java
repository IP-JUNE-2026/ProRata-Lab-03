
import java.util.Scanner;

public class it24102787lab3q1A {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("price of 1kg of rice: ");
		double priceperkg= Scanner.nextDouble();

		System.out.print("number of kilograms: ");
		double kilograms = Scanner.nextDouble();

		double totalamout = priceperkg*kilograms;
		
		System.out.printf("total mount pay: %.2f%n", totalamout);
	}
}
