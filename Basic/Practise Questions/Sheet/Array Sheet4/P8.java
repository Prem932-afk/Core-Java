// 8. Sort an Array of 0s, 1s, and 2s (Dutch National Flag Problem) :

// Given an array containing only 0s, 1s, and 2s, sort it without using any extra space.

// Input: [2, 0, 1, 1, 0, 2, 0]
// Output: [0, 0, 0, 1, 1, 2, 2]
public class P8 
{
    public static void main(String[] args) 
    {
        int[] arr = {2, 0, 1, 1, 0, 2, 0};
        int count0 = 0, count1 = 0, count2 = 0;

        // Count number of 0s, 1s, and 2s
        for (int num : arr) 
        {
            if (num == 0) count0++;
            else if (num == 1) count1++;
            else count2++;
        }

        // Fill the array with 0s, 1s, and 2s
        int index = 0;
        for (int i = 0; i < count0; i++) arr[index++] = 0;
        for (int i = 0; i < count1; i++) arr[index++] = 1;
        for (int i = 0; i < count2; i++) arr[index++] = 2;

        // Print sorted array
        System.out.print("Sorted array: ");
        for (int num : arr) 
        {
            System.out.print(num + " ");
        }
    }
}
