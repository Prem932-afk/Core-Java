class Pattern2
{
    public static void main(String args[])
    {
        //First Way 

        // for(int i=1; i<=5; i++)
        // {
        //     for(int j=1; j<=i; j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println(" ");
        // }


        //Second Way

        // int i=1;
        // while(i<=5)
        // {
        //     int j=1;
        //     while(j<=i)
        //     {
        //         System.out.print("*");
        //         j++;
        //     }
        //     System.out.println(" ");
        //     i++;
        // }

        //Alphabatic Print  First Way

        // char ch='A';
        // for(int i=1; i<=5; i++)
        // {
        //     for(int j=1; j<=i; j++)
        //     {
        //         System.out.print(ch);
        //         ch++;
        //     }
        //     System.out.println(" ");
        // }

         //Alphabatic Print  Second Way

         char ch='A';
         for(int i=1; i<=5; i++)
         {
            for(int j=1; j<=i; j++)
            {
                System.out.print(ch);
            }
            System.out.println(" ");
         }
    }
}
