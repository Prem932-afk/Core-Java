
// 9. Find Majority Element (Boyer-Moore Voting Algorithm): Write a program to find the majority element in an array (element that appears more than n/2 times).

// Input: arr = [3, 3, 4, 2, 4, 4, 2, 4, 4]

// Output: Majority Element: 4
public class P9 
{
    public static void main(String args[]) 
    {
        int arr[] = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        int n = arr.length;
        int majority = -1;

        for (int i = 0; i < n; i++) 
        {
            int count = 0;
            for (int j = 0; j < n; j++) 
            {
                if (arr[j] == arr[i]) 
                {
                    count++;
                }
            }
            if (count > n / 2) 
            {
                majority = arr[i];
                break;
            }
        }

        if (majority != -1)
        {
            System.out.println("Majority Element: " + majority);
        }
        else
        {
            System.out.println("No Majority Element");
        }
    }
}
