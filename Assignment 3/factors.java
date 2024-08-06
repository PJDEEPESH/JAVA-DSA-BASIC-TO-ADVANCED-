import java.util.*;
class factors 
{
    public static void main(String[] args) {
        
    
    System.out.println("Enter the number : ");
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    factors(num);
    }
    static void factors(int num)
    {
        for(int i = 1;i<=num;i++)
        {
            if(num % i == 0)
            {
                System.out.print(i + " ");
            }
        }
    }
}

