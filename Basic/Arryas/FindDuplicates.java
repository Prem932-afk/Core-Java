public class FindDuplicates {
    public static void main(String[] args) 
    {
       
        int[] arr = {1, 2, 3, 2, 1, 4, 6, 3, 2, 4};

        
        for (int i = 0; i < arr.length; i++) 
        {
           
            boolean isDuplicate = false;

            
            for (int j = i + 1; j < arr.length; j++) 
            {
                if (arr[i] == arr[j]) 
                {
                    System.out.println("Element: " + arr[i] + " | Indices: " + i + " " + j);
                    break;
                }
            }
        }
    }
}
