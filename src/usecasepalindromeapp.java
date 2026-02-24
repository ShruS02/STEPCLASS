import java.util.Deque;
import java.util.LinkedList;

public class usecasepalindromeapp {

    public static void main(String[] args) {
        // Hardcoded string to check
        String word = "civic";

        // Create a deque
        Deque<Character> deque = new LinkedList<>();

        // Insert all characters into deque
        for (int i = 0; i < word.length(); i++) {
            deque.addLast(word.charAt(i));
        }

        // Compare front and rear until deque is empty or mismatch found
        boolean isPalindrome = true;
        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();
            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if (isPalindrome) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}
