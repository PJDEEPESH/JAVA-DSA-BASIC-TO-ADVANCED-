
import java.util.*;
class  Asciivalueofstring
{
    public static void main(String [] args)
    {
        System.out.print("Enter the string for what you want the value of the ascii : ");
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        value(string);
    }
    public static void value(String string)
    {
        int score = 0;
        for(int i = 0;i<string.length();i++)
        {
            score = score + string.charAt(i);
        }
        System.out.print("The value of the string is = "+ score+".");
    }
}
