import java.util.*;
import java.util.Scanner;
class evenorodd
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in); 
        System.out.println("Enter any number 1 : ");
        int x = scan.nextInt();
        System.out.println("Enter any number 2 : ");
        int y = scan.nextInt();
        int z = x + y;
        System.out.println("Sum of the numbers you entered "+ z);
        evenodd(z);
    }
    public static void evenodd(int n)
    {
        if(n%2 == 0)
        {
            System.out.println("The sum of the numbers you entered is even number ");
        }
        else
        {
            System.out.println("The sum of the numbers you entered is odd number");
        }
    }
}
