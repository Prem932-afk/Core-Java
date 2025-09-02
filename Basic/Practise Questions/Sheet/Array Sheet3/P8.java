
// 8. Find the Peak Element: Write a program to find a peak element in an array. A peak element is greater than its neighbors.

// Input: arr = [1, 3, 20, 4, 1]

// Output: Peak element is 20

public class P8 
{
    public static void main(String args[]) 
    {
        int arr[] = {1, 3, 20, 4, 1};
        int n = arr.length;
        int peak = -1;

        // check for peak
        for (int i = 0; i < n; i++) 
        {
            if (i == 0) 
            {
                // first element, compare with next
                if (arr[i] > arr[i + 1]) 
                {
                    peak = arr[i];
                    break;
                }
            } 
            else if (i == n - 1) 
            {
                // last element, compare with previous
                if (arr[i] > arr[i - 1]) 
                {
                    peak = arr[i];
                    break;
                }
            } 
            else 
            {
                // middle elements, compare with both neighbors
                if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) 
                {
                    peak = arr[i];
                    break;
                }
            }
        }

        System.out.println("Peak element is " + peak);
    }
}
