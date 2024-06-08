import java.util.*;
import java.util.Scanner;
class evenoddanothermethod
{
    public static void main(String [] args)
    {
        System.out.print("Enter any number : ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        evenodd(n);
        
    }
    public static void evenodd(int n )
    {
        String output = (n % 2 == 0) ? "Even Number" : "Odd Number" ;
        System.out.println(n + " is a " + output);
    }
}
