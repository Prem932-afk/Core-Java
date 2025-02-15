public class Assignment2to9 
{
        public static void main(String[] args) 
        {
            // Original array
            int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    
            // Print elements at odd indices
            System.out.println("Elements at odd indices: ");
            for (int i = 1; i < arr.length; i += 2) 
            {  // Start from index 1 and increment by 2
                System.out.print(arr[i] + " ");
            }
        }
       
}
