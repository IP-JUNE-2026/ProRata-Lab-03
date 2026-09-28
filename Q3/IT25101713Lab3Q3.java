import java.util.Scanner;
public class IT25101713Lab3Q3{
	public static void main(String[]args){
		Scanner notes=New Scanner(System.in);
		int r,a,no5000,no1000,no500,no100,no50,no20,no10,no05,no02,no01 //a=amount,r=remaning value
		System.out.print("Enter the rupee amount:");
			a=notes.nextlnt();
			no5000=a/5000;
			r=a%5000;
			
			
			System.out.println("5000 Notes - "+no5000);
			
			no1000 = r/1000;
			r = a%1000;
			
			System.out.println("1000 Notes - "+no1000);
			
			no500 = r/500;
			r = a%500;
			
			System.out.println("500 Notes - "+no500);
			
			no200 = r/200;
			r = a%200;
			
			System.out.println("200 Notes - "+no200);
			
			no100 = r/100;
			r = a%100;
			
			System.out.println("100 Notes - "+no100);
			
			no50 = r/50;
			r = a%50;
			
			System.out.println("50 Notes - "+no50);
			
			no20=r/20;
			r=a%20;
			
			System.out.println("20 Notes -"+no20);
			
			no10=r/10;
			r=a%10;
			
			System.out.println("10 Coins -"+no10);
			
			no05=r/5;
			r=a%5;
			
			System.out.println("05 Coins -"+no05);
			
			no02=r/2;
			r=a%2;
			
			System.out.println("02 Coins -"+no02);
			
			no01=r/1;
			r=a%1;
			
			System.out.println("01 Coins-"+no01);
			
			
	}
	
}
			

