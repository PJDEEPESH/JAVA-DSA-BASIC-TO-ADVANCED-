import java.util.*;
class swapnumbers 
{
    public static void main(String[] args)
    {
        int x  = 10;
        int y = 20;
        System.out.print("before swaping x = "+x+ " and y = "+y );
        int temp = x;
        
        x = y;
        y = temp;
        System.out.print("After swaping x = "+x+ " and y = "+y );
    }    
}
