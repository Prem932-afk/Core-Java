// 7. Merge Two Sorted Arrays :

// Merge two sorted arrays into one sorted array. The arrays are sorted in ascending order.

// Input: arr1 = [1, 4, 7], arr2 = [2, 5, 8]
// Output: [1, 2, 4, 5, 7, 8]
public class P7
{
    public static void main(String[] args) 
    {
        int[] arr1 = {1, 4, 7};
        int[] arr2 = {2, 5, 8};
        int n1 = arr1.length;
        int n2 = arr2.length;

        int[] result = new int[n1 + n2];
        int i = 0, j = 0, k = 0;

        // Use for loop to iterate through total size
        for (int x = 0; x < n1 + n2; x++) 
        {
            if (i < n1 && (j >= n2 || arr1[i] <= arr2[j])) 
            {
                result[k] = arr1[i];
                i++;
            } 
            else 
            {
                result[k] = arr2[j];
                j++;
            }
            k++;
        }

        // Print the result
        System.out.print("Merged array: ");
        for (int a = 0; a < result.length; a++) 
        {
            System.out.print(result[a] + " ");
        }
    }
}
