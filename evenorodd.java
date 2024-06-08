import java.util.*;
import java.util.Scanner;
class evenorodd
{
    public static void main(String [] args)
    {
        System.out.println("Enter any number : ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        evenodd(n);
    }
    public static void evenodd(int n)
    {
        if(n%2 == 0)
        {
            System.out.println(n +" Is Even number");
        }
        else
        {
            System.out.println(n +" Is Odd Number");
        }
    }
}
