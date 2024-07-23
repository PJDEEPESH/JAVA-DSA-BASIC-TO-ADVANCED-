import java.util.Scanner;
class pyramid 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int n = scan.nextInt();
        for(int i = 1 ;i <= n; i++)
        {
            for(int j = 1 ; j <= n-i ; j++)
            {
                System.out.print(" ");
            }
            for(int k = 1 ; k <= i * 2 - 1; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        

    }    
}
