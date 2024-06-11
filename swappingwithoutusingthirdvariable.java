import java.util.*;
class swappingwithoutusingthirdvariable
{
    public static void main(String[] args)
    {
        int x = 10;
        int y = 20;
        System.out.print("Before swappiing x = "+x+" and y = "+y);

        x = x + y;
        y = x - y;
        x = x - y;
        System.out.print("After swappiing x = "+x+" and y = "+y);
    }
}
