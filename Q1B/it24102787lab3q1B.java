import java.util.Scanner;

 	public class it24102787lab3q1B {
	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);

		System.out.print("price of 1kg of rice: ");
		double priceperkg= Scanner.nextDouble();

		System.out.print("number of kilograms: ");
		double kilograms = Scanner.nextDouble();

		double totalamount = priceperkg*kilograms;
		double discount = totalamount*0.10;
		double afterdiscount = totalamount-discount;
		 
		
		System.out.printf("totalamount pay: %.2f%n", totalamount);
	}
}
