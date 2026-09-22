import java.util.Scanner;

public class IT26101614Lab3Q1B {
    
	  public static void main(String[] args) {
		  
		  Scanner input = new Scanner(System.in);
		  
		    System.out.println("Enter the price of 1kg rice:");
			double price = input.nextDouble();
			
			System.out.println("Enter the number of kilograms:");
			double kilogram = input.nextDouble();
			
			double totalamount = price * kilogram;
			
			double discountpercentage = 0.10;
			double discountamount = totalamount * (discountpercentage/100);
			
			double finaltotalamount = totalamount - discountamount;
			
			System.out.println("final total amount is: " + finaltotalamount);
	  }	
			
}		   