import java.util.Scanner;        

public class IT24103024Lab3Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  

        System.out.print("Enter the price of 1kg of rice: ");
        double pricePerKg = input.nextDouble();
        System.out.print("Enter the number of kilograms you want to buy: ");
        double kg = input.nextDouble();

        double total = pricePerKg * kg;

        System.out.println();
        System.out.println("The total amount is: " + total);		

        int number = input.nextInt();       
        double price = input.nextDouble();  
        float f = input.nextFloat();        
        char grade = input.next().charAt(0);
        String name = input.next();         
        String line = input.nextLine();      
		
    }
}