import java.util.Scanner;
    public class IT26101614Lab3Q4 {
		public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a five digit number: ");
		int number = input.nextInt();
		
		int digit1 = number / 10000;
        int digit2 = (number / 1000) % 5;
        int digit3 = (number / 100) % 5;
        int digit4 = (number / 10) % 5;
        int digit5 = number % 5;

        System.out.println(digit1 + " " + digit2 + " " + digit3 + " " + digit4 + " " + digit5);

		
		}
	}		
	