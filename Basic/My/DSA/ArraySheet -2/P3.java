public class P3 
{
   public static void main(String[] args) 
   {
        int arr[]={3, 8, 5, 2, 1, 4};   
        
        int result[]=new int[arr.length];

        int index=0;

        for(int i=0; i<arr.length; i++)
        {
              if(arr[i]%2==0)
              {
                 result[index++]=arr[i];
              }
        }

         for(int i=0; i<arr.length; i++)
        {
              if(arr[i]%2!=0)
              {
                 result[index++]=arr[i];
              }
        }

        for(int k : result)
        {
            System.out.println(k);
        }
   }    
}
