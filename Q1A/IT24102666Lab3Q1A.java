import java.util.Scanner;
public class IT24102666Lab3Q1A {
	public static void main(String[] args) {
		double priceOf1KG;
		double kg_amount;
		double payAmount;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Price of 1KG: ");
		priceOf1KG = scanner.nextDouble();

		System.out.println("Enter Amount of Kilograms: ");
		kg_amount = scanner.nextDouble();

		payAmount = kg_amount*priceOf1KG;

		System.out.println("Total Amount is: " + payAmount);

		scanner.close();

		}
}