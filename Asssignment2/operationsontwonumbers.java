import java.util.*;
class operationsontwonumbers 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = scan.nextInt();
        System.out.print("Enter the secon number : ");
        int num2 = scan.nextInt();
        System.out.print("Enter the operator : ");
        String ch = scan.next();
        if(ch.equals("+"))
        {
            int sum = num1 + num2;
            System.out.println("the sum : "+sum);
        }
        else if(ch.equals("-"))
        {
            int dif = num1 - num2;
            System.out.println("The difference : "+dif);
        }
        else if(ch.equals( "*"))
        {
            int multiply = num1 * num2;
            System.out.println("The multliplication : "+multiply);
        }
        else if (ch.equals("/"))
        {
            int div = num1 / num2;
            System.out.println("The quoient : "+div);
        }
        
    }    
}
