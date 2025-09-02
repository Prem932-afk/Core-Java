// 3. Union of Two Arrays: Write a program to find and print the union of two arrays.

// Input: arr1 = [1, 2, 3], arr2 = [3, 4, 5]
// Output: 1 2 3 4 5

public class P3 
{
    public static void main(String[] args) 
    {
        int arr1[] = {1, 2, 3};
        int arr2[] = {3, 4, 5};

        System.out.print("Union: ");

        // Print all elements of arr1
        for (int i = 0; i < arr1.length; i++) 
        {
            System.out.print(arr1[i] + " ");
        }

        // Print arr2 elements only if not already in arr1
        for (int i = 0; i < arr2.length; i++) 
        {
            if (arr2[i] != arr1[0] && arr2[i] != arr1[1] && arr2[i] != arr1[2]) 
            {
                System.out.print(arr2[i] + " ");
            }
        }
    }
}
