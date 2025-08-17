public class P4 
{
  public static void main(String[] args) 
  {
      int arr[]={8, 6, 3, 1, 9};  

      int smallest=arr[0];

      for(int i=0; i<arr.length; i++)
      {
          if(arr[i]<i)
          {
            smallest=arr[0];
          }
      }
      System.out.println("Smallest Element : "+ smallest);
  }    
}
