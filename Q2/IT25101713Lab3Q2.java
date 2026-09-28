import java.util.Scanner;
	public class IT25101713Lab3Q2B{
		public static void main (String[]args){
		Scanner pay=new Scanner(System.in);
		
		double ts,ms,oth,othr ; //ts=Total salary,ms=Monthly salary,oth=Number of ot hours,othr=Ot hourly rate
		
		System.out.print("Enter the monthly salary: ");
		
		ms=pay.nextDouble();
		
		System.out.print("Enter the number of ot hours:");
		
		oth=pay.nextDouble();
		
		System.out.print("Enter the ot  hourly rate:");
		othr=pay.nextDouble();
		ts=ms+(oth*othr);
		
		
		System.out.println("The total salary including ot is a:" +t);
		
		}
	}	