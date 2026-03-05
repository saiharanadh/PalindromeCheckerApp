import java.util.Stack;
import java.util.Scanner;

class PalindromeChecker {
    private String input;

    public PalindromeChecker(String input) {
        this.input = input;
    }

    public boolean checkPalindrome() {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        PalindromeChecker checker = new PalindromeChecker(word);
        boolean result = checker.checkPalindrome();

        System.out.println("Input: " + word);
        System.out.println("Is Palindrome?: " + result);

        sc.close();
    }
}