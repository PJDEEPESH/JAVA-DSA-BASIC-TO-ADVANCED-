import java.util.Scanner;

class LargestNumberUntilZero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int largestNumber = Integer.MIN_VALUE; // Initialize to the smallest possible integer value
        int number;

        while (true) {
            System.out.print("Enter a number or 0 to exit: ");
            number = scan.nextInt();

            if (number == 0) {
                break;
            }

            // Update the largest number
            if (number > largestNumber) {
                largestNumber = number;
            }
        }

        // Check if any number was entered (largestNumber would be Integer.MIN_VALUE if no number was entered)
        if (largestNumber == Integer.MIN_VALUE) {
            System.out.println("No numbers were entered.");
        } else {
            System.out.println("The largest number entered is: " + largestNumber);
        }

        // Close the scanner
        scan.close();
    }
}
