class P8
{
    public static void main(String[] args) 
    {
        int arr[]={2, 4, 6, 8};
        int total=0;
        
        for(int i=0; i<arr.length; i++)
        {
            total=total + arr[i];
        }

        int average=total /4;
        System.out.println("Average Number : " + average);
    }
}