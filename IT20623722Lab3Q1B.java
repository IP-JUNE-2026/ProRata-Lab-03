import java.util.Scanner;
public class IT20623722Lab3Q1B {

 public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double  price,quantity,total,afterDiscount;

        System.out.print("Enter the price 1KG of a rice : ");
        price = input.nextDouble();

        System.out.print("How many kilograms are you want to buy : ");
        quantity = input.nextDouble();

        total = price * quantity;
        afterDiscount = total-(total * 10/100);

        System.out.println("The total amount is :  "+ total);
        System.out.println("The amount you have to pay after considering the discount. :  "+ afterDiscount);
    }
}

