import java.util.Scanner;

class ArmstrongNumber3Digit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = scan.nextInt();
        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
        scan.close();
    }

    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        
        while (num > 0) {
            int n = num % 10;
            sum += n * n * n; 
            num = num / 10;
        }
        
        return originalNum == sum;
    }
}
