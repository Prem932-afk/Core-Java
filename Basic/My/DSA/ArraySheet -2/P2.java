public class P2 
{
  public static void main(String[] args) 
  {
      int arr[] = {-1, 2, -3, 4, -5, 6};

      int result[] = new int[arr.length];
      int index = 0;
      
      // First add all negative numbers
      for(int i = 0; i < arr.length; i++)
      {
          if(arr[i] < 0)
          {
               result[index++] = arr[i];
          }
      }

      // Then add all positive numbers
      for(int i = 0; i < arr.length; i++)
      {
          if(arr[i] > 0)
          {
               result[index++] = arr[i];
          }
      }

      // Print result array
      System.out.println("Rearranged array:");
      for(int k : result)
      {
        System.out.println(k);
      }
  }    
}
