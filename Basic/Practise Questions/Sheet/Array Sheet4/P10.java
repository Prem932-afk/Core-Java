// 10. Find Missing Number :

// Given an array of numbers from 1 to n with one number missing, find the missing number.

// Input: arr = [1, 2, 4, 6, 3]
// Output: 5 (The missing number is 5)
public class P10 
{
    public static void main(String[] args) 
    {
        int[] arr = {1, 2, 4, 6, 3};
        int n = arr.length + 1; // total numbers including missing one

        int totalSum = n * (n + 1) / 2; // sum of numbers from 1 to n
        int arrSum = 0;

        for (int num : arr) 
        {
            arrSum += num; // sum of array elements
        }

        int missingNumber = totalSum - arrSum;
        System.out.println("The missing number is " + missingNumber);
    }
}
