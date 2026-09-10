import java.util.Scanner;

public class IT25100726Lab3Q2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // Input: Monthly Salary
        System.out.print("Enter the monthly salary: ");
        double monthlySalary = input.nextDouble();

        // Input: Number of OT hours
        System.out.print("Enter the number of OT hours: ");
        double otHours = input.nextDouble();

        // Input: OT hourly rate
        System.out.print("Enter the OT hourly rate: ");
        double otRate = input.nextDouble();

        // Calculate OT Amount
        double otAmount = otHours * otRate;

        // Calculate Total Salary
        double totalSalary = monthlySalary + otAmount;

        // Display the final result
        System.out.println("\nThe total salary including OT is: " + totalSalary);

        
 
    }
}