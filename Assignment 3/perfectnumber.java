import java.util.*;
class perfectnumber 
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = scan.nextInt();
        isPerfect(num);
    }    
    static void isPerfect(int num)
    {
        int sum = 0;
        for(int i = 1;i<=num/2;i++)
        {
            if(num % i == 0)
            {
                sum += i;
            }
        }
        if(sum == num)
        {
            System.out.println(num + " is a perfect number.");
        }
        else{
            System.out.println(num +" is not a perfect number.");
        }
    }
}
