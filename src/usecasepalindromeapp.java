public class usecasepalindromeapp {

    public static void main(String[] args) {
        // Hardcoded string with mixed case and spaces
        String word = "A man a plan a canal Panama";

        // Normalize string: remove spaces and convert to lowercase
        String normalized = word.replaceAll("\\s+", "").toLowerCase();

        // Check palindrome using two-pointer approach
        boolean isPalindrome = true;
        int left = 0;
        int right = normalized.length() - 1;

        while (left < right) {
            if (normalized.charAt(left) != normalized.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println("\"" + word + "\" is a palindrome (ignoring spaces and case).");
        } else {
            System.out.println("\"" + word + "\" is not a palindrome (ignoring spaces and case).");
        }
    }
}