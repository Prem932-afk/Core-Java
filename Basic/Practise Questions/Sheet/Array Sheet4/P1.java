// 1.Find Pair with Given Sum: Write a program to find pair in an array whose sum equals a given target sum.

// Input: arr = [1, 4, 5, 3, 2], target = 6

// Output:(1, 5) (4, 2)
public class P1 
{
    public static void main(String[] args) 
    {
        int[] arr = {1, 4, 5, 3, 2};
        int target = 6;

        System.out.print("Output: ");
        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = i + 1; j < arr.length; j++) 
            {
                if (arr[i] + arr[j] == target) 
                {
                    System.out.print("(" + arr[i] + ", " + arr[j] + ") ");
                }
            }
        }
    }
}
