import java.util.Scanner;

public class IT24102392Lab3Q4
{
	public static void main (String[]args)
	{
		
	Scanner takeinput= new Scanner (System.in);
	
	int value;
	
	System.out.print ("Enter a five-digit number: ");
	value=takeinput.nextInt();
	
	int digit1=value/10000;
	value=value % 10000;
	
	int digit2=value/1000;
	value=value % 1000;
	
	int digit3=value/100;
	value=value % 100;
	
	int digit4=value/10;
	value=value % 10;
	
	int digit5=value/1;
	value=value % 1;
	
	System.out.print (digit1 + " " );
	System.out.print (digit2 + " " );
	System.out.print (digit3 + " " );
	System.out.print (digit4 + " " );
	System.out.print (digit5 + " " );
	
		
	}
	
}	