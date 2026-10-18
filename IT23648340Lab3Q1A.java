import java.util.Scanner;

public class  IT23648340Lab3Q1A {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

      
        System.out.print("Enter price of 1kg of rice: ");
        double pricePerKg = input.nextDouble();

       
        System.out.print("Enter number of kilograms: ");
        double kg = input.nextDouble();

      
        double totalAmount = pricePerKg * kg;

        System.out.println("Total amount to pay: " + totalAmount);

        input.close();
    }
}