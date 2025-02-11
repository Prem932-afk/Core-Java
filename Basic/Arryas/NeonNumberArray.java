public class NeonNumberArray {
    
    // Function to check if a number is a Neon number
    public static boolean isNeon(int num) {
        int square = num * num;
        int sum = 0;
        
        // Sum the digits of the square of the number
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        
        // Check if sum of digits of the square equals the original number
        return sum == num;
    }

    public static void main(String[] args) {
        // Example array of numbers
        int[] arr = {9, 45, 10, 12, 81};
        
        System.out.println("Neon numbers in the array:");
        
        // Loop through the array and check for Neon numbers
        for (int num : arr) {
            if (isNeon(num)) {
                System.out.println(num);
            }
        }
    }
}

