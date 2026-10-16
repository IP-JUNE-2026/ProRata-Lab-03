import java.util.Scanner;

public class IT23373648Lab3Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Enter a five digit number: ");
        number = input.nextInt();

        System.out.print(number / 10000 + " ");
        number = number % 10000;

        System.out.print(number / 1000 + " ");
        number = number % 1000;

        System.out.print(number / 100 + " ");
        number = number % 100;

        System.out.print(number / 10 + " ");
        number = number % 10;

        System.out.println(number);
    }
}