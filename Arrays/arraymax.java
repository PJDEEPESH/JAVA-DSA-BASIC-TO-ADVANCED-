import java.util.*;
class arraymax 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = scan.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elements : ");
        for(int i = 0;i<size;i++)
        {
            arr[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int maxx = max(arr);
        System.out.print("Maximum of this arrray : "+maxx);

        scan.close(); 
    }
    static int max(int[] arr)
    {

        int max = arr[0];
        for(int i = 0;i<arr.length;i++)
        {
        if(arr[i] > max)
        {
            max = arr[i];
        }
        
        }
        return max;
}

  


}
