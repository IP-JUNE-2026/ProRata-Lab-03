import java.util.Scanner;
public class IT24100061Lab3Q2 {
    public static void main (String[] args) {
	   
	    double monthlySalary, otAmount, totalSalary, otHourlyRate;
		int otHours;
		
		Scanner value = new Scanner(System.in);
		
		System.out.println("Enter the monthly salary:");
		monthlySalary = value.nextDouble();
		
		System.out.println("Enter the number of OT hours:");
		otHours = value.nextInt();
		
		System.out.println("Enter the OT hourly rate:");
		otHourlyRate = value.nextDouble();
		
		otAmount = otHourlyRate*otHours;
		totalSalary = otAmount+monthlySalary;
		
		System.out.println("The total salary including OT is:" + totalSalary);
	   }
    }
	