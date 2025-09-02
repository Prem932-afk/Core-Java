// 7. Array with Elements as Powers of 2: Write a program to create an array where each element is the power of 2 starting from 2^0.

// Input: n = 5

// Output: 1 2 4 8 16
public class P7 
{
    public static void main(String args[]) 
    {
        int n = 5; // size of the array
        int arr[] = new int[n];

        arr[0] = 1; // 2^0 = 1
        for (int i = 1; i < n; i++) 
        {
            arr[i] = arr[i - 1] * 2; // multiply previous element by 2
        }

        // print array
        for (int i = 0; i < n; i++) 
        {
            System.out.print(arr[i] + " ");
        }
    }
}
