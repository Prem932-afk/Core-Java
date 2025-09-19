// 8. Find the average of all elements in an array :

// Explanation: Calculate the average by dividing the sum of elements by the number of elements.

// Input: arr = [2, 4, 6, 8]
// Output: Average: 5.0

public class P8 
{
   public static void main(String[] args) 
   {
         int arr[]={2,4,6,8};
         double average=0;
         int total=0;
         for(int i=0; i<arr.length; i++)
         {
             total=total + arr[i];
         }

          average= total/4;
          System.out.println("Average: " + average);
   }    
}
