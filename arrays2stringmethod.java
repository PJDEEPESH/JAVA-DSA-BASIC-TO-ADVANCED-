import java.util.Arrays;
import java.util.Scanner;

class arrays2stringmethod 
{
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int size = scan.nextInt();
        int [] arr = new int[size];
        for(int i = 0;i<size;i++)
        {
            arr[i] = scan.nextInt();
        }
        
       System.out.print(Arrays.toString(arr));
        
    }  
}
