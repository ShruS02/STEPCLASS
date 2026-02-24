import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

// Main Application
public class usecasepalindromeapp {

    public static void main(String[] args) {
        String word = "radar";

        // Using Stack Strategy
        PalindromeStrategy stackStrategy = new StackStrategy();
        PalindromeService service1 = new PalindromeService(stackStrategy);
        System.out.println("Stack Strategy: " + word + " is " + (service1.isPalindrome(word) ? "a palindrome." : "not a palindrome."));

        // Using Deque Strategy
        PalindromeStrategy dequeStrategy = new DequeStrategy();
        PalindromeService service2 = new PalindromeService(dequeStrategy);
        System.out.println("Deque Strategy: " + word + " is " + (service2.isPalindrome(word) ? "a palindrome." : "not a palindrome."));
    }
}

// Strategy interface
interface PalindromeStrategy {
    boolean check(String word);
}

// Stack-based palindrome strategy
class StackStrategy implements PalindromeStrategy {
    public boolean check(String word) {
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
}

// Deque-based palindrome strategy
class DequeStrategy implements PalindromeStrategy {
    public boolean check(String word) {
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
}

// Palindrome Service using Strategy Pattern
class PalindromeService {
    private PalindromeStrategy strategy;

    public PalindromeService(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean isPalindrome(String word) {
        return strategy.check(word);
    }
}