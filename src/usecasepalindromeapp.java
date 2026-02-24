public class usecasepalindromeapp {

    public static void main(String[] args) {
        // Hardcoded string to check
        String word = "racecar";

        // Check if palindrome using recursion
        boolean isPalindrome = isPalindromeRecursive(word, 0, word.length() - 1);

        // Display result
        if (isPalindrome) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }

    // Recursive method to check palindrome
    private static boolean isPalindromeRecursive(String str, int left, int right) {
        // Base condition: if pointers cross or meet
        if (left >= right) {
            return true;
        }

        // Compare characters at left and right
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }

        // Recursive call for inner substring
        return isPalindromeRecursive(str, left + 1, right - 1);
    }
}