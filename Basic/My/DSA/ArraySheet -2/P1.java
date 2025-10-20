//1. Bubble Sort
class P1
{
    public static void main(String args[])
    {
         int arr[] = {10, 25, 12, 40, 6};

         int temp=0;

         int swapcount=0;

         for(int i=0; i<arr.length-1; i++)
         {
            for(int j=0; j<arr.length-1-i; j++)
            {
                if(arr[j+1]<arr[j])
                {
                     temp=arr[j+1];
                     arr[j+1]=arr[j];
                     arr[j]=temp;
                     swapcount++;
                }
            }
         }
         System.out.println("Swap count : " + swapcount);
    }
}
