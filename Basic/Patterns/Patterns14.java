class patter
{
    public static void main(String args[])
    {
        int n=4;
        for(int i=1; i<=4; i++)
        {
            for(int s=1; s<=n-i; s++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=i*2-1; j++)
            {
                System.out.print(" *");
            }
            System.out.println(" ");
        }
        
    }
}