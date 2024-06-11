import java.util.*;
class countdigitsinanumber 
{
    public static void main(String[] args)
    {
        System.out.print("Enter the number : ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        count(n);
    } 
    public static void count(int n)
    {
        int count = 0;
        while(n>0)
        {
            n = n/10;
            count++;
        }
        System.out.print("The number of digits in the number is : "+count);
    }
}
