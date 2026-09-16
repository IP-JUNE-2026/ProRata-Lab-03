import java.util.Scanner;

public class IT26101614Lab3Q2 {
    
	  public static void main(String[] args) {
		  
		  Scanner input = new Scanner(System.in);
		  
		  System.out.println("Enter the Monthly Salary:" );
		  double MonthlySalary = input.nextDouble();
		  
		  System.out.println("Enter the number of OT Hours:" );
		  double OTHours = input.nextDouble();
		  
		  System.out.println("Enter the OT Hourly Rate:");
		  double OTHourlyRate = input.nextDouble();
		  
		  double OTAmount = OTHours * OTHourlyRate;
		  double TotalSalary = MonthlySalary + OTAmount;
		  
		  System.out.println("The total salary including OT is: " + TotalSalary );
		  
	  }	  
	  
}