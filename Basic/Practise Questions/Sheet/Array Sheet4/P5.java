
// 5. Write a program to find the sum of a subarray (contiguous elements) in an array.

// Input : arr = [1,2,3,4]
// Output : 1, 3, 6, 10, 2, 5, 9, 3, 7, 4
public class P5 
{
    public static void main(String[] args) 
    {
        int[] arr = {1, 2, 3, 4};

        System.out.println("Sum of subarrays:");
        for (int start = 0; start < arr.length; start++) 
        {
            int sum = 0; // Initialize sum for each starting index
            for (int end = start; end < arr.length; end++) 
            {
                sum += arr[end]; // Add current element to sum
                System.out.print(sum + " ");
            }
        }
    }
}

