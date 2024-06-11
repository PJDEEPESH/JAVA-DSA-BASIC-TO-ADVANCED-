import java.util.*;
import java.util.Scanner;
class Asciivalueprinting
{
    public static void main(String[] args)
    {
        System.out.print("Enter the char value you need to print : ");
        Scanner scan = new Scanner(System.in);
        char n = scan.next().charAt(0);
        value(n);
    }
    public static void value(char n)
    {
        int score = Math.abs(n);
        System.out.print(score);
    }

}
