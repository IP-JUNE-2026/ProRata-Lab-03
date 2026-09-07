import java.util.Scanner;
public class IT22921130Lab3Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Monthly Salary: ");
        double salary = input.nextDouble();
        System.out.print("OT Hours: ");
        double otHours = input.nextDouble();
        System.out.print("OT Hourly Rate: ");
        double otRate = input.nextDouble();
        double otAmount = otHours * otRate;
        double totalSalary = salary + otAmount;
        System.out.println("Total Salary = " + totalSalary);
		input.close();
    }
}