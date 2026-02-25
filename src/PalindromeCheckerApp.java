import java.util.Scanner;
class PalindromeCheckerApp {
    public static void main (String[] args){
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
        scanner.close();
    }
}