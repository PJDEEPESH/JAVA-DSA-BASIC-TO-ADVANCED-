import java.util.*;
class largestnumbers
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1 = scan.nextInt();
        System.out.println("Enter the second number : ");
        int num2 = scan.nextInt();
        if(num1>num2)
        {
            System.out.println(num1 + " is larger number.");
        }
        else if(num1==num2)
        {
            System.out.println("Both are equal.");
        }
        else 
        {
            System.out.println(num2 +" is smaller number.");
        }

    }    
}
