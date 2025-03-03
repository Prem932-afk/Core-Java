/*
   1.) patterns:

                      ****
                      ****
                      ****
                      **** 
while +for loop 
 */

 class patterns1
 {
    public static void main(String[] args) 
    { 
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=5; j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        } 
         
    }
 }
 /*   

 import java.util.Scanner;
 class AsteriskPattern 
 {
    public static void main(String[] args) 
    {
        int i = 0; // Outer loop counter for rows

        while (i < 4) 
        { 
            int j = 0; 
            while (j < 4) 
            { 
                System.out.print("*"); 
                j++;
            }
            System.out.println(); 
            i++;
        }
    }
}

  */