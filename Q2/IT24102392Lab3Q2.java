import java.util.Scanner;
public class IT24102392Lab3Q2
{
	public static void main (String [] args)
	{
		Scanner input = new Scanner(System.in);
		  
		   float salary;
		   float ot_hour;
		   float ot_rate;
		   float ot_amount;
		   float total_salary;
		   
		   System.out.print("Enter the monthly salary : ");
		   salary=input.nextFloat();
		   
		   System.out.print("Enter the number of OT hours : ");
		   ot_hour=input.nextFloat();
		   
		   System.out.print("Enter the OT hourly rate: ");
		   ot_rate=input.nextFloat();
		   
		   ot_amount = ot_hour * ot_rate;
		   total_salary = salary + ot_amount;
		   
		   System.out.print("The total salary including OT is :" +total_salary);
		   
	}	   
}		