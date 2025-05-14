import java.nio.channels.Pipe.SourceChannel;

class Patterone
{
    public static void main(String args[])
    {
        // for(int i=1; i<=5; i++)
        // {
        //     for(int j=1; j<=5; j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.err.println(" ");
        // }

        //-------------------------------------------------
        // char ch='A';
        //  for(int i=1; i<=5; i++)
        // {
        //     for(int j=1; j<=5; j++)
        //     {
        //         System.out.print(ch);
        //         ch++;
        //     }
        //     System.err.println(" ");
        // }

        //--------------------------------------------------Wahile loop
         int i=1;
         while(i<=5)
         {
            int j=1;
            while(j<=5)
            {
                System.out.print("*");
                j++;
            }
            System.err.println(" ");
            i++;
         }
     
    }
}