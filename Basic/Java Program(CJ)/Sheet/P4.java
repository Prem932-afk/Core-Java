// 4. Find the smallest element in an array :

// Explanation: Similar to finding the largest element, but track the minimum value instead.

// Input: arr = [8, 6, 3, 1, 9]
// Output: Smallest: 1
public class P4 
{
  public static void main(String[] args) 
  {
     int arr[]={8, 6, 3, 1, 9};
     int Smallest=arr[0];

     for(int i=0; i<=arr.length-1; i++)
     {
        if(arr[i]<Smallest)
        {
            Smallest=arr[i];
        }
     }
     System.out.println("Smallest Elements : " + Smallest);
  }    
}
