
// 10. Find the First and Last Occurrence of an Element in a Sorted Array :

// Given a sorted array, find the indices of the first and last occurrence of a target element.

// Input: arr = [1, 2, 2, 2, 3, 4], target = 2
// Output: First = 1, Last = 3
public class P10 
{
  public static void main(String[] args) 
  {
       int arr[]={1, 2, 2, 2, 3, 4};
       int target=2;

       int first = -1;
       int last = -1;

       for(int i=0; i<arr.length; i++)
       {
            if(arr[i] == target)
            {
                if(first == -1)  // first time found
                {
                    first = i;
                }
                last = i; // keep updating until last occurrence
            }
       }

       if(first == -1)
       {
            System.out.println("Element not found");
       }
       else
       {
            System.out.println("First = " + first + ", Last = " + last);
       }
  }    
}
