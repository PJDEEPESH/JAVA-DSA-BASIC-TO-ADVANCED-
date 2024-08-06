import java.util.Scanner;

class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a character: ");
        
        // Corrected the syntax error: added a dot before charAt(0)
        char ch = scan.next().charAt(0);
        
        if (isVowel(ch)) {
            System.out.println(ch + " is a vowel.");
        } else if (Character.isLetter(ch)) { // Check if the character is a letter
            System.out.println(ch + " is a consonant.");
        } else {
            System.out.println(ch + " is not a valid alphabetic character.");
        }

        // Close the scanner
        scan.close();
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }
}

