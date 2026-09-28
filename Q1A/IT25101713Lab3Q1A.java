import java.util.Scanner;
	
	public class IT25101713Lab3Q1A{
		
		
		public static void main (String[]args){
		Scanner pay = new Scanner(System.in);
		
		double p,nkg,t; //p=price,nkg=number of kilograms,t=Total
		
		System.out.print("Enter the price of 1kg of rice: ");
		
		p=pay.nextDouble();
		
		System.out.print("Enter the number of kilograms you want to buy:");
		
		nkg=pay.nextDouble();
		
		t=p*nkg;
		System.out.println("The total amount:"+t);
		
		}
	}	