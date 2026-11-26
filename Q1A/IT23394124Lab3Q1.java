import java.util.Scanner;

public class IT23394124Lab3Q1A{
   public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the price of the 1kg of Rice:");
        double price = input.nextDouble();
        
        System.out.println("Enter the number of Kilos that You want to buy:");
        double amount = input.nextDouble();

        
        double total = amount*price;
        System.out.println("Total Amount Is :"+total);


        input.close();
        
     
        }

}