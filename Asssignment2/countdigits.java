import java.util.*;

class countdigits 
{   
    public static void main(String[] args) 
    {
        System.out.print("Enter the number  : ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.print("Which digit repeated : ");
        int x = scan.nextInt();
        int count = 0;
        while(n>0)
        {
            int rema = n%10;
            if(x  == rema)
            {
                count++;
            }
            n /= 10;
        }
        System.out.print(x+ "is repeated by "+count+ " times.");
    }
    
}
