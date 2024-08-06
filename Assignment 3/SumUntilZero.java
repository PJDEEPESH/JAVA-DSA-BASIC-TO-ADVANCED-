import java.util.*;
class SumUntilZero
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int total = 0;
        int number;
        while(true)
        {
            System.out.println("Enter a number or 0 to exit : ");
            number = scan.nextInt();
            if(number == 0)
            {
                break;
            }
            total += number;
        }
        System.out.println("The sum of all entered numbers is: " + total);
    }
}
