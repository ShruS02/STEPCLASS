public class usecasepalindromeapp  {

    public static void main(String[] args) {
        // Hardcoded string to check
        String word = "noon";

        // Create PalindromeChecker object
        PalindromeChecker checker = new PalindromeChecker(word);

        // Check if palindrome
        boolean isPalindrome = checker.checkPalindrome();

        // Display result
        if (isPalindrome) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}

// PalindromeChecker class encapsulates the logic
class PalindromeChecker {
    private String word;

    // Constructor
    public PalindromeChecker(String word) {
        this.word = word;
    }

    // Public method to check palindrome
    public boolean checkPalindrome() {
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}