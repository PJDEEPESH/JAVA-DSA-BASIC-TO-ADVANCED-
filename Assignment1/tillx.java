import java.util.Scanner;

class tillx {  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0; 

        while (true) {
            System.out.print("Enter a number (or 'x' to exit): ");
            String input = scanner.next();

            if (input.equalsIgnoreCase("x")) {
                break; 
            }

            try {
                int number = Integer.parseInt(input);
                sum += number;
                count++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number or 'x'.");
            }
        }
        if (count > 0) {
            System.out.println("Sum of all numbers: " + sum);
        } else {
            System.out.println("No valid numbers entered.");
        }
    }
}
