import java.util.Scanner;

public class IT24101005Lab3Q1B{
	
	public static void main(String[]args){
		
		//declare variable
		double price , nkg, uprice , dp ;
		
		//creating a scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking user input
		System.out.print("Enter the price of 1 kilograms rice :");
		uprice = sc.nextDouble();
		System.out.print("Enter the number of kilograms you want to buy :");
		nkg = sc.nextDouble();
		
		//calculation
		price = uprice*nkg;
		dp =price - ((price/100)*10);
		
		
		//display price of kilogs
		System.out.println("price is : " + price );
		System.out.println("The total amount with 10% discount is : " + dp );
		
		
	}
}
