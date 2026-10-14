import java.util.Scanner;

public class Lab03Q1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double calculation;

        System.out.print("Enter the price of 1kg of Rice : ");
        double Price = input.nextDouble();

        System.out.print("Enter the number of kg you want to buy : ");
        double Qty = input.nextDouble();

        calculation = Price*Qty;

        System.out.println("TotalAmount : " + calculation);
        
    }
}