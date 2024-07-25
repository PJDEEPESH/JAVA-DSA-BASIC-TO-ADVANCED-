import java.util.Scanner;

class leapyear 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the year : ");
        int n = scan.nextInt();
        leap(n);
    }
  //it has high time complexity compare to this it is a brute force method.
    // public static void leap(int n)
    // {
    //     if(n%4 == 0)
    //     {
    //         System.out.println(n + " is a leap year.");
    //     }
    //     else if(n%100 == 0 && n%400 == 0)
    //     {
    //         System.out.println(n + " is a leap year.");
    //     } 
    //     else
    //     {
    //         System.out.println(n + " is not a leap year.");
    //     }
    // }    
    public static void leap(int n)
    {
        if(n%4 == 0 || ( n%100 == 0 && n%400 == 0))
        {
            System.out.println(n + " is a leap year.");
        }
        else
        {
            System.out.println(n + " is not a leap year.");
        }
    }
}
