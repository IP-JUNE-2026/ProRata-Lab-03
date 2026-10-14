import java.util.Scanner;

public class IT23210110Lab3Q1B{
      public static void main(String[] args){
	      Scanner sc = new Scanner(System.in);
		  
		  System.out.println("Enter price of 1kg of rice :");
		  int price = sc.nextInt();
		  
		  System.out.println("Enter number of kilograms you want to buy :");
		  int quantity = sc.nextInt();
		  
		  double totalAmount = price * quantity;
          double discount = totalAmount * (10.0/100);

          System.out.println("Total Amount with 10% discount is :" + (totalAmount-discount)); 
		  
		  }
		  }