import java.util.Scanner;
class greetingmessage 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the name : ");
        String name = scan.next();
        System.out.println("A warm wishes to y0u "+ name);
    }    
}
