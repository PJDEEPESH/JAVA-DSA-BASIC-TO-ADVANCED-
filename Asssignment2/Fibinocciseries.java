import java.util.*;
class fibinocciseries1
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter no of elements : ");
        int n = scan.nextInt();
        int a = 0;
        int b = 1;
        int nextterm;
        for(int i = 1;i<=n;i++)
        {
            System.out.print(a + " ");
            nextterm = a + b;
            a = b;
            b = nextterm;
        }


    }    
}
