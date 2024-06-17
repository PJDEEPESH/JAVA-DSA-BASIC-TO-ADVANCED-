import java.util.*;
import java.util.Scanner;
class sumofthreenumbers 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter three numbers : ");
        int n = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();
        sum(n,n2,n3);
    }
    public static void sum(int n,int n2,int n3)
    {
        int sum = n + n2 + n3;
        System.out.print(sum);
    }

}
