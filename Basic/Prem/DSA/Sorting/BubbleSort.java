
class BubbleSort
{
    public static void main(String[] args) 
    {
        int arr[]={10,5,2,30,25};
        int temp=0;
         for(int i=0; i<arr.length; i++)
         {
              for(int j=0; j<arr.length-1-i; j++)
              {
                     if(arr[j] > arr[j+1])
                     {
                        temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                     }
              }
         }    

         for(int  k : arr)
         {
              System.out.println(k);
         }
    }
}