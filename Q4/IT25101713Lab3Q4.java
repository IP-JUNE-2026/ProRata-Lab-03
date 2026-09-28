import java.util.Scanner;
public class IT25101713Lab3Q4{

	public static void main (String[] args){
	
		Scanner input = new Scanner(system.in);
		
		system.out.print("Enter a five-digit number: ");
		int number = input.nextInt();
		
		if (numberStr.length() !=5){
		System.out.println("Error: Please enter a valid five-digit number.");}
		else{
            
            for (int i = 0; i < numberStr.length(); i++) {
                System.out.print(numberStr.charAt(i));
                if (i < numberStr.length() - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
		}
	}
}