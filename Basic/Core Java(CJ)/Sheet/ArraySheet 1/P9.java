// // Q.9 Find the index of a specific element :
// Explanation: Search for a specific number in the array and return its index. If not found, return -1.

//  Input: arr = [1, 3, 5, 7]
//  key = 5
//  Output: Index: 2
public class P9 
{
    public static void main(String[] args) 
    {
        int arr[]={1, 2, 5, 7};
        
        int key=7;

        for(int i=0; i<arr.length; i++)
        {
             if(arr[i]==key)
             {
                System.out.println(i);
             }
        }
    }
}
