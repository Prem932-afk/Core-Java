public class Program7
{
  public static void main(String[] args) 
  {
    int[] arr = {12, 67, 46, 435, 67, 385, 33, 335, 34, 23};

    int result[]=new int[arr.length]; 

    for (int i = 0; i < arr.length; i++) 
    {
         result[i]= arr[i];
    }

      if (arr[5] != 23) 
      {
        result[5] = 23;
      }
      if (arr[6] != 34) 
      {
        result[6] = 34;
      }

      if (arr[7] != 335) 
      {
        result[7] = 335;
      }

      if (arr[8] != 33) 
      {
        result[8] = 33;
      }

      if (arr[9] != 385) 
      {
        result[9] = 385;
      }

      System.out.println("Reordered arry");
      for(int num :result)
      {
         System.out.println(num);
      }
  }    
}
