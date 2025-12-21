// *****     // 12345   // 11111   // ABCDE  // AAAAA   // ABCDE
// *****     // 12345   // 22222   // ABCDE  // BBBBB   // FGHIJ
// *****     // 12345   // 33333   // ABCDE  // CCCCC   // KLMNO
// *****     // 12345   // 44444   // ABCDE  // DDDDD   // PQRST
// *****     // 12345   // 55555   // ABCDE  // EEEEE   // UVWXY

class P1
{
    public static void main(String args[])
    {
       for(int i=1; i<=5; i++)
       {
           for(int j=1; j<=5; j++)
           {
               System.out.print("*");
           }
           System.out.println(" ");
       }

       //................................................

       for(int i=1; i<=5; i++)
       {
         for(int j=1; j<=5; j++)
         {
             System.out.print(j);
         }
         System.out.println(" ");
       }

        //................................................

       for(int i=1; i<=5; i++)
       {
         for(int j=1; j<=5; j++)
         {
             System.out.print(i);
         }
         System.out.println(" ");
       }

        //................................................

       for(int i=1; i<=5; i++)
       {
         for(char ch='A'; ch<'E'; ch++)
         {
             System.out.print(ch);
         }
         System.out.println(" ");
       }

        //................................................

       for(char ch='A'; ch<='E'; ch++)
       {
         for(int j=1; j<=5; j++)
         {
             System.out.print(ch);
         }
         System.out.println(" ");
       }

        //................................................

       char ch='A';
       for(int i=0; i<=5; i++)
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