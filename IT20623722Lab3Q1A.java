import java.util.Scanner;
public class IT20623722Lab3Q1A {

 public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double  price,quantity,total;

        System.out.print("Enter the price 1KG of a rice : ");
        price = input.nextDouble();

        System.out.print("How many kilograms are you want to buy : ");
        quantity = input.nextDouble();

        total = price * quantity;
		
		
			System.out.println("The total amount is :  "+ total);
			
    }
}

