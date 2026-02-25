import java.util.Scanner;
class PalindromeCheckerApp {

    public static void main (String[]args) {
        //UC1
        System.out.println("WELCOME TO PALINDROME CHECKER management system");
        System.out.println("Version: 1.0");
        System.out.println("System initialized successfully.");

        //UC2
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check: ");
        String word = scanner.nextLine();

        boolean isPalindrome = true;

        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("Is Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        //UC3
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