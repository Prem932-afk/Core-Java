
// 2. Intersection of Two Arrays: Write a program to find and print the intersection of two arrays.

// Input: arr1 = [1, 2, 3, 4], arr2 = [3, 4, 5, 6]
// Output: 3 4

class P2 
{
    public static void main(String[] args) 
    {
        int arr1[] = {1, 2, 3, 4};
        int arr2[] = {3, 4, 5, 6};

        System.out.print("Intersection: ");
        for (int i = 0; i < arr1.length; i++) 
        {
            for (int j = 0; j < arr2.length; j++) 
            {
                if (arr1[i] == arr2[j]) 
                {
                    System.out.print(arr1[i] + " ");
                    break;  // avoid duplicate printing
                }
            }
        }
    }
}
