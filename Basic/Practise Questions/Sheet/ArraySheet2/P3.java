import java.util.Scanner;

public class P3
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        // Input elements
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }

        // Insertion Sort
        for (int i = 1; i < n; i++) 
        {
            int key = arr[i];   // take current element
            int j = i - 1;

            // Move elements that are greater than key
            while (j >= 0 && arr[j] > key) 
            {
                arr[j + 1] = arr[j];  // shift
                j--;
            }
            arr[j + 1] = key; // place key at correct position
        }

        // Print sorted array
        System.out.println("Sorted Array: ");
        for (int i = 0; i < n; i++) 
        {
            System.out.print(arr[i] + " ");
        }
    }
}
