import java.util.*;
class swappingthreenumbers 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number 1 :");
        int a = scan.nextInt();
        System.out.println("Enter number 2 :");
        int b = scan.nextInt();
        System.out.println("Enter number 3 :");
        int c = scan.nextInt();
        swapthree(a,b,c);
    }
    public static void swapthree(int a,int b,int c)
    {
        int temp = a;
        a = c;
        c = b;
        b = temp;
        System.out.println("a : "+a+ " b : "+b+ " c : "+c);
    }
}
