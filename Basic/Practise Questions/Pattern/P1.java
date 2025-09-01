//pattern 1
class P1
{
    public static void main(String args[])
    {
      //1. way
    //   for(int i=1; i<=5; i++)
    //   {
    //      for(int j=1; j<=5; j++)
    //      {
    //         System.out.print("*");
    //      }
    //      System.out.println(" ");

    //.................................................
   
         //2. way
        //   int i=1;
        //   while(i<=5)
        //   {
        //     int j=1;
        //     while(j<=5)
        //     {
        //         System.out.print("*");
        //         j++;
        //     }
        //     System.out.println(" ");
        //     i++;
        //   } 

        //...........................................

         //3. Way
        // for (int i = 1; i <= 5; i++) 
        // {
        //     for (char ch = 'A'; ch <= 'E'; ch++) 
        //     {
        //         System.out.print(ch + " ");
        //     }
        //     System.out.println();
        // }

         //...........................................

           //4.way
        //   for (char ch = 'A'; ch <= 'E'; ch++) 
        //   {
        //     for (int j = 1; j <= 5; j++) 
        //     {
        //         System.out.print(ch + " ");
        //     }
        //     System.out.println();
        //  }

         //...........................................

           //5.way

        //    char ch = 'A';
        //   for (int i = 1; i <= 5; i++) 
        //   {
        //     for (int j = 1; j <= 5; j++) 
        //     {
        //         System.out.print(ch + " ");
        //         ch++;
        //     }
        //     System.out.println();
        //  }


      }
    
}