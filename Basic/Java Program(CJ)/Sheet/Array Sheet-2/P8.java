// 8. Binary Search : 

// Write a Program to Binary Search

// Input: arr = [5, 9, 11, 2], key = 11
// Output: Yes
import java.util.Scanner;

class P8 
{
    public static void main(String args[]) 
    {
        Search s = new Search();
        s.setdata();
        s.getdata();
    }
}

class Search 
{
    int arr[] = new int[4];
    int key;  // ✅ make key a class variable

    void setdata() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your elements:");
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Your array elements are:");
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("Enter the element to search:");
        key = sc.nextInt();

        // ✅ Sort array for binary search (bubble sort)
        for (int x = 0; x < arr.length - 1; x++) 
        {
            for (int y = 0; y < arr.length - 1 - x; y++) 
            {
                if (arr[y] > arr[y + 1]) 
                {
                    int temp = arr[y];
                    arr[y] = arr[y + 1];
                    arr[y + 1] = temp;
                }
            }
        }
    }

    void getdata() 
    {
        int i = 0;
        int j = arr.length - 1;
        int flag = 0;
        int pos = 0;

        while (i <= j && flag == 0) 
        {
            int mid = (i + j) / 2;

            if (arr[mid] == key) 
            {
                flag = 1;
                pos = mid + 1; // position (1-based index)
            } 
            else if (arr[mid] > key) 
            {
                j = mid - 1;
            } 
            else 
            {
                i = mid + 1;
            }
        }

        if (flag == 0) 
        {
            System.out.println("Not Found");
        } 
        else 
        {
            System.out.println("Number found at position: " + pos);
        }
    }
}
