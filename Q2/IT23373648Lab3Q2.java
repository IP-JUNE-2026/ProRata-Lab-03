 import java.util.Scanner;
 
 public class IT23373648Lab3Q2{
  public static void main(String[]args){
   Scanner input = new Scanner(System.in);
   
   double monthlysalary;
   double othours;
   double othourlyrate;
   double otamount;
   double totalsalary;
   
   System.out.print("Enter monthly salary : ");
   monthlysalary = input.nextDouble();
   
   System.out.print("Enter OT HOURS :");
   othours = input.nextDouble();
   
   System.out.print("Enter OT HOURS Rate :");
   othourlyrate = input.nextDouble();
   
   otamount = othours * othourlyrate;
   
   totalsalary = monthlysalary + otamount;
   
   System.out.println("OT Amount = " +otamount);
   System.out.println("Total salary = " +totalsalary);
   }
 }