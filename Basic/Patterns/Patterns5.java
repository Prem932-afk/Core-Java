
class Patterns5
{
    public static void main(String[] args) {
        // for(int i=1; i<=5; i++)
        // {
        //     for(int j=5;j>=1;j--)
        //     {
        //         System.out.print(j);
        //     }
        //     System.out.println(" ");
        // }
        int i=1;
        while(i<=5)
        {
            int j=5;
            while(j>=1)
            {
                System.out.print(j);
                j--;
            }
            System.out.println(" ");
            i++;
        }
    }
}
/*
       54321 
       54321 
       54321 
       54321 
       54321 
 */