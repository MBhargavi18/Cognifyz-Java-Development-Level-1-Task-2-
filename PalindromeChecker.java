import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word or phrase:");
        String input = scanner.nextLine();
        scanner.close();
        
        // Remove non-alphanumeric characters and convert to lower case
        String sanitizedInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Check if the sanitized string is a palindrome
        boolean isPalindrome = isPalindrome(sanitizedInput);
        
        // Output result
        if (isPalindrome) {
            System.out.println("The input is a palindrome.");
        } else {
            System.out.println("The input is not a palindrome.");
        }
    }

    // Function to check if a string is a palindrome
    private static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
