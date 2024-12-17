import java.util.Scanner;
class Patterns7 
{
 
    public static void main(String[] args) 
    {
           int n=5;
        // for(int i=1;i<=5;i++)
        // {
        //     for(int s=1;s<=n-i;s++)
        //     {
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=i;j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println(" ");
        // }
        int i=1;
        while(i<=5)
        {
            int s=1;
            while(s<=n-i)
            {
                System.out.print(" ");
                s++;
            }
            int j=1;
            while(j<=i)
            {
                System.out.print("*");
                j++;
            }
            System.out.println(" ");
            i++;
        }


    }    
}
