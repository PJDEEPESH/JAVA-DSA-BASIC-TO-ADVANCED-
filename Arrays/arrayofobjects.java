import java.util.*;
class arrayofobjects 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter how many names to enter : ");
        int size = scan.nextInt();
        String[ ] Names  = new String[size];
        for(int i = 0 ; i<size ; i++)
        {
            Names[i] = scan.next();
        }
        // for(String Obj : Names) //This is Enhanced For Loop
        // {
        //     System.out.print(Obj + " "); 
        // }
        System.out.print(Arrays.toString(Names));
    }    
}
