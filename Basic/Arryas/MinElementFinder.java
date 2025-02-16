import java.util.Scanner;

public class MinElementFinder 
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

        // Find the minimum element in the array
        int min = arr[0]; // Start by assuming the first element is the smallest
        for (int i = 1; i < size; i++) 
        {
            if (arr[i] < min) 
            {
                min = arr[i]; // Update the min if the current element is smaller
            }
        }

        // Output the minimum element
        System.out.println("The minimum element in the array is: " + min);

        scanner.close();
    }
}

