class Pattern3
{
    public static void main(String args[])
    {
        //First Way 

        // for(int i=1; i>=5; i--)
        // {
        //     for(int j=1; j<=5; j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println(" ");
        // }


        //Second Way

        // int i=1;
        // while(i>=5)
        // {
        //     int j=1;
        //     while(j<=5)
        //     {
        //         System.out.print("*");
        //         j++;
        //     }
        //     System.out.println(" ");
        //     i--;
        // }

        //Alphabatic Print  First Way

        // char ch='A';
        // for(int i=1; i>=5; i--)
        // {
        //     for(int j=1; j<=5; j++)
        //     {
        //         System.out.print(ch);
        //         ch++;
        //     }
        //     System.out.println(" ");
        // }

         //Alphabatic Print  Second Way
         
         for(int i=1; i>=5; i--)
         {
            for(char ch='A'; ch<='E'; ch++)
            {
                System.out.print(ch);
            }
            System.out.println(" ");
         }
    }
}
