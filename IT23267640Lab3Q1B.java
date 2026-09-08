import java.util.Scanner;

public class IT23267640Lab3Q1B{
	
	public static void main(String[]args){
		
		//declare variable
		double price , nkg, uprice , dp ;
		
		//creating a scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking user input
		System.out.println("enter the price of 1 kilograms rice");
		uprice = sc.nextDouble();
		System.out.println("enter the kilograms you want");
		nkg = sc.nextDouble();
		
		//calculation
		price = uprice*nkg;
		dp =price - ((price/100)*10);
		
		
		//display price of kilogs
		System.out.println("price is : " + price );
		System.out.println("you discounted price is : " + dp );
		
		
	}
}
