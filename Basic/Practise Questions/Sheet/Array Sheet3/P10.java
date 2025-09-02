
// 10. Find the Product of Array Except Self: Write a program to find the product of all elements in an array except the current element.

// Input: arr = [1, 2, 3, 4]

// Output: 24 12 8 6

public class P10 
{
    public static void main(String args[]) 
    {
        int arr[] = {1, 2, 3, 4};
        int n = arr.length;

        for (int i = 0; i < n; i++) 
        {
            int product = 1;
            for (int j = 0; j < n; j++) 
            {
                if (i != j) 
                { // multiply all elements except arr[i]
                    product *= arr[j];
                }
            }
            System.out.print(product + " ");
        }
    }
}
