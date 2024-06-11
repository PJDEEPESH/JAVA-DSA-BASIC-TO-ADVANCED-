import java.util.*;
class trianglepattrennumbers 
{
    public static void main(String[] args)
    {
        for(int i =1 ;i<=10;i++)
        {
            for(int j = 1;j<=10-i;j++)
            {
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++)
            {
                System.out.print(j);
            }
            for(int k = i-1;k > 0;k--)
            {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
