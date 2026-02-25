import java.util.Scanner;
class PalindromeCheckerApp {

        public static void main (String[]args){
        System.out.println("WELCOME TO PALINDROME CHECKER management system");
        System.out.println("Version: 1.0");
        System.out.println("System initialized successfully.");


            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a string to check: ");
            String word = scanner.nextLine();

            for (int i = 0; i < word.length() / 2; i++) {

            if (word.charAt(i) != word.charAt(word.length() - 1 - j)) {
                System.out.println("IS palindrome");
                break;
            }
            }
            scanner.close();

        }
}