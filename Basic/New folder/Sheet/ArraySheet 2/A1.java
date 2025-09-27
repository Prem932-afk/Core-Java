//1. Bubble Sort

class A1
{
    public  static void main(String args[])
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

        for(int k=0; k<arr.length; k++)
        {
            System.out.println(arr[k]);
        }
    }
}