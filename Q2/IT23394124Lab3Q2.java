import java.util.Scanner;

public class IT23394124Lab3Q2{
   public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter The monthly Salary:");
        double Salary = input.nextDouble();
        
        System.out.println("Enter the number of OT Hours:");
        double OTHours = input.nextDouble();
        
        System.out.println("Enter the number of OT Hours:");
        double OTHourlyRate = input.nextDouble();

        
        Double OTAmount = OTHours * OTHourlyRate;
        Double Total  = Salary + OTAmount;


        
        System.out.println("Total Salary Including OT is :"+ Total);


        input.close();
        
     
        }

}