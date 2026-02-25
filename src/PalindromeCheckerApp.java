import java.util.Scanner;
class PalindromeCheckerApp {

    public static void main (String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check: ");
        String word = scanner.nextLine();

        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }
        if (word.equals(reversed)) {
            System.out.println("Is a Palindrome.");
        } else {
            System.out.println("NOT a Palindrome.");

        }

    }
}