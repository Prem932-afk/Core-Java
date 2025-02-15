public class Assignment2to7 
{
  public static void main(String[] args) 
  {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    int temp=arr[0];
    arr[0]=arr[arr.length-1];
    arr[arr.length-1]=temp;

    for(int second : arr)
    {
         System.out.println(second);
    }
  }    
}
