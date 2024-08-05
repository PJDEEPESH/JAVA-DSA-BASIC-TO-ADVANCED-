import java.util.Arrays;

class variablearguments 
{
    public static void main(String args[])
    {
        fun(10,20,30,30,10,302,4023,240,429);
        fun1(10,20,11,12,12,13,13,32);
    }   
    static void fun(int ...a)
    {
        System.out.println(Arrays.toString(a));
    } 
    static void fun1(int a,int b,int ...c)
    {
        System.out.println(a + b + Arrays.toString(c));
    }
}
