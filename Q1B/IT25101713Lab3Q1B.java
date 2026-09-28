import java.util.Scanner;
	public class IT25101713Lab3Q1B{
		public static void main (String[]args){
		Scanner pay=new Scanner(System.in);
		
		double p,nkg,t,dis; //p=Price,,nkg=Number of kilograms,t=Total,dis=Total amount with discount
		
		System.out.print("Enter the price of 1kg of rice: ");
		
		p=pay.nextDouble();
		
		System.out.print("Enter the number of kilograms you want to buy:");
		
		nkg=pay.nextDouble();
		
		t=p*nkg;
		dis=t*90/100;
		
		System.out.println("The total amount:" +t);
		
		}
	}	