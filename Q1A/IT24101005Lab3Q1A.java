import java.util.Scanner;

public class IT24101005Lab3Q1A{
	
	public static void main(String[]args){
		
		//declare variable
		double price , nkg, uprice;
		
		//creating a scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking user input
		System.out.print("Enter the price of 1 kilograms rice :");
		uprice = sc.nextDouble();
		System.out.print("Enter the kilograms you want :");
		nkg = sc.nextDouble();
		
		//calculation
		price = uprice*nkg;
		
		
		//display price of kilogs
		System.out.println("The Total amount is : " + price );
		
		
	}
}
