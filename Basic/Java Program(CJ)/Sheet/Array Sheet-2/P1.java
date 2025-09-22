//1. Bubble Sort :
//                  -> Buuble sort It is a simple sorted method where we compare two side by side number in a list, and swap them if they are in wrong order. This continue until the list become sorted.


public class P1
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
