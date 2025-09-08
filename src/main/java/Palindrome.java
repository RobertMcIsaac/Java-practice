public class Palindrome {
    public static void main(String[] args) {
        String word = "racecar";

        System.out.println(isPalindrome(word));

        System.out.println(isPalindromeAlt(word));

    }
    public static String isPalindrome(String word) {
        int start = 0;
        int end = word.length()-1;
        while (end>start) {
            if (word.charAt(start) == word.charAt(end)) {
                start ++;
                end --;
            } else {
                return word + " is not a palindrome";
            }
        }
        return word + " is a palindrome";
    }

    public static String isPalindromeAlt(String word) {
        String reversedWord = new StringBuilder(word).reverse().toString();
        if (word.equals(reversedWord)) {
            return word + " is a palindrome";
        } else {
            return word + " is not a palindrome";
        }
    }
}
