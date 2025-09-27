//1. Pattern one

class P1
{
    public static void main(String args[])
    {
        // for(int i=1; i<=5; i++)
        // {
        //     for(int j=1; j<=5; j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println(" ");
        // }

        //.......................While Loops..........................

        // int i=1;
        // while(i<=5)
        // {
        //     int j=1;
        //     while (j<=5) 
        //     {
        //         System.out.print("*");
        //         j++;
        //     }
        //     System.out.println(" ");
        //     i++;
        // }

        //.,,,,,,,,,,,,,,,................Alphabate................
        // for(int i=1; i<=5; i++)
        // {
        //     for(char ch='A'; ch<='E'; ch++)
        //     {
        //         System.out.print(ch);
        //     }
        //     System.out.println(" ");
        // }

         //.,,,,,,,,,,,,,,,................Alphabate- 2................
        // for(char ch='A'; ch<='E'; ch++)
        // {
        //     for(int j=1; j<=5; j++)
        //     {
        //         System.out.print(ch);
        //     }
        //     System.out.println(" ");
        // }

          //.,,,,,,,,,,,,,,,................Alphabate- 3................
       
        char ch='A';
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=5; j++)
            {
                System.out.print(ch);
                ch++;
            }
            System.out.println(" ");
        }


    }
}