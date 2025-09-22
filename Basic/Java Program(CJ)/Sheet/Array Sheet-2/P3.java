//1. Bubble Sort
public class P3
{
    public static void main(String[] args) 
    {
        int arr[] = {10, 25, 12, 40, 6};
        int temp = 0;

        for (int i = 0; i < arr.length - 1; i++) 
        {
            for (int j = 0; j < arr.length - i - 1; j++) 
            {
                if (arr[j] > arr[j + 1]) 
                {
                    temp = arr[j];
                    arr[j] = arr[j + 1]; 
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted array using Bubble Sort:");
        for (int k = 0; k < arr.length; k++) 
        {
            System.out.println(arr[k]);
        }
    }    
}
