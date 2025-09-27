// Q.9 Find the index of a specific element :
// Explanation: Search for a specific number in the array and return its index. If not found, return -1.

//  Input: arr = [1, 3, 5, 7]
//  key = 5
//  Output: Index: 2


public class A9 
{
  public static void main(String[] args) 
  {
     int arr[]={1, 3, 5, 7};

     int key=5;

     int index=0;

     for(int i=0; i<arr.length; i++)
     {
        if(arr[i]==key)
        {
            index=i;
        }
     }
     System.out.println("Index Value : " + index);
  }    
}
