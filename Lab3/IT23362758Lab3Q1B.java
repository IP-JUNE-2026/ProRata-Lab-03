import java.util.Scanner;

public class IT23362758Lab3Q1B
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double price, kilos;
        double total, discount, finalAmount;

        System.out.print("Enter the price of 1kg of rice: ");
        price = input.nextDouble();

        System.out.print("Enter the number of kilograms you want to buy: ");
        kilos = input.nextDouble();

        total = price * kilos;
        discount = total * 0.10;
        finalAmount = total - discount;

        System.out.println("The total amount with 10% discount is: " + finalAmount);
    }
}