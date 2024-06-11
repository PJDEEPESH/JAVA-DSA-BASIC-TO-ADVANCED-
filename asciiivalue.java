class Solution {

    public static int scoreOfString(String s) {
        int score = 0;
        for (int i = 1; i < s.length(); i++) {
            score += Math.abs(s.charAt(i)); 
            
        }
        return score;
    }

    public static void main(String[] args) {
        // Test cases:
        String str1 = "hello";
        String str2 = "za";

        int score1 = scoreOfString(str1);
        int score2 = scoreOfString(str2);

        System.out.println("Score for '" + str1 + "': " + score1);
        System.out.println("Score for '" + str2 + "': " + score2);
    }
}
