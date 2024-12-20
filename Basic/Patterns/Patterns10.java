class Patterns10
{
     public static void main(String[] args) {
        int n=3;
        for(int i=1;i<=3;i++)
        {
           for(int s=1; s<=n-i;s++ )
           {
            System.out.print(" ");
           }
           for(int j=1; j<=i; j++)
           {
            System.out.print("*");
           }
           System.out.println(" ");
        }
        for(int i=1;i<=2;i++)
        {
           for(int s=1; s<=i;s++ )
           {
            System.out.print(" ");
           }
           for(int j=1; j<=n-i; j++)
           {
            System.out.print("*");
           }
           System.out.println(" ");
        }

     }    
}
/*
     *
    **
   ***
    **
     *
     
 */
