// 4. Find the smallest element in an array :

// Explanation: Similar to finding the largest element, but track the minimum value instead.

// Input: arr = [8, 6, 3, 1, 9]
// Output: Smallest: 1
public class A4 
{
  public static void main(String[] args) 
  {
     int arr[]={8, 6, 3, 1, 9};
     int Smallest=arr[0];
     
     for(int i=0; i<arr.length; i++)
     {
        if(arr[i]<Smallest)
        {
            Smallest=arr[i];
        }
     }
     System.out.println("Smallest Element : " + Smallest);
  }    
}
