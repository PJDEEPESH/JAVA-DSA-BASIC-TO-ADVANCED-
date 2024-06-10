import java.util.*;
import java.util.Scanner;
class tablesprinting
{
    public static void main(String[] args)
    {
        System.out.print("Enter number which table u need : ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        table(n);
    }
    public static void table(int n)
    {
        for(int i = 1 ; i<=10 ; i++)
        {
            int result = n * i;
            System.out.println(n +" * " + i + " = " +result);
        }
    }
}