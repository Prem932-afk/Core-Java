
// 4.  Write a program to find the subarray (contiguous elements) in an array.

// Input : arr = [1,2,3,4]
// Output : 1, 1 2, 1 2 3, 1 2 3 4, 2, 2 3, 2 3 4, 3, 3 4, 4
public class  P4
{
    public static void main(String[] args) 
    {
        int[] arr = {1, 2, 3, 4};

        System.out.println("Subarrays:");
        for (int start = 0; start < arr.length; start++) 
        {
            for (int end = start; end < arr.length; end++) 
            {
                for (int k = start; k <= end; k++) 
                {
                    System.out.print(arr[k] + " ");
                }
                System.out.print(", ");
            }
        }
    }
}
