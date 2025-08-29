// Q.6  Count occurrences of a specific element : 
// Explanation: Count how many times a specific number (key) appears in the array. Useful for learning conditional statements and counters.

//  Input: arr = [2, 3, 3, 4, 3]
//  key = 3
//  Output: Occurrences of 3: 3
public class P6 
{
  public static void main(String[] args) 
  {
       int arr[]={2, 3, 3, 4, 3};

       int count=0;

       int key=3;
       
       for(int i=0; i<arr.length; i++)
       {
           if(arr[i]==key)
           {
               count++;
           }
       }

       System.out.println(key + ":" +  count);
  }    
}
