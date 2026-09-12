import java.util.Scanner;
public class IT24101871Lab3Q2 {

      public static void main(String[] args){
    		Scanner input= new Scanner (System.in);

	System.out.print("Enter the monthly salary:");
		double salary=input.nextDouble();
		System.out.print("Enter the number of OT hours:");
		int hours=input.nextInt();
	System.out.print("Enter the OT hourly rate:");
		double rate=input.nextDouble();
		double otAmount=hours*rate;
		double totalSalary=salary+otAmount;
	System.out.println("The total salary including OT is:"+totalSalary);

	}

}