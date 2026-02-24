public class usecasepalindromeapp {

    public static void main(String[] args) {
        // Hardcoded string to check
        String word = "level";

        // Convert string to character array
        char[] chars = word.toCharArray();

        // Two-pointer approach
        boolean isPalindrome = true;
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            if (chars[left] != chars[right]) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}