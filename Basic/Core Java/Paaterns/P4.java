public class P4 
{
   public static void main(String[] args) 
   {
    //   for(int i=5; i>=1; i--)
    //   {
    //     for(int j=1; j<=i; j++)
    //     {
    //         System.out.print("*");
    //     }
    //     System.out.println("");
    //   } 
    int i=5;
    while(i>=1)
    {
        int j=1;
        while(j<=i)
        {
            System.out.print("*");
            j++;
        }
        System.out.println();
        i--;
    }
   }    
}
