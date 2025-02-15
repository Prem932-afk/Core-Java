public class Program12 
{
    public static void main(String[] args) 
    {
      int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        
        System.out.println("Reordered Array: ");
        for (int i = 0; i < arr.length; i++) 
        {
            // Only print the elements that are not 7 and 9
            if (arr[i] != 7 && arr[i] != 9) 
            {
                System.out.print(arr[i] + " ");
            }
        }
    }  
}