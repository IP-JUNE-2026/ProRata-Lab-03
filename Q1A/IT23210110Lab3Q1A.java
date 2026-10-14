import java.util.Scanner;

public class IT23210110Lab3Q1A{
       public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter price of 1kg of rice :");
		double price = sc.nextDouble();
		
		System.out.println("Enter number of kilograms you want to buy :");
		int quantity  = sc.nextInt();
		
		double totalAmount = price * quantity;
		
		System.out.println("Total Amount :" +totalAmount);
		
		
		
	   
	   }
	   }