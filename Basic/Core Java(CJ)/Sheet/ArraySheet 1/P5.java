// Q.5  Reverse an array :
// Explanation: Reverse the order of elements in the array. This demonstrates array manipulation and swapping.

//   Input: arr = [1, 2, 3, 4]
//   Output: 4, 3, 2, 1
public class P5 
{
  public static void main(String[] args) 
  {
       int arr[]={1, 2, 3, 4};
       
       for(int i=arr.length-1; i>=0; i--)
       {
         System.out.println(arr[i]);
       }
  }    
}
