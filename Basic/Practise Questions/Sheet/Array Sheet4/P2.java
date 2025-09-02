// 2. Find the Missing Number in Array: Given an array of size n-1 with numbers from 1 to n, find the missing number.

// Input:
// arr = [1, 2, 4, 6, 3, 7, 8]

// Output:
// Missing Number: 5
public class P2 
{
    public static void main(String[] args) 
    {
        int[] arr = {1, 2, 4, 6, 3, 7, 8};
        int n = 8; // The numbers are from 1 to 8

        int total = n * (n + 1) / 2; // Sum of numbers from 1 to n
        int sum = 0;

        for (int num : arr) 
        {
            sum += num;
        }

        int missingNumber = total - sum;
        System.out.println("Missing Number: " + missingNumber);
    }
}

