import java.util.Scanner;

public class IT20623722Lab3Q2 {
  public static void main(String[] args) {
    double monthlySalary;
	double otHours;
	double otHourlyRate;
	double OtAmount;
	double totalSalary;
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter the monthly salary: ");
	monthlySalary = input.nextDouble();
	
	System.out.print("Enter the number of OT hours: ");
	otHours = input.nextDouble();
	
	System.out.print("Enter the OT houry rate: ");
	otHourlyRate = input.nextDouble();
	
	OtAmount = otHours * otHourlyRate;
	totalSalary = monthlySalary + OtAmount;
	
	System.out.println();
	System.out.println("The total salary including OT is: " +totalSalary);
  
  }
}