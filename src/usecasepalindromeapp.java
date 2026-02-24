import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class usecasepalindromeapp {

    public static void main(String[] args) {
        String word = "ablewasiereisawelba"; // longer string for timing

        // Measure Stack-based approach
        long startStack = System.nanoTime();
        boolean stackResult = checkWithStack(word);
        long endStack = System.nanoTime();
        long stackTime = endStack - startStack;

        // Measure Deque-based approach
        long startDeque = System.nanoTime();
        boolean dequeResult = checkWithDeque(word);
        long endDeque = System.nanoTime();
        long dequeTime = endDeque - startDeque;

        // Measure Two-pointer approach
        long startTwoPointer = System.nanoTime();
        boolean twoPointerResult = checkWithTwoPointer(word);
        long endTwoPointer = System.nanoTime();
        long twoPointerTime = endTwoPointer - startTwoPointer;

        // Display results
        System.out.println("Performance Comparison for: \"" + word + "\"");
        System.out.println("Stack Approach: " + stackResult + ", Time = " + stackTime + " ns");
        System.out.println("Deque Approach: " + dequeResult + ", Time = " + dequeTime + " ns");
        System.out.println("Two-Pointer Approach: " + twoPointerResult + ", Time = " + twoPointerTime + " ns");
    }

    // Stack-based palindrome check
    private static boolean checkWithStack(String word) {
        Stack<Character> stack = new Stack<>();
        for (char ch : word.toCharArray()) {
            stack.push(ch);
        }
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }
        return word.equals(reversed);
    }

    // Deque-based palindrome check
    private static boolean checkWithDeque(String word) {
        Deque<Character> deque = new LinkedList<>();
        for (char ch : word.toCharArray()) {
            deque.addLast(ch);
        }
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }

    // Two-pointer palindrome check
    private static boolean checkWithTwoPointer(String word) {
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