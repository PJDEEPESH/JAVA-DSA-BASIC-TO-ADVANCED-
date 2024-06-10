import java.util.*;
import java.util.Scanner;
class primenumberanothermethod 
{
    public static void main(String[ ] args)
    {
        System.out.print("Enter the number to check wheather it s prime : ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        isprime(n);
    }
    public static void isprime(int n)
    {
        int count = 0;
        for(int i = 1 ;i <= n ; i++)
        {
            if(n % i == 0)
            {
                count++;
            }
        }
        if(count == 2)
        {
            System.out.print("Prime");
        }
        else
        {
            System.out.print("Not Prime");
        }

    }
    
}
