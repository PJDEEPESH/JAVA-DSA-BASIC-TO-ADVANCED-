import java.util.*;
import java.util.Scanner;
class primenumber 
{
    public static void main(String[] args)
    {
        System.out.print("Enter number you want to check wheather it is prime or not : ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        isprime(n);
    }    
    public static void isprime(int n )
    {
        if(n<=1)
        {
            System.out.print(n + " is not a prime number.");
            return;
        }
        for(int i = 2 ; i*i<=n ; i++)
        {
            if(n % i == 0)
            {
                System.out.println(n + " is not a prime number.");
                return;
            }
            
        }
        System.out.println(n + " is a prime number.");
        
    }
}
