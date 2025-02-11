public class PalindromeArray {
    public static void main(String[] args) {
        // Initialize the array
        int[] arr = {123, 121, 567, 989, 678};

        // Check each element for palindrome
        for (int num : arr) {
            int original = num;
            int reversed = 0;

            // Reverse the number
            while (num != 0) {
                reversed = reversed * 10 + (num % 10);
                num /= 10;
            }

            // Check if the number is a palindrome
            if (original == reversed) {
                System.out.println(original + " is a palindrome.");
            } else {
                System.out.println(original + " is not a palindrome.");
            }
        }
    }
}

