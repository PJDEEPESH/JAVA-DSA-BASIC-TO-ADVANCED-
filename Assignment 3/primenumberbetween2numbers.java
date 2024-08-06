import java.util.*;
class primenumberbetween2numbers
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the start number : ");
        int start = scan.nextInt();
        System.out.print("Enter the end number : ");
        int end = scan.nextInt();
        List<Integer> primes = findprimeinrange(start,end);
        System.out.print("The primes numbers between "+start+" and "+end+" are : "+primes);


    }
    public static List<Integer> findprimeinrange(int start,int end)
    {
        List<Integer> primes = new ArrayList<>();
        if (start > end) {
            System.out.println("Invalid range. Start should be less than or equal to end.");
            return primes;
        }
        if (end < 2) 
            return primes; // No primes less than 2
        if (start < 2)  
            start = 2;
        for (int num = start; num <= end; num++) {
            if (isPrime(num)) {
                primes.add(num);
            }
        }

        return primes;
    
    }
    public static boolean isPrime(int num) {
        if (num <= 1) return false; // 0 and 1 are not prime numbers
        if (num == 2) return true; // 2 is a prime number
        if (num % 2 == 0) return false; // Other even numbers are not primes

        // Check for factors from 3 up to sqrt(num)
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }

}
