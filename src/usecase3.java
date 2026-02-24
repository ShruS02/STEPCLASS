public class usecase3 {

    public static void main(String[] args) {
        // Hardcoded string to check
        String word = "racecar";

        // Reverse the string using a loop
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i); // String concatenation
        }

        // Compare original and reversed strings
        if (word.equals(reversed)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}
