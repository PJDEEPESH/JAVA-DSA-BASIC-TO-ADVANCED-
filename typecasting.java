import java.util.Scanner;
class typecasting
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        // float to int 
        int num =(int)65.43f;
        System.out.println(num);
        //int to float
        float num2 = (int)33;
        System.out.println(num2);
        // int to char
        char ch = (int)98;
        System.out.println(ch);
        //char to int
        int num3 = (char)'a';
        System.out.println(num3);
    }
    
}
