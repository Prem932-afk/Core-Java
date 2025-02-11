public class EvenNumberArray {

    // Function to calculate the sum of digits of a number
    public static int sumOfDigits(int num) {
        int sum = 0;
        
        // Sum each digit of the number
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        
        return sum;
    }

    public static void main(String[] args) {
        // Example array of numbers
        int[] arr = {123, 567, 453, 678, 876};
        
        System.out.println("Even numbers with their sum of digits:");

        // Loop through the array and check each number
        for (int num : arr) {
            if (num % 2 == 0) { // Check if the number is even
                int sum = sumOfDigits(num); // Calculate the sum of digits
                System.out.println(num + " => Sum of digits: " + sum);
            }
        }
    }
}

