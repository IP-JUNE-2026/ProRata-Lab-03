import java.util.Scanner;
  public class IT24101871Lab3Q3 {

	public static void main(String[] args){

	int amount,note1;
	Scanner x = new Scanner(System.in);

	System.out.print("Enter the Rupee amount : ");
	amount= x.nextInt();
	note1 = amount/5000;
	System.out.println("Number of 5000 Notes - " +note1);
	amount = amount%5000;
	note1 = amount/1000;
	System.out.println("Number of 1000 Notes - " +note1);
	amount = amount%1000;
	note1 = amount/500;
	System.out.println("Number of 500 Notes - " +note1);
	amount = amount%500;
	note1 = amount/200;
	System.out.println("Number of 200 Notes - " +note1);
	amount = amount%200;
	note1 = amount/100;
	System.out.println("Number of 100 Notes - " +note1);
	amount = amount%100;
	note1 = amount/50;
	System.out.println("Number of 50 Notes - " +note1);
	amount = amount%50;
	note1 = amount/20;
	System.out.println("Number of 20 Notes - " +note1);
	amount = amount%20;
	note1 = amount/10;
	System.out.println("Number of 10 Coins - " +note1);
	amount = amount%10;
	note1 = amount/05;
	System.out.println("Number of 05 Coins - " +note1);
	amount = amount%05;
	note1 = amount/02;
	System.out.println("Number of 02 Coins - " +note1);
	amount = amount%02;
	note1 = amount/01;
	System.out.println("Number of 01 Coins - " +note1);
	amount = amount%01;
	}
}	