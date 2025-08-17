public class P6 
{
   public static void main(String[] args) 
   {
       int arr[]={2, 3, 3, 4, 3};
       
       int count=0;

       int key=2;

       for(int i=0; i<arr.length; i++)
       {
          if(key==arr[i])
          {
            count++;
          }
       }
       System.out.println("Count number : " + count);
   }    
}
