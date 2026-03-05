import java.util.Scanner;
import java.util.Stack;
public class PalindromeCheckerApp {

    public static boolean check(String input) {

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

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input Level");
        String input = sc.nextLine();

        long start = System.nanoTime();

        boolean result = check(input);

        long end = System.nanoTime();
        long time = end - start;

        System.out.println("Is Palindrome " + result);
        System.out.println("Execution Time " + time);

        sc.close();
    }
}