import java.util.Scanner;

public class IT25100113Lab3Q2 {
	public static void main(String[] args){
		
		//Create scanner class called value
		Scanner value = new Scanner(System.in);
		
		//Declare variables
		double monthly_salary, OT_hours, OT_hourly_rate, OT_amount, total_salary;

		//Take first user input
		System.out.print("Enter the monthly salary: ");
		monthly_salary = value.nextDouble();
		
		//Take next user input
		System.out.print("Enter the number of OT hours: ");
		OT_hours = value.nextDouble();
		
		//Take next user input
		System.out.print("Enter the OT hourly rate: ");
		OT_hourly_rate = value.nextDouble();
		
		OT_amount = OT_hours * OT_hourly_rate;
		total_salary = monthly_salary + OT_amount;
		
		System.out.print("The total salary including OT is: " + total_salary);
			
	}
}	