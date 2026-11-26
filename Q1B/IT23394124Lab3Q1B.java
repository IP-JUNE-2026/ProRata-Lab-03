import java.util.Scanner;

public class IT23394124Lab3Q1B{
   public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the price of the 1kg of Rice:");
        double price = input.nextDouble();
        
        System.out.println("Enter the number of Kilos that You want to buy:");
        double amount = input.nextDouble();

        
        double total = amount*price;

        double discount = total - (total*0.1);
        System.out.println("Total Amount Is :"+ discount);


        input.close();
        
     
        }

}