import java.util.*;
public class reversepyramid
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter no of rows : ");
        int n = scan.nextInt();
        for(int i = n;i>=0;i--)
        {
            for(int j = 1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k = 1 ;k<=i * 2 -1;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
