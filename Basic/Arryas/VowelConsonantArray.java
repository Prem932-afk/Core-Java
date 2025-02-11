public class VowelConsonantArray {

    // Function to check if the character is a vowel
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c); // Convert to lowercase for consistency
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }

    public static void main(String[] args) {
        // Example array of characters
        char[] arr = {'a', 'b', 'E', 'm', 'I', 'O', 'z'};

        // Loop through the array and check each character
        System.out.println("Character checks:");
        for (char ch : arr) {
            if (isVowel(ch)) {
                System.out.println(ch + " is a Vowel.");
            } else {
                System.out.println(ch + " is a Consonant.");
            }
        }
    }
}

