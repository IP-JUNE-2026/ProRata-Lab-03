import java.util.Scanner;
public class IT24102666Lab3Q3 {
	public static void main(String[] args) {
		int amountInRupees;
		int ot_Hours;
		int notes_5000;
		int notes_1000;
		int notes_500;
		int notes_100;
		int notes_50;
		int notes_20;
		int notes_10;
		int notes_5;
		int notes_2;
		int notes_1;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("\nEnter the Rupee Amount: ");
		amountInRupees = scanner.nextInt();
		
		notes_5000 = amountInRupees / 5000;
		amountInRupees = amountInRupees % 5000;

		notes_1000 = amountInRupees / 1000;
		amountInRupees = amountInRupees % 1000;
		
		notes_500 = amountInRupees / 500;
		amountInRupees = amountInRupees % 500;
		
		notes_100 = amountInRupees / 100;
		amountInRupees = amountInRupees % 100;

		notes_50 = amountInRupees / 50;
		amountInRupees = amountInRupees % 50;

		notes_20 = amountInRupees / 20;
		amountInRupees = amountInRupees % 20;

		notes_10 = amountInRupees / 10;
		amountInRupees = amountInRupees % 10;

		notes_5 = amountInRupees / 5;
		amountInRupees = amountInRupees % 5;

		notes_2 = amountInRupees / 2;
		amountInRupees = amountInRupees % 2;

		notes_1 = amountInRupees / 1;
		amountInRupees = amountInRupees % 1;
		
		System.out.println("\nNumber of 5000 Notes: " + notes_5000 + "\n");

		System.out.println("Number of 1000 Notes: " + notes_1000 + "\n");

		System.out.println("Number of 500 Notes: " + notes_500 + "\n");

		System.out.println("Number of 100 Notes: " + notes_100 + "\n");

		System.out.println("Number of 50 Notes: " + notes_50 + "\n");

		System.out.println("Number of 10 Notes: " + notes_10 + "\n");

		System.out.println("Number of 5 Notes: " + notes_5 + "\n");

		System.out.println("Number of 2 Notes: " + notes_2 + "\n");

		System.out.println("Number of 1 Notes: " + notes_1 + "\n");

		scanner.close();

		}

}