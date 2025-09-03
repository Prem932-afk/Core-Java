// 6.  Kadane’s Algorithm (Maximum Subarray Sum): Write a program to find the maximum sum of a subarray (contiguous elements) in an array.

// Input: arr = [-2, 1, -3, 4, -1, 2, 1, -5, 4]

// Output: Maximum sum of subarray is 6

public class P6 
{
    public static void main(String[] args) 
    {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = 0; // start with 0 for simplicity
        int currentSum = 0;

        for (int i = 0; i < arr.length; i++) 
        {
            currentSum += arr[i];

            if (currentSum > maxSum) 
            {
                maxSum = currentSum; // update maxSum
            }

            if (currentSum < 0) 
            {
                currentSum = 0; // reset currentSum if it becomes negative
            }
        }

        System.out.println("Maximum sum of subarray is " + maxSum);
    }
}
