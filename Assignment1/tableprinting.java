import java.util.Scanner;
class tableprinting
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter which number multiple you want : ");
        int num = scan.nextInt();
        System.out.print("Upto which number you need multiples : ");
        int numbers = scan.nextInt();
        table(num,numbers);
    }    
    public static void table (int num,int numbers)
    {
        for(int i = 1 ; i<=numbers ; i++)
        {
            int result = num * i;
            System.out.println(num + " * " + i + " = " + result);
        }
    }
}
