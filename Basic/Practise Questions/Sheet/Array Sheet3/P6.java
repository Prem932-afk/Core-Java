// 6. Array Rotation (Left): Write a program to rotate the elements of an array by k positions to the left.

// Input: arr = [1, 2, 3, 4, 5], k = 2
// Output: 3 4 5 1 2

public class P6 
{
    public static void main(String args[]) 
    {
        int arr[] = {1, 2, 3, 4, 5};
        int k = 2; // number of positions to rotate
        int n = arr.length;

        // temporary array to store result
        int temp[] = new int[n];

        // copy elements after k to front
        for (int i = 0; i < n - k; i++) 
        {
            temp[i] = arr[i + k];
        }

        // copy first k elements to the end
        for (int i = 0; i < k; i++) 
        {
            temp[n - k + i] = arr[i];
        }

        // print rotated array
        for (int i = 0; i < n; i++) 
        {
            System.out.print(temp[i] + " ");
        }
    }
}
