import java.util.Scanner;
public class IT24100061Lab3Q1B {
   public static void main (String[] args) {
       
	   double perPrice, totalAmount, discount, finalAmount;
	   int kilograms;
	   
	   Scanner input = new Scanner(System.in);

	   System.out.println("Enter the price of 1kg of rice:");
	   perPrice = input.nextDouble();
	   
	   System.out.println("Enter the number of kilograms you want to buy:");
	   kilograms = input.nextInt();
	   
	   totalAmount = perPrice*kilograms;
	   discount = totalAmount*0.10;
	   finalAmount = totalAmount-discount;
	   
	   System.out.println("The total amount with 10% discount is:" + finalAmount);
	   }
	}
	