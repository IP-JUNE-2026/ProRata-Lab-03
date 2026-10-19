import java.util.Scanner;

public class IT24103207Lab3Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter monthly salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter number of OT hours: ");
        double otHours = sc.nextDouble();
        System.out.print("Enter OT hourly rate: ");
        double otRate = sc.nextDouble();
        double otAmount = otHours * otRate;
        double totalSalary = salary + otAmount;
        System.out.println("OT Amount: " + otAmount);
        System.out.println("Total Salary: " + totalSalary);
    }
}
