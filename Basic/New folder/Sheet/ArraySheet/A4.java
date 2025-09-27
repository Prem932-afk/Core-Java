//Q.4  Find the smallest element in an array :
// Explanation: Similar to finding the largest element, but track the minimum value instead.

//  Input: arr = [8, 6, 3, 1, 9]
//  Output: Smallest: 1
public class A4 
{
   public static void main(String[] args) 
   {
       int arr[]={8, 6, 3, 1, 9};
       
       int smallest=arr[0];

       for(int i=0; i<arr.length; i++)
       {
         if(arr[i]<smallest)
         {
            smallest=arr[i];
         }
       }
       System.out.println("Smalles Elment : " + smallest);
   }    
}
