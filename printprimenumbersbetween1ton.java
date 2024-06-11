import java.util.*;
import java.util.Scanner;
class printprimenumbersbetween1ton
{
    public static boolean isprime(int n)
    {
        if(n<=1)
        {
            return false;
        }
        for(int i = 2;i*i<=n;i++)
        {
            if(n % i==0)
            {
                return false;
            }
        }   
        return true;

    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Upto which number you need prime numbers :");
        int n = scan.nextInt();
        System.out.print("Prime numbers between 1 to "+ n + " are :");
        for(int i = 1;i<=n;i++)
        {
            if(isprime(i))
            {
                System.out.print(i + " ");
            }
            
        }
    }
}