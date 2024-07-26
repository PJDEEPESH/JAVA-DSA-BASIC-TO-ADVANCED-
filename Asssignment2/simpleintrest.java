import java.util.*;
class simpleintrest 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the principal amount : ");
        int p = scan.nextInt();
        System.out.println("Enter the rate of intrest in percentage : ");
        int r = scan.nextInt();
        System.out.print("Enter time period in year : ");
        int t = scan.nextInt();
        int si = (p * r * t)/100;
        System.out.print("Simple intrest : "+si); 
    }    
}
