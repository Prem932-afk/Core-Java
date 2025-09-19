// 10. Copy elements from one array to another :

// Explanation: Copy all elements of one array into another. Helps students understand array initialization and traversal.

// Input: arr1 = [1, 2, 3]
// Output: arr2 = [1, 2, 3]
public class P10 
{
      public static void main(String[] args) 
      {
               int arr1[]={1,2,3};
               int arr2[]=new int[3];
               
               System.out.println("First Array Element : ");
               for(int i=0; i<arr1.length; i++)
               {
                  System.out.println(arr1[i]);
               }

              System.out.println("Second Array Element : ");
               for(int i=0; i<arr1.length; i++)
               {
                  arr2[i]=arr1[i];
                  System.out.println(arr2[i]);
               }
      }    
}
