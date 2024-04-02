package excerisse;

public class PalindromeCheck {

	public static void main(String[] args) {
		String input = "rad121dar"; // Input string to check for palindrome
		boolean isPalindrome = isPalindrome(input);
		if (isPalindrome) {
			System.out.println("The input string is a palindrome.");
		} else {
			System.out.println("The input string is not a palindrome.");
		}
	}

	public static boolean isPalindrome(String str) {
	
		String cleanedStr = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

		
		int left = 0;
		int right = str.length() - 1;

		while (left < right) {
			if (str.charAt(left) != str.charAt(right)) {
				return false; // If characters at left and right pointers do not match, it's not a palindrome
			}
			left++; 
			right--; 
		}

		return true; 
	}
}
