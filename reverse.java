class ReverseInteger {

    public static int reverse(int x) {
        int reversed = 0;
        while (x != 0) {
            // Check for potential overflow before proceeding
            if (reversed > Integer.MAX_VALUE / 10 || reversed < Integer.MIN_VALUE / 10) {
                return 0; // Overflow detected
            }

            int digit = x % 10; // Get the last digit
            reversed = reversed * 10 + digit; // Shift and add
            x /= 10; // Remove the last digit
        }
        return reversed;
    }

    public static void main(String[] args) {
        // Test cases
        int num1 = 123;
        int num2 = -123;
        int num3 = 120;
        int num4 = 1534236469; // Overflow example

        System.out.println("Original: " + num1 + ", Reversed: " + reverse(num1)); 
        System.out.println("Original: " + num2 + ", Reversed: " + reverse(num2)); 
        System.out.println("Original: " + num3 + ", Reversed: " + reverse(num3)); 
        System.out.println("Original: " + num4 + ", Reversed: " + reverse(num4)); 
    }
}
