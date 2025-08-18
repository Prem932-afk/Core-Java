//Q.5  Sort an Array of Negative and Positive Numbers ?

public class A5 
{
    public static void main(String args[])
    {
         int arr[] = {-1, 2, -3, 4, -5, 6};

         int result[]=new int[arr.length];

         int index=0;

         for(int i=0; i<arr.length; i++)
         {
            if(arr[i]<0)
            {
                result[index++]=arr[i];
            }
         }

         for(int i=0; i<arr.length; i++)
         {
            if(arr[i]>0)
            {
                result[index++]=arr[i];
            }
         }

         for(int k=0; k<arr.length; k++)
         {
            System.out.println(result[k]);
         }
    }
}
