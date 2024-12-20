
 class Patterns8 
 {
  public static void main(String[] args) 
  {
    int n=6;
    // for(int i=1; i<=5;i++)
    // {
    //     for(int s=1; s<=i-1;s++)
    //     {
    //         System.out.print(" ");
    //     }
    //     for(int j=1;j<=n-i;j++)
    //     {
    //         System.out.print("*");
    //     }
    //     System.out.println(" ");
    // }
    int i=1;
    while(i<=5)
    {
        int s=1;
        while(s<=i-1)
        {
            System.out.print(" ");
            s++;
        }
        int j=1;
        while(j<=n-i)
        {
            System.out.print("*");
            j++;
        }
        System.out.println(" ");
        i++;
    }
  }   
}
/*
     ***** 
      **** 
       *** 
        **
         *
 */