import java.util.*;
class swapvalueinarray
{
    public static void main(String[] args) {
        System.out.print("Enter the size of an array : ");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] array = new int[size];
        System.out.print("Enter the elements : ");
        for(int i = 0;i<size;i++)
        {
            array[i] = scan.nextInt();
        }
        System.out.print("Enter the index 1 : ");
        int index1 = scan.nextInt();
        System.out.print("Enter the index 2 : ");
        int index2 = scan.nextInt();
        System.out.println(Arrays.toString(array));
        swap(array,index1,index2);
        System.out.println(Arrays.toString(array));
        scan.close();
    }
        static void swap(int []array,int index1,int index2)
        {
            int temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
        }


    
}
