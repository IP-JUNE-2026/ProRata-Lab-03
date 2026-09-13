import java.util.Scanner;

public class IT25100113Lab3Q4 {
	public static void main(String[] args){
		
		//Create scanner class called value
		Scanner value = new Scanner(System.in);
		
		//Declare variables
		int number, number1, number2, number3, number4, number5;
		
		//Take user input
		System.out.print("Enter a five-digit number: ");
		number = value.nextInt();
		
		number1 = number / 10000;
		number = number % 10000;
		
		number2 = number / 1000;
		number = number % 1000;
		
		number3 = number / 100;
		number = number % 100;
		
		number4 = number / 10;
		number = number % 10;
		
		number5 = number / 1;
		number = number % 1;
		
		
		System.out.print(number1 + " ");
		System.out.print(number2 + " ");
		System.out.print(number3 + " ");
		System.out.print(number4 + " ");
		System.out.print(number5 + " ");
		
	}
}