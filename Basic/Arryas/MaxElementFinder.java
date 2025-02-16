import java.util.Scanner;

public class MaxElementFinder 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
     
        int[] arr = new int[size];
        
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) 
        {
            arr[i] = scanner.nextInt();
        }

    
        int max = arr[0]; // Start by assuming the first element is the largest
        for (int i = 1; i < size; i++) 
        {
            if (arr[i] > max) 
            {
                max = arr[i]; // Update the max if the current element is larger
            }
        }

        // Output the maximum element
        System.out.println("The maximum element in the array is: " + max);

        scanner.close();
    }
}
