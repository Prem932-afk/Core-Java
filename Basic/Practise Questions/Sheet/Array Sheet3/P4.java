// 4. Find the Smallest Missing Positive Integer: Write a program to find the smallest missing positive integer in an unsorted array of integers.

// Input: arr = [3, 4, -1, 1]
// Output: 2

public class P4 
{
    public static void main(String[] args) 
    {
        int arr[] = {3, 4, -1, 1};

        int n = arr.length;
        int smallest = 1; // Start checking from 1

        while (true) 
        {
            boolean found = false;

            // check if 'smallest' exists in array
            for (int i = 0; i < n; i++) 
            {
                if (arr[i] == smallest) 
                {
                    found = true;
                    break;
                }
            }

            // if not found → this is the answer
            if (!found) 
            {
                System.out.println("Smallest missing positive integer: " + smallest);
                break;
            }

            // otherwise check next number
            smallest++;
        }
    }
}
