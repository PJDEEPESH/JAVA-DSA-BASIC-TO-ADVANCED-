import java.util.*;
class armstrong 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the armstrong number : ");
        int num = scan.nextInt();
        if(isArm(num))
        {
            System.out.println(num +" is a armstrong number.");
        }
        else
        {
            System.out.println(num + " is not a armstrong number.");
        }

    }    
    static boolean isArm(int num)
    {
        int original = num;
        int sum = 0;
        int digits = String.valueOf(num).length();
        while (num>0)
        {
        int digit = num % 10 ;
        sum += Math.pow(digit,digits);
        num /= 10;
    }
    return sum == original;
}
}
