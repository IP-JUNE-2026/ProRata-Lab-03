import java.util.Scanner;

public class IT22629180Lab3Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the monthly salary: ");
        double monthlySalary = sc.nextDouble();

        System.out.print("Enter the number of OT hours: ");
        double otHours = sc.nextDouble();

        System.out.print("Enter the OT hourly rate: ");
        double otHourlyRate = sc.nextDouble();

        double otAmount = otHours * otHourlyRate;
        double totalSalary = monthlySalary + otAmount;

        System.out.println();
        System.out.println("The total salary including OT is: " + totalSalary);
    }
}
