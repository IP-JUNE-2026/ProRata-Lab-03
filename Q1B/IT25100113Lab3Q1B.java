import java.util.Scanner;

public class IT25100113Lab3Q1B {
	public static void main(String[] args){
		
		//Create scanner class called value
		Scanner value = new Scanner(System.in);
		
		//Declare variables
		double price_of_1kg, no_of_kg,total,discount, total_amount;
		
		//Take first user input
		System.out.print ("Enter the price of 1kg: ");
		price_of_1kg = value.nextDouble();
		
		//Take next user input
		System.out.print ("Enter the number of kilograms you want to buy: ");
		no_of_kg = value.nextDouble();
		
		total = price_of_1kg * no_of_kg;
		discount = (total * 10) / 100;
		total_amount = total - discount;
		
		System.out.print ("The total amount with 10% discount is: " + total_amount);
    }	
}