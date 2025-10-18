//***** 
//***** 
//***** 
//***** 
//*****

class P1
{
    public static void main(String[] args) 
    {
        //Pattern 1.......................................

        // for(int i=1; i<=5; i++)
        // {
        //     for(int j=1; j<=5; j++)
        //     {
        //          System.out.print("*");
        //     }
        //     System.out.println(" ");
        // }    

        //Pattern 2.........................................

        // for(int i=1; i<=5; i++)
        // {
        //     for(int j=1; j<=5; j++)
        //     {
        //         System.out.print(i);
        //     }
        //     System.out.println(" ");
        // }

        //Pattern 3.........................................

        // for(int i=1; i<=5; i++)
        // {
        //     for(int j=1; j<=5; j++)
        //     {
        //         System.out.print(j);
        //     }
        //     System.out.println(" ");
        // }

        //Pattern 4.........................................

        // for(int i=1; i<=5; i++)
        // {
        //     for(char ch='A'; ch<='E'; ch++)
        //     {
        //         System.out.print(ch);
        //     }
        //     System.out.println(" ");
        // }

        //Pattern 5.........................................

        // for(char ch='A'; ch<='E'; ch++)
        // {
        //     for(int j=1; j<=5; j++)
        //     {
        //         System.out.print(ch);
        //     }
        //     System.out.println(" ");
        // }

        //Pattern 6.........................................

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