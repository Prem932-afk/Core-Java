//  2. Find the sum of all elements in an array :

//  Explanation: Add all the elements of the array and return the total. Helps students understand loop traversal and addition.

//  Input: arr = [5, 10, 15]
//  Output: Sum: 30

public class P2 
{
  public static void main(String[] args) 
  {
       int arr[]={5, 10, 15};
       int sum=0;
       for(int i=0; i<=arr.length-1; i++)
       {
          sum=sum + arr[i];
       }
       System.out.println("Sum or array : " + sum);
  }   
}
