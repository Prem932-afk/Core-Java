// 7. Check if an element exists in the array :

// Explanation: Search for a specific number in the array and return "Yes" if found, otherwise "No".

// Input: arr = [5, 9, 11, 2], key = 11
// Output: Yes


public class P7 
{
         public static void main(String[] args) 
         {
            int arr[]={5,9,11,2};
            int key=11;
            for(int i=0; i<arr.length; i++)
            {
                 if(arr[i]==key)
                 {
                    System.out.println(" 'Yes' if found");
                    break;
                 }
            }   
            System.out.println("Sry this is not found");
         }
}
