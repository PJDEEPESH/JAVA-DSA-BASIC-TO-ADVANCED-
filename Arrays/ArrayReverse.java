import java.util.*;
class ArrayReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = scan.nextInt();
        
        int[] originalArray = new int[size];
        System.out.print("Enter the elements in array: ");
        for (int i = 0; i < size; i++) {
            originalArray[i] = scan.nextInt();
        }

        System.out.println("Original Array: " + Arrays.toString(originalArray));
        int[] reversed = reverse(originalArray);
        System.out.println("Reversed Array: " + Arrays.toString(reversed));
        
        scan.close();
    }
    
    static int[] reverse(int[] originalArray) {
        int size = originalArray.length;
        int[] reversed = new int[size];
        for (int i = 0; i < size; i++) {
            reversed[i] = originalArray[size - 1 - i];
        }
        return reversed;
    }
}
