//2.Selection Sort :
//                 -> Selection sort is a comparison-based sorting algorithm that repeatedly finds the minimum (or maximum) element from the unsorted portion and moves it to the sorted portion.


public class P2
{
    public static void main(String[] args) 
    {
        int arr[] = {10, 25, 12, 40, 6};
        int temp;

        for (int i = 0; i < arr.length - 1; i++) 
        {
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) 
            {
                if (arr[j] < arr[minIndex]) 
                {
                    minIndex = j;
                }
            }

          
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        System.out.println("Sorted array using Selection Sort:");
        for (int k = 0; k < arr.length; k++) 
        {
            System.out.println(arr[k]);
        }
    }    
}
