import java.util.Scanner;
public class IT22921130Lab3Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount: ");
        int amount = input.nextInt();
        int[] notes = {5000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        for (int n : notes) {
            int count = amount / n;
            System.out.println(n + " Notes – " + count);
            amount = amount % n;
			input.close();
        }
    }
}