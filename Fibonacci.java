import java.util.*;
import java.util.Scanner;
class fibonacciseries
{
      public static void main(String args[])
  {
        System.out.println("Enter upto which number u need : ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = 0;
        int b = 1;
        int nextterm;
        for(int i = 1;i<=n; i++)
          {
              System.out.print(a + ' ');
              nextterm = a + b;
              a = b ;
              b = nextterm;
          }
  }
}
