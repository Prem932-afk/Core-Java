public class P2 
{
    public static void main(String[] args) 
    {
        //1. way
    //  for(int i=1;i<=5;i++)
    // {
    //     for(int j=1;j<=i;j++)
    //     {
    //         System.out.print("*");
    //     }
    //     System.out.println(" ");
    // }

    //.................................................
   
         //2. way
        // int i = 0; // Outer loop counter for rows
        // while (i < 4) 
        // { 
        //     int j = 0; 
        //     while (j < i) 
        //     { 
        //         System.out.print("*"); 
        //         j++;
        //     }
        //     System.out.println(); 
        //     i++;
        // }

        //...........................................

         //3. Way
        // int n = 5;
        // for (int i = 1; i <= n; i++) 
        // {
        //     for (int j = 0; j < i; j++) 
        //     {
        //         System.out.print((char) ('A' + j) + " ");
        //     }
        //     System.out.println();
        // }

         //...........................................

            //4.way
        //  int n = 5;
        //  for (int i = 0; i < n; i++) 
        //  {
        //     char ch = (char) ('A' + i);
        //     for (int j = 0; j <= i; j++) 
        //     {
        //         System.out.print(ch + " ");
        //     }
        //     System.out.println();
        //  }

         //...........................................

           //5.way

        // int n = 5;
        // char ch = 'A';
        // for (int i = 1; i <= n; i++) 
        // {
        //     for (int j = 1; j <= i; j++) 
        //     {
        //         System.out.print(ch + " ");
        //         ch++;
        //     }
        //     System.out.println();
        // }
     
    }
}
