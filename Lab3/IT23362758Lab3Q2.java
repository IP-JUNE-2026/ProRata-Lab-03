import java.util.Scanner;

public class IT23362758Lab3Q2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double monthlySalary;
        double otHours;
        double otRate;
        double otAmount;
        double totalSalary;

        System.out.print("Enter the monthly salary: ");
        monthlySalary = input.nextDouble();

        System.out.print("Enter the number of OT hours: ");
        otHours = input.nextDouble();

        System.out.print("Enter the OT hourly rate: ");
        otRate = input.nextDouble();

        otAmount = otHours * otRate;
        totalSalary = monthlySalary + otAmount;

        System.out.println("The total salary including OT is: " + totalSalary);
    }
}
		