import java.util.Scanner;
import java.util.Arrays;

class TwoDArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int rows = scan.nextInt();
        
        System.out.print("Enter the number of columns: ");
        int cols = scan.nextInt();

        int[][] array2d = new int[rows][cols];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array2d[i][j] = scan.nextInt();
            }
        }

        System.out.println("The 2D array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(Arrays.toString(array2d[i]));
            }
            System.out.println();
        }
        // for (int i = 0; i < rows; i++) {
        //     for (int j = 0; j < cols; j++) {
        //         System.out.print(array2d[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        scan.close();
    }
}
