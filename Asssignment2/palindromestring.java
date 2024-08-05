import java.util.*;
class palindromestring 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string one : ");
        String name = scan.next();
        palindrome(name);

    }   
    static void palindrome(String name)
    {
        String name1 = name.toLowerCase(); //This is a line change the givent string into the lower case to not get any case sensitive errors.
        String reverse = "";
        for(int i = name1.length()-1;i>=0;i--)
        {
            reverse += name1.charAt(i);
        }
        if(reverse.equals(name1) )
        {
            System.out.print(name + " is a palindrome");
        }
        else{
            System.out.print(name + " is not a palindrome");
        }

    } 
}
