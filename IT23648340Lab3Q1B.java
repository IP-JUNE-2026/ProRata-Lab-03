import java.util.Scanner;

public class  IT23648340Lab3Q1B {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter total bill amount: ");
        double total = input.nextDouble();

      
        double discount = total * 0.10;

     
        double finalAmount = total - discount;

        System.out.println("Discount: " + discount);
        System.out.println("Amount to pay: " + finalAmount);

        input.close();
    }
}