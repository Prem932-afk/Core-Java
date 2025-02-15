public class EvenElements 
{
    public static void main(String[] args) 
    {
        // Original array
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Variables to store the first and last even elements
        int firstEven = -1;
        int lastEven = -1;

        // Find the first even element
        for (int num : arr) 
        {
            if (num % 2 == 0) 
            {
                firstEven = num;
                break; // Break the loop once the first even number is found
            }
        }

        // Find the last even element
        for (int i = arr.length - 1; i >= 0; i--) 
        {
            if (arr[i] % 2 == 0) 
            {
                lastEven = arr[i];
                break; // Break the loop once the last even number is found
            }
        }

        // Output the first and last even elements
        System.out.println("First even element: " + firstEven);
        System.out.println("Last even element: " + lastEven);
    }
}
