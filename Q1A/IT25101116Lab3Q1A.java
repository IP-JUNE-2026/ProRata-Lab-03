import java.util.Scanner;

public class IT26101614Lab3Q1A {
    
	  public static void main(String[] args) {
		  
		  Scanner input = new Scanner(System.in);
		  
		    System.out.println("Enter the price of 1kg rice:");
			double price = input.nextDouble();
			
			System.out.println("Enter the number of kilograms:");
			double kilogram = input.nextDouble();
			
			double totalamount = price * kilogram;
			
			System.out.println("total amount is: " + totalamount);
			
	  }	
			
}		