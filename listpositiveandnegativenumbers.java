import java.util.*;
import java.util.Scanner;
class listpositiveandnegativenumbers 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the no of numbers : ");
        int n = scan.nextInt();
        countofnumbers(n);
    }
    public static void countofnumbers(int n)
    {
        int countpositive = 0;
        int countnegative = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter "+n+ "numbers : ");
        for(int i = 1;i<=n;i++)
        {
            int x = scan.nextInt();
            if(x>=0)
            {
                countpositive++;
            }
            else
            {
                countnegative++;
            }
        }
        System.out.println("count of positive numbers : "+countpositive);
        System.out.println("count of negative numbers : "+countnegative);


    }

}
