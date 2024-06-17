import java.util.*;
class examinationmarks 
{
    private static int nextInt;
    public static void main(String[]  args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of students : ");
        int n = scan.nextInt();
        tell(n);
    }
    public static void tell(int n )
    {
        int count = 0;
        for(int i = 1;i<=n;i++)
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the marks of student "+i+ " : ");
            int studentmark = scan.nextInt();
            if (studentmark>=35)
            {
                count++;
            }
        }
        System.out.print(count+" students passed the exam.");
    }
}
