import java.util.Scanner;
public class IT24102666Lab3Q1B {
	public static void main(String[] args) {
		double priceOf1KG;
		double kg_amount;
		double payAmount;
		double discount;
		double afterPrice;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Price of 1KG: ");
		priceOf1KG = scanner.nextDouble();

		System.out.println("Enter Amount of Kilograms: ");
		kg_amount = scanner.nextDouble();

		payAmount = kg_amount*priceOf1KG;
		discount = payAmount*0.1;
		afterPrice = payAmount - discount;

		System.out.println("Total Amount is: " + payAmount);
		System.out.println("Total Amount with 10% discount is: " + afterPrice);

		scanner.close();

		}
}