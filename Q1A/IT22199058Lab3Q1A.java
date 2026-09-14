import java.util.Scanner;

public class IT22199058Lab3Q1A {
  public static void main(String[] args) {
    double price;
	double noOfKilograms;
	double totalAmount;
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter the price of 1kg of rice: ");
	price = input.nextDouble();
	
	System.out.print("Enter the number of kilograms you want to buy: ");
	noOfKilograms = input.nextDouble();
	
	totalAmount = price * noOfKilograms;
	
	System.out.println();
	System.out.print("The total amount is: " +totalAmount);
	
  }
}