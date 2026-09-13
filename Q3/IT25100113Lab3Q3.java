import java.util.Scanner;

public class IT25100113Lab3Q3 {
	public static void main(String[] args){
		
		//Create scanner class called value
		Scanner value = new Scanner(System.in);
		
		//Declare variables
		int amount, num5000, num1000, num500, num200, num100, num50, num20, num10, num5, num2, num1;
		
		//Take user input
		System.out.print("Enter the rupee amount: ");
		amount = value.nextInt();
		
		num5000 = amount / 5000;
		amount = amount % 5000;
	
		num1000 = amount / 1000;
		amount = amount % 1000;

		num500 = amount / 500;
		amount = amount % 500;

		
		num200 = amount / 200;
		amount = amount % 200;

		num100 = amount / 100;
		amount = amount % 100;

		num50 = amount / 50;
		amount = amount % 50;

		num20 = amount / 20;
		amount = amount % 20;

	        num10 = amount / 10;
		amount = amount % 10;

		num5 = amount / 05;
		amount = amount % 05;

		num2 = amount / 02;
		amount = amount % 02;

		num1 = amount / 01;
		amount = amount % 01;
		
		
		System.out.println ("5000 Notes - " + num5000);
		System.out.println ("1000 Notes - " + num1000);
		System.out.println ("500  Notes - " + num500);
		System.out.println ("200  Notes - " + num200);
		System.out.println ("100  Notes - " + num100);
		System.out.println ("50   Notes - " + num50);
		System.out.println ("20   Notes - " + num20);
		System.out.println ("10   coins - " + num10);
		System.out.println ("05   coins - " + num5);
		System.out.println ("02   coins - " + num2);
		System.out.println ("01   coins - " + num1);
		
		
	}
}
