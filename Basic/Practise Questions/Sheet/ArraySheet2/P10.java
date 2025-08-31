// 9. Count the Occurrences of a Given Element in an Unsorted Array : 
// Write a program to count how many times a specific element occurs in an unsorted array. Input: arr = [1, 2, 3, 1, 2,1], target = 1 Output: 3
public class P10
{
    public static void main(String[] args) 
    {
        int[] arr = {1, 2, 3, 1, 2, 1};  // Input array
        int target = 1;                  // Element to count

        int count = 0;

        // Loop through array and count occurrences
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] == target) 
            {
                count++;
            }
        }

        // Print result
        System.out.println(count);
    }
}
