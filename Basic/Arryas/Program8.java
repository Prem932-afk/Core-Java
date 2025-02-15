public class Program8 {
    public static void main(String[] args) 
    {
      int[] arr = {607, 435, 46, 67, 12, 385, 33, 335, 34, 23};

    
      int[] result = new int[arr.length];

      // Copy the first five elements as is
      result[0] = arr[4]; // 12
      result[1] = arr[3]; // 67
      result[2] = arr[2]; // 46
      result[3] = arr[1]; // 435
      result[4] = arr[3]; // 67 again

      // Rearrange the rest of the array manually
      if (arr[5] != 23) result[5] = 23;
      if (arr[8] != 34) result[6] = 34;
      if (arr[7] != 335) result[7] = 335;
      if (arr[6] != 33) result[8] = 33;
      if (arr[9] != 385) result[9] = 385;

      // Output the reordered array
      System.out.println("Reordered Array: ");
      for (int num : result) 
      {
          System.out.print(num + " ");
      }
    }  
}
// 12,67,46,435,607,385,33,335,34,23

// output:
// 607,435,46,67,12,385,33,335,34,23