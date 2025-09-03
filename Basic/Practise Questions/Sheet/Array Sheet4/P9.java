// 9. Kth Smallest/Largest Element in an Unsorted Array :

// Find the kth smallest or largest element in an unsorted array.

// Input: arr = [12, 3, 5, 7, 19], k = 2
// Output: 5 (The second smallest element)
public class P9 
{
    public static void main(String[] args) 
    {
        int[] arr = {12, 3, 5, 7, 19};
        int k = 2;

        int kthSmallest = findKthSmallest(arr, k);
        System.out.println(k + "th smallest element is " + kthSmallest);
    }

    public static int findKthSmallest(int[] arr, int k) 
    {
        int n = arr.length;

        for (int i = 0; i < k; i++) 
        {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) 
            {
                if (arr[j] < arr[minIndex]) 
                {
                    minIndex = j;
                }
            }
            // Swap arr[i] and arr[minIndex]
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        return arr[k - 1];
    }
}
