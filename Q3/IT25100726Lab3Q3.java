import java.util.Scanner;

public class IT25100726Lab3Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Rupee amount: ");
        int amount = input.nextInt();

        // Calculate 5000 notes
        int n5000 = amount / 5000;
        amount = amount % 5000;

        // Calculate 1000 notes
        int n1000 = amount / 1000;
        amount = amount % 1000;

        // Calculate 500 notes
        int n500 = amount / 500;
        amount = amount % 500;

        // Calculate 200 notes
        int n200 = amount / 200;
        amount = amount % 200;

        // Calculate 100 notes
        int n100 = amount / 100;
        amount = amount % 100;

        // Calculate 50 notes
        int n50 = amount / 50;
        amount = amount % 50;

        // Calculate 20 notes
        int n20 = amount / 20;
        amount = amount % 20;

        // Calculate 10 coins
        int c10 = amount / 10;
        amount = amount % 10;

        // Calculate 05 coins
        int c05 = amount / 5;
        amount = amount % 5;

        // Calculate 02 coins
        int c02 = amount / 2;
        amount = amount % 2;

        // Calculate 01 coins
        int c01 = amount; // Remaining is 1s

        // Output the results
        System.out.println("\n5000 Notes - " + n5000);
        System.out.println("1000 Notes - " + n1000);
        System.out.println("500 Notes - " + n500);
        System.out.println("200 Notes - " + n200);
        System.out.println("100 Notes - " + n100);
        System.out.println("50 Notes - " + n50);
        System.out.println("20 Notes - " + n20);
        System.out.println("10 Coins - " + c10);
        System.out.println("05 Coins - " + c05);
        System.out.println("02 Coins - " + c02);
        System.out.println("01 Coins - " + c01);

       
    }
}