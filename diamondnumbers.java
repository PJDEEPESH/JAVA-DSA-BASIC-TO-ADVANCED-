import java.util.*;
class diamondnumbers 
{
    public static void main(String[] args)
    {
        for(int i = 1;i<=10;i++)
        {
            for(int j = 1;j<=10-i;j++)
            {
                System.out.print(" ");
            }
            for(int j = 1;j<=i ;j++)
            {
                System.out.print(j);
            }
            for(int k = i-1;k>0;k--)
            {
                System.out.print(k);
            }
            System.out.println();
        }

        for(int i = 10-1;i>=1;i--)
        {
            for(int j = 10;j>i;j--)
            {
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++)
            {
                System.out.print(j);
            }
            for(int j = i-1 ;j>=1;j--)
            {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
