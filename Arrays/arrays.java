import java.util.*;
class arrays 
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
        // for(int i = 0;i<arr.length;i++)
        // {
        //     System.out.print(arr[i] + " ");
        // }
        for(int num : arr)
        {
            System.out.print(num + " ");
        }
        
    }    
}
