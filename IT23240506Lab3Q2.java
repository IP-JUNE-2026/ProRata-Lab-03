import java.util.Scanner;

public class IT23240506Lab3Q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the monthly salary: ");
        double basicSalary = sc.nextDouble();

        System.out.print("Enter the number of OT hours: ");
        double otHours = sc.nextDouble();

        System.out.print("Enter the OT hourly rate: ");
        double otRate = sc.nextDouble();

        double otAmount = otHours * otRate;
        double totalSalary = basicSalary + otAmount;

        System.out.println("");
        System.out.println("The total salary including OT is: " + totalSalary);

    }
}