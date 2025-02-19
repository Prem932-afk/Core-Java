public class Program3 
{
    public static void printn(int a[]) 
    {
        for(int i=0; i<a.length; i++)
        {
            System.out.println(a[i]+" ");
        }
        System.out.println();
    }
    public static void swap(int a[],int left, int right)
    {
        int temp=0;
        temp=a[left];
        a[left]=a[right];
        a[right]=temp;
    }
    
    public static void sortBiary(int a[])
    {
        int left=0;
        int right=a.length-1;
        while(a[left] < a[right])
        {
            if(a[left]==0)
            {
                left++;
            }
            if(a[right]==1)
            {
                right--;
            }
            if(a[left]==1 && a[right]==0)
			{
                //swap 
                swap(a,left,right);
                left++;
                right--;
            }

        }
        printn(a);
    }
    public static void main(String arg[])
    {
        int a[]={1,0,0,1,0,1,0,1};
        sortBiary(a);
        
    }
}
