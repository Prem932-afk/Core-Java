// 6. Sort an Array of Even and Odd Numbers :

// Sort an array such that all even numbers come before odd numbers without changing their relative order.

// Input: [3, 8, 5, 2, 1, 4]
// Output: [8, 2, 4, 3, 5, 1]

public class A6 
{
  public static void main(String[] args) 
  {
        int arr[]={3, 8, 5, 2, 1, 4};  

        int result[]=new int[arr.length];

        int index=0;

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]%2==0)
            {
                result[index++]=arr[i];
            }
        
        }

         for(int i=0; i<arr.length; i++)
        {
            if(arr[i]%2!=0)
            {
                result[index++]=arr[i];
            }
        
        }

        for(int k=0; k<arr.length; k++)
        {
            System.out.println(result[k]);
        }
  }    
}
