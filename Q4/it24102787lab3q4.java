import java.util.Scanner;

public class it24102787lab3q4 {
    public static void main(String[] args) {
        int number, dig1, dig2, dig3, dig4, dig5;
        int mod, mod2, mod3, mod4;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 5-digit number:");
        number = input.nextInt();

        
        dig1 = number / 10000;
        mod = number % 10000;  

        
        dig2 = mod / 1000;
        mod2 = mod % 1000;     

        
        dig3 = mod2 / 100;
        mod3 = mod2 % 100;     

        
        dig4 = mod3 / 10;
        mod4 = mod3 % 10;      

        
        dig5 = mod4;

        
        System.out.println(dig1 + " " + dig2 + " " + dig3 + " " + dig4 + " " + dig5);

        input.close(); 
    }
}
