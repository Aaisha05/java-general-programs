import java.util.Scanner;

public class checkpal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("The entered string is a palindrome.");
        } else {
            System.out.println("The entered string is not a palindrome.");
        }

        scanner.close();
    }

    private static boolean isPalindrome(String str) {
        // Removing non-alphanumeric characters and converting to lowercase for case-insensitive comparison
        String cleanStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = cleanStr.length() - 1;

        while (left < right) {
            if (cleanStr.charAt(left) != cleanStr.charAt(right)) {
                return false; // Characters at symmetric positions don't match
            }
            left++;
            right--;
        }

        return true; // All characters matched, it's a palindrome
    }
}
