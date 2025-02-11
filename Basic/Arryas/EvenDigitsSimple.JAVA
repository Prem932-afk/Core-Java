public class EvenDigitsSimple {

    public static void main(String[] args) {
        // Example array of numbers
        int[] arr = {123, 8675, 6434, 7657, 8766};
        
        // Loop through the array
        for (int num : arr) {
            System.out.print(num + " => ");
            
            // Extract digits and check if they are even
            int temp = num;
            boolean foundEven = false;  // Flag to check if we found any even digits
            while (temp > 0) {
                int digit = temp % 10;
                if (digit % 2 == 0) {
                    System.out.print(digit);
                    foundEven = true;
                }
                temp /= 10;
            }
            
            if (!foundEven) {
                System.out.print("No even digits");
            }
            
            System.out.println();  // Move to the next line after each number
        }
    }
}

