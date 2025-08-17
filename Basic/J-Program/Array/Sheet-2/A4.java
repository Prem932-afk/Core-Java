//1. Bubble Sort
public class A4 
{
    public static void main(String[] args) 
    {
        int arr[] = {10, 25, 12, 40, 6};
        int temp = 0;
        int swapcount=0;

        for (int i = 0; i < arr.length - 1; i++) 
        {
            for (int j = 0; j < arr.length - i - 1; j++) 
            {
                if (arr[j] > arr[j + 1]) 
                {
                    temp = arr[j];
                    arr[j] = arr[j + 1]; 
                    arr[j + 1] = temp;
                    swapcount++;
                }
            }
        }

        System.out.println("Total SwapCount :" + swapcount);
      
    }    
}
