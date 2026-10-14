import java.util.Scanner;
public class IT24102392Lab3Q1B
{
	public static void main(String [] args)
	{
		Scanner input= new Scanner(System.in);
		
		float price;
		float kg;
		float amount;
		float discount;
		float TotalAmount;
	
	    System.out.print("Enter the price of 1kg of price : ");
		price=input.nextFloat();
		
		System.out.print("Enter the number of kilograms you want to buy : ");
		kg=input.nextFloat();
		
		amount=price*kg;
		discount=amount*10/100;
		TotalAmount=amount-discount;
		
		System.out.print("The total amount with 10% discount is : "+TotalAmount);
	}
}	