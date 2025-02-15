public class Program9 
{
  public static void main(String[] args) 
  {
   
    int[] arr = {12, 67, 46, 435, 607, 385, 33, 335, 34, 23};

   
    int[] result = new int[arr.length];

    
    result[0] = arr[4];  // 607
    result[1] = arr[3];  // 435
    result[2] = arr[2];  // 46
    result[3] = arr[1];  // 67
    result[4] = arr[0];  // 12
    result[5] = arr[9];  // 23
    result[6] = arr[8];  // 34
    result[7] = arr[7];  // 335
    result[8] = arr[6];  // 33
    result[9] = arr[5];  // 385

    
    System.out.println("Reordered Array: ");
    for (int num : result) 
    {
        System.out.print(num + " ");
    }
}

}
// output:
// 607,435,46,67,12,385,33,335,34,23