import java.util.Scanner;
class SumCategories {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sumNegative = 0;
        int sumPositiveEven = 0;
        int sumPositiveOdd = 0;

        System.out.println("Enter numbers (0 to stop):");

        while (true) {
            int number = scanner.nextInt();

            // Check for termination condition
            if (number == 0) {
                break;
            }

            // Sum categories based on the number
            if (number < 0) {
                sumNegative += number;
            } else if (number % 2 == 0) {
                sumPositiveEven += number;
            } else {
                sumPositiveOdd += number;
            }
        }

        // Print results
        System.out.println("Sum of negative numbers: " + sumNegative);
        System.out.println("Sum of positive even numbers: " + sumPositiveEven);
        System.out.println("Sum of positive odd numbers: " + sumPositiveOdd);

        // Close the scanner
        scanner.close();
    }
}
