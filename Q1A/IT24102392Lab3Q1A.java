import java.util.Scanner;
public class IT24102392Lab3Q1A
{
	public static void main(String [] args)
	{
		Scanner input= new Scanner(System.in);
		
		float price;
		float kg;
		float amount;
		
		System.out.print("Enter the price of 1kg of price : ");
		price=input.nextFloat();
		
		System.out.print("Enter the number of kilograms you want to buy : ");
		kg=input.nextFloat();
		
		amount=price*kg;
		
		System.out.print("total amount is : "+ amount);
	}
}	