//1. Bubble Sort
class P1
{
    public static void main(String[] args) 
    {
       int arr[] = {10, 25, 12, 40, 6};
       
       int temp=0;
       
       for(int i=0; i<arr.length-1; i++)
       {
        for(int j=0; j<arr.length-1-i; j++)
         {
            if(arr[j]>arr[j+1])
            {
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
         }
        }

         System.out.println("After Sorting Array");

         for(int k=0; k<arr.length-1; k++ )
         {
            System.out.println(arr[k]);
         }
       
    }
}