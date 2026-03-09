import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Palindrome Checker Management System\n" +
                "Version : 1.0\n" +
                "System initialized successfully.");
        System.out.print("Input text: ");
        String input = sc.next();
        int n = input.length()/2;
        boolean isPalindrome = true;
        for (int i = 0; i < input.length() / 2; i++) {

            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Is it a Palindrome? : " + isPalindrome);
        sc.close();
    }
}