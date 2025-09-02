// 3. Find Longest Consecutive Subsequence: Write a program to find the length of the longest consecutive subsequence in an unsorted array.

// Input: arr = [100, 4, 200, 1, 3, 2]

// Output: 4


import java.util.Arrays;

public class P3 
{
    public static void main(String[] args) 
    {
        int[] arr = {100, 4, 200, 1, 3, 2};

        Arrays.sort(arr); // Sort the array first

        int longest = 1;
        int current = 1;

        for (int i = 1; i < arr.length; i++) 
        {
            // Skip duplicates
            if (arr[i] == arr[i - 1]) 
            {
                continue;
            }

            if (arr[i] == arr[i - 1] + 1) 
            {
                current++; // Increase current streak
            } 
            else 
            {
                current = 1; // Reset streak
            }

            if (current > longest) 
            {
                longest = current;
            }
        }

        System.out.println("Length of Longest Consecutive Subsequence: " + longest);
    }
}
