// 8. Binary Search : 

// Write a Program to Binary Search

// Input: arr = [5, 9, 11, 2], key = 11
// Output: Yes

public class P9
{
    public static void main(String[] args) 
    {
        int[] arr = {5, 9, 11, 2};  // Input array
        int key = 11;               // Element to search

        // Step 1: Sort array using Bubble Sort
        bubbleSort(arr);

        // Step 2: Perform Binary Search
        boolean found = binarySearch(arr, key);

        // Step 3: Print result
        if (found) 
        {
            System.out.println("Yes");
        } 
        else 
        {
            System.out.println("No");
        }
    }

    // Bubble Sort function
    public static void bubbleSort(int[] arr) 
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) 
        {
            for (int j = 0; j < n - i - 1; j++) 
            {
                if (arr[j] > arr[j + 1]) 
                {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Binary Search function
    public static boolean binarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == key) {
                return true; // found
            } else if (arr[mid] < key) {
                left = mid + 1; // go right
            } else {
                right = mid - 1; // go left
            }
        }
        return false; // not found
    }
}
