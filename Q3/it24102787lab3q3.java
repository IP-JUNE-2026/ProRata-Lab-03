import java.util.Scanner;

public class it24102787lab3q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Rupee amount: ");
        int amount = scanner.nextInt();

        int[] notes = {5000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        String[] noteNames = {"5000 Notes", "1000 Notes", "500 Notes", "200 Notes", "100 Notes", "50 Notes", "20 Notes", "10 Coins", "05 Coins", "02 Coins", "01 Coins"};

        for (int i = 0; i < notes.length; i++) {
            int count = amount / notes[i];
            amount %= notes[i];
            System.out.println(noteNames[i] + " " + count);
        }
    }
}
