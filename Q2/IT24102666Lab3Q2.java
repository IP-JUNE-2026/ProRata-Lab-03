import java.util.Scanner;
public class IT24102666Lab3Q2 {
	public static void main(String[] args) {
		double monthlySalary;
		int ot_Hours;
		double ot_HourlyAmount;
		double totalSalary;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the monthly Salary: ");
		monthlySalary = scanner.nextDouble();
		
		System.out.println("Enter Number of OT Hours: ");
		ot_Hours = scanner.nextInt();

		System.out.println("Enter OT hourly rate: ");
		ot_HourlyAmount = scanner.nextDouble();

		totalSalary = monthlySalary + (ot_Hours*ot_HourlyAmount);

		System.out.println("Total Salary including OT is: " + totalSalary);

		scanner.close();

		}
}