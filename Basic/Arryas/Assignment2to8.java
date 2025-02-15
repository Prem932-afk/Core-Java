public class Assignment2to8 
{
  public static void main(String[] args) 
  {
      int arr[]={1,2,3,4,5,6,7,8,9,10};
      
      int middle=arr.length/2;

      // Swap the first element with the middle element
      int temp1=arr[0];
      arr[0]=arr[middle];
      arr[middle]=temp1;

         // Swap the element at middle+1 with the last element

      int temp2=arr[middle+1];
      arr[middle+1]=arr[arr.length-1];
      arr[arr.length-1]=temp2;

      System.out.println("Array after swapping first with middle and middle+1 with last elements: ");
        for (int num : arr) 
        {
            System.out.print(num + " ");
        }




  }   
}
