// 7. Find All Triplets with Given Sum: Write a program to find all unique triplets in an array that add up to a specific target sum.

// Input: arr = [1, 2, -1, 0, -2, 1], target = 0

// Output: Triplets are: [-2, 1, 1], [-1, 0, 1]
public class P7
{
    public static void main(String[] args) 
    {
        int[] arr = {1, 2, -1, 0, -2, 1};
        int target = 0;

        System.out.println("Triplets are:");

        for (int i = 0; i < arr.length - 2; i++) 
        {
            for (int j = i + 1; j < arr.length - 1; j++) 
            {
                for (int k = j + 1; k < arr.length; k++) 
                {
                    if (arr[i] + arr[j] + arr[k] == target) 
                    {
                        System.out.println("[" + arr[i] + ", " + arr[j] + ", " + arr[k] + "]");
                    }
                }
            }
        }
    }
}
