import java.util.Scanner;
class PalindromeCheckerApp {
    public static void main (String[] args){
        System.out.println("WELCOME TO PALINDROME CHECKER management system");
        System.out.println("Version: 1.0");
        System.out.println("System initialized successfully.");


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check: ");
        String word = scanner.nextLine();
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }
        if (word.equalsIgnoreCase(reversed)) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }
        scanner.close();
    }
}