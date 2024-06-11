import java.util.*;
class lphabetpattrenprint 
{
    public static void main(String[ ] args)
    {
        for(int i = 1 ;i<=9;i++)
        {
            for(int j = 1 ;j<=i+1;j++)
            {
                System.out.print(j);
            }
            for(char ch = (char)('A' + i - 1);ch>='A';ch--)
            {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
