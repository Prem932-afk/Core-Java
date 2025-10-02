// Q.7  Check if an element exists in the array : 
// Explanation: Search for a specific number in the array and return "Yes" if found, otherwise "No".

//  Input: arr = [5, 9, 11, 2]
//  key = 11
//  Output: yes
public class P7 
{
  public static void main(String[] args) 
  {
      int arr[]={5, 9, 11, 2};
      
      int key=11;

      boolean found=false;

      for(int i=0; i<arr.length; i++)
      {
         if(arr[i]==key)
         {
            found=true;
            break;
         }
      }

      if(found==true)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
  }    
}
