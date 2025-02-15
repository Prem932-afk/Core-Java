public class SwapEvenIndexElements 
{
    public static void main(String[] args) 
    {
        // Original array
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Variables to store indices of first and last even numbers
        int firstEvenIndex = -1;
        int lastEvenIndex = -1;

        // Find the index of the first even element
        for (int i = 0; i < arr.length; i++)
         {
            if (arr[i] % 2 == 0) 
            {
                firstEvenIndex = i;
                break; // Break once the first even element is found
            }
        }

        // Find the index of the last even element
        for (int i = arr.length - 1; i >= 0; i--) 
        {
            if (arr[i] % 2 == 0) 
            {
                lastEvenIndex = i;
                break; // Break once the last even element is found
            }
        }

        // If both even indices are found, perform the swap
        if (firstEvenIndex != -1 && lastEvenIndex != -1) 
        {
            // Swap the elements
            int temp = arr[firstEvenIndex];
            arr[firstEvenIndex] = arr[lastEvenIndex];
            arr[lastEvenIndex] = temp;
        }

        // Output the array after the swap
        System.out.println("Array after swapping first and last even index elements: ");
        for (int num : arr) 
        {
            System.out.print(num + " ");
        }
    }
}
