import java.util.Scanner;

public class IT25100726Lab3Q4 {
	
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Enter five-digit number
        System.out.print("Enter a five-digit number: ");
        int number = input.nextInt();

        // Extract each digit using division and modulus
        int digit1 = number / 10000;          // Get the 1st digit
        int digit2 = (number / 1000) % 10;    // Get the 2nd digit
        int digit3 = (number / 100) % 10;     // Get the 3rd digit
        int digit4 = (number / 10) % 10;      // Get the 4th digit
        int digit5 = number % 10;             // Get the 5th digit

        // Print the digits
        System.out.println("\n" + digit1 + " " + digit2 + " " + digit3 + " " + digit4 + " " + digit5);

        
    }
}