// Q.3  Find the largest element in an array :

//  Explanation: Compare each element of the array to track the maximum value. Teaches comparison logic.

//   Input: arr = [10, 20, 5, 8]
//   Output: Largest: 20

public class P3 
{
   public static void main(String[] args) 
   {
      int arr[]={10,20,5,8};

      int Largest=0;

      for(int i=0; i<arr.length; i++)
      {
        if(arr[i]>Largest)
        {
            Largest=arr[i];
        }
      }

      System.out.println("Largest Number of Array : " + Largest);
   }    
}
