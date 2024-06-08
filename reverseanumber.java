import java.util.Scanner;
import java.util.*;

public class reverseanumber {
    public int reverse(int number) {
        int reversed = 0;
        while (number != 0) {
            int pop = number % 10;
            number = number / 10;
            reversed = reversed * 10 + pop;
        }
        return reversed;  // Add the return statement here
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to be reversed: ");
        int number = scan.nextInt();
        
        reverseanumber reverser = new reverseanumber();
        int reversedNumber = reverser.reverse(number);

        System.out.println(reversedNumber);
    }
}
