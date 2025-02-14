public class Methodthroughprint 
{
   public static void main(String[] args) 
   {
    int[] array1 = {1, 2, 3};
    int[] array2 = {4, 5, 6};
    int[] array3 = {7, 8, 9};
    int[] array4 = {10, 11, 12};
    int[] array5 = {13, 14, 15};

    printArray(array1);
    printArray(array2);
    printArray(array3);
    printArray(array4);
    printArray(array5);
    
   }    
   public static void printArray(int[] array) 
   {
    for (int num : array) 
    {
        System.out.print(num + " ");
    }
    System.out.println();  // Print a newline after each array
}
}
