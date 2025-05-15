class P2
{
  public static void main(String args[])
  {
    // for(int i=1; i<=5; i++)
    // {
    //     for(int j=1; j<=i; j++)
    //     {
    //         System.out.print("*");
    //     }
    //     System.out.println(" ");
    // }

    //-------------------Way 2
    //   char ch='A';
    //    for(int i=1; i<=5; i++)
    //    {
    //        for(int j=1; j<=i; j++)
    //        {
    //           System.out.print(ch);
    //           ch++;
    //        }
    //           System.out.println(" ");
    //    }

      //-------------------Way 3 
      int i=1;
      while(i<=5)
      {
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