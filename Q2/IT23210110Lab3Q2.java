import java.util.Scanner;

public class IT23210110Lab3Q2{
              public static void main(String[] args){
			  Scanner sc = new Scanner(System.in);
			  
			  System.out.println("Enter monthly salary :");
			  int salary = sc.nextInt();
			  
			  System.out.println("Enter the number of OT hours :");
			  int otHours = sc.nextInt();
			  
			  System.out.println("Enter OT hourly rate :");
			  int rate = sc.nextInt();
			  
			  double otAmount = otHours * rate;
			  double totalSalary = salary + otAmount;
			  
			  System.out.println("Total Salary including OT is :" +totalSalary);
			
			  
			  
			  }
			  }