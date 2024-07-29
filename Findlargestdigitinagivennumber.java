import java.util.*;
class Findlargestdigitinagivennumber 
{   
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = scan.nextInt();
        largestdigit(n);
    }
    public static void largestdigit(int n)
    {
        int largestdigit = 0;
        while (n>0)
        {
            int digit = n % 10;
            largestdigit = Math.max(largestdigit,digit);
            n = n / 10;
        }
        System.out.print("The largest digit in the given number is : "+ largestdigit);
    }
    
    
}
