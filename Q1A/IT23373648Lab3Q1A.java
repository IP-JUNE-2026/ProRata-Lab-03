import java.util.Scanner;

public class IT23373648Lab3Q1A{
 public static void main (String[]args){
  Scanner input = new Scanner(System.in);
  
  double price;
  double kilograms;
  double amount;
  
  System.out.print("Enter price of 1kg of rice: ");
  price = input.nextDouble();
  
  System.out.print("Enter number of kilograms:");
  kilograms = input.nextDouble ();
  
  amount = price * kilograms;
  
  System.out.println("Amount to pay = " +amount);
 }
}